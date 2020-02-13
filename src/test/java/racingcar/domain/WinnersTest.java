package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import racingcar.domain.car.Cars;

public class WinnersTest {
    @Test
    void 자동차들의_위치중_가장_큰_값을_반환() {
        Cars cars = new Cars("무늬,두강,코일,쿨라임", 1);
        Winners winners = new Winners(cars);
        assertThat(winners.findMaxLocation(cars)).isEqualTo(4);
    }
}
