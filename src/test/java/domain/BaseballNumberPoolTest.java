package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaseballNumberPoolTest {
    @DisplayName("BaseballNamePool 을 이용하여 중복이 없는 3개의 숫자를 반환하는지 테스트")
    @Test
    void getNonDuplicateNumbersTest() {
        List<BaseballNumber> input = BaseballNumberPool.getNonDuplicateNumber();
        Set<BaseballNumber> expected = new HashSet<>(input);

        Assertions.assertThat(input.size()).isEqualTo(expected.size());
    }
}
