package raise_second.week;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Kadai2_3 {
	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		LocalDateTime plusYears = now.plusYears(3);
		DayOfWeek threeYearsLater = plusYears.getDayOfWeek();
		System.out.println(threeYearsLater);

// 上記の省略形
		LocalDateTime d = LocalDateTime.now();
		System.out.println((d.plusYears(3)).getDayOfWeek());

// それか
//		LocalDateTime now = LocalDateTime.now();
//		LocalDateTime plusYears = now.withYear(2022);
//		DayOfWeek threeYearsLater = plusYears.getDayOfWeek();
//		System.out.println(threeYearsLater);

	}
}

