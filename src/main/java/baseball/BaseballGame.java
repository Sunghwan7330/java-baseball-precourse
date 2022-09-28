package baseball;

import camp.nextstep.edu.missionutils.Randoms;

public class BaseballGame {
    private int mNum[];

    public BaseballGame() {
        mNum = new int[3];
    }

    public int[] getNum() {
        return mNum.clone();
    }

    public boolean setRandomNumber() {
        for (int i = 0; i < mNum.length; i++)
            mNum[i] = Randoms.pickNumberInRange(1, 9);

        return true;
    }

    public void printNum() {
        for (int i = 0; i < mNum.length; i++)
            System.out.print(mNum[i]);
        System.out.println();
    }

}
