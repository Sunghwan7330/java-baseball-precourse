package baseball;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BaseballGameTest {

    @Test
    public void baseballGameInitTest() {
        BaseballGame game = new BaseballGame();
        assertThat(game.getNum()).isEqualTo(new int[3]);
    }

    @Test
    public void baseballGameRandomTest() {
        BaseballGame game = new BaseballGame();
        game.setRandomNumber();
        assertThat(game.getNum())
                .isNotEqualTo(new int[3])
                .doesNotContain(0);
    }

    @Test
    public void baseballGameSetNumBlankTest() {
        BaseballGame game = new BaseballGame();
        assertThatThrownBy(() -> game.setNumber(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("숫자가 아닌 값이 입력되었습니다 -> ");
    }

    @Test
    public void baseballGameSetNumStringTest() {
        BaseballGame game = new BaseballGame();
        assertThatThrownBy(() -> game.setNumber("aaa"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("숫자가 아닌 값이 입력되었습니다 -> aaa");
    }

    @Test
    public void baseballGameSetNum123Test() {
        BaseballGame game = new BaseballGame();
        assertThat(game.setNumber("123"))
                .isEqualTo(true);
        assertThat(game.getNum())
                .isEqualTo(new int[]{1, 2, 3});
    }
}
