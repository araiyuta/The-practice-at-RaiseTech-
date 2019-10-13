package raise_second.week;

//例外
class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}
}

public class WorkplaceCommunication implements Communication{
	//フィールド宣言
	private String message;
	private boolean isWorkPlace;

	//コンストラクタ
	public WorkplaceCommunication(String message, boolean isWorkPlace) {
		this.message = message;
		this.isWorkPlace = isWorkPlace;
	}

	public String greet() {
		try {
			if(this.isWorkPlace == false) {
				throw new MyException("BOSS, Good morning!"); //独自の例外
			}
		} catch(MyException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("-- end --");
		}
		return message;

	}

}
