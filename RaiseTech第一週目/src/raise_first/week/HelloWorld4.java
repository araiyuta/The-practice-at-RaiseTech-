package raise_first.week;

public class HelloWorld4 {
	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) {
			if (i % 10 == 3 || i % 3 == 0 ) {
        	System.out.println("アホ!");

			}
			else {
				System.out.println(i);

			}
		}
	}
}
