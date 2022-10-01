package baseball;

import camp.nextstep.edu.missionutils.Console;

public class BaseballGameHandler {
    BaseballGame mBbGame;

    public BaseballGameHandler() {
        mBbGame = new BaseballGame();
        setNewGame();
    }

    public boolean setNewGame() {
        mBbGame.setRandomNumber();
        return true;
    }

    public boolean inputNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        String inputNum = Console.readLine();
        int res[] = mBbGame.inputCompareNumber(inputNum);
        int strike = res[0];
        int ball = res[1];
        printResult(strike, ball);
        if (!processThreeStrike(strike))
            return false;

        return true;
    }

    private boolean processThreeStrike(int strike) {
        if (strike != 3) return true;

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        int resNum = Integer.parseInt(Console.readLine());  //TODO 입력 정합성 검사 추가 필요
        if (resNum != 1) return false;

        setNewGame();
        return true;
    }

    private void printResult(int strike, int ball) {
        if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
            return;
        }
        if (ball != 0)
            System.out.print(ball + "볼 ");
        if (strike != 0)
            System.out.print(strike + "스트라이크");
        System.out.println();
    }
}
