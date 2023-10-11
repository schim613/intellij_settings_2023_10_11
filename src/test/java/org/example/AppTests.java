package org.example;

import static org.assertj.core.api.Assertions.assertThat; // 왜 쌤이 알려주신게 작동이 안되는거지? 그래들 어쩌고 추가했는디.. assertThat 기능을 직접 import해서 해결
import org.junit.jupiter.api.Test;

public class AppTests {
    @Test
    void t1() {
        assertThat(new App().plus(10, 20)).isEqualTo(30);
    }

    @Test
    void t2() {
        assertThat(new App().plus(20, 20)).isEqualTo(40);
    }
}
