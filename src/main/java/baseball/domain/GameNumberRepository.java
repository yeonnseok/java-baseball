package baseball.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 클래스 이름 : .java
 *
 * @author
 * @version 1.0
 * <p>
 * 날짜 : 2020/03/02
 */
public class GameNumberRepository {
	private static final int MIN_NUMBER = 1;
	private static final int MAX_NUMBER = 9;
	private static final List<GameNumber> gameNumberCache = new ArrayList<>();

	static {
		IntStream.rangeClosed(MIN_NUMBER, MAX_NUMBER)
				.mapToObj(GameNumber::new)
				.forEach(gameNumberCache::add);
	}

	public static List<GameNumber> createGameNumbers() {
		Collections.shuffle(gameNumberCache);
		return gameNumberCache.subList(0, 3);
	}

}
