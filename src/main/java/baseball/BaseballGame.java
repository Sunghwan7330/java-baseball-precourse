package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

    private int parseStr2Int(String strnum) {
        int inputNum;
        try {
            inputNum = Integer.parseInt(strnum);
        } catch (Exception e) {
            String errStr = "숫자가 아닌 값이 입력되었습니다 -> " + strnum;
            throw new IllegalArgumentException(errStr);
        }
        return inputNum;
    }

    private boolean isVaildNumber(int number) {
        //TODO 입력값 범위체크 로직 추가 필요
        return true;
    }

    private int[] convertStr2IntArr(String strnum) {
        int res[] = new int[3];
        for (int i=0; i<res.length; i++)
            res[i] = strnum.charAt(i) - 0x30;

        return res;
    }

    private boolean setMemberNumber(int[] number) {
        for (int i=0; i<mNum.length; i++)
            mNum[i] = number[i];

        return true;
    }

    public boolean setNumber(String strnum) {
        int inputNum = parseStr2Int(strnum);
        isVaildNumber(inputNum);
        int arrnum[] = convertStr2IntArr(strnum);
        setMemberNumber(arrnum);

        return true;
    }

    public void printNum() {
        for (int i = 0; i < mNum.length; i++)
            System.out.print(mNum[i]);
        System.out.println();
    }
}
