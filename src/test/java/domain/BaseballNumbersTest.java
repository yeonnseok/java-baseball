package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BaseballNumbersTest {
    private static Stream<List<BaseballNumber>> invalidBaseballNumbers() {
        return Stream.of(
                new ArrayList(Arrays.asList(
                        new BaseballNumber(1),
                        new BaseballNumber(2)
                )),
                new ArrayList(Arrays.asList(
                        new BaseballNumber(1),
                        new BaseballNumber(2),
                        new BaseballNumber(3),
                        new BaseballNumber(4)
                )),
                new ArrayList(Arrays.asList(
                        new BaseballNumber(1),
                        new BaseballNumber(2),
                        new BaseballNumber(2)
                ))
        );
    }

    @DisplayName("BaseballNumbers 를 유효하지 않은 값으로 생성할 때 예외 처리 테스트")
    @ParameterizedTest
    @MethodSource("invalidBaseballNumbers")
    void baseballNumbersConstructorTest(List<BaseballNumber> input) {
        Assertions.assertThatThrownBy(() -> {
            new BaseballNumbers(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
