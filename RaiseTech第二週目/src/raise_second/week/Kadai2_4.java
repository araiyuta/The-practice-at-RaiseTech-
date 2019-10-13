package raise_second.week;

public class Kadai2_4 {
	public static void main(String[] args) {

		int number = 0; // この値が 0なら「偽」、 1なら「真」と出力される

		if (isZero(number)) {
			System.out.println("偽");
		}
		else {
			System.out.println("真");
		}
	}

	public static boolean isZero(int a) {
		return a == 0;
	}
}


/* public class kadai2_4 {
	public static void main(String[] args) {

		isZero(0);
		isZero(1);

	}
	public static void isZero(int a) {
		if (a == 0) {
			System.out.println("偽");
		}
		else {
			System.out.println("真");
		}
	}
}  */