package baseball;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
}
