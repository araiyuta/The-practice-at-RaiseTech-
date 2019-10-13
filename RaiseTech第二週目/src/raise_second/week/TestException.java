package raise_second.week;

class MyExc extends Exception {
    public MyExc() {

    }

    public MyExc(String msg) {
        super(msg);
    }

    public MyExc(Throwable cause) {
        super(cause);
    }

    //指定された詳細メッセージおよび原因を使用して新規スロー可能オブジェクトを構築します。
    public MyExc(String msg, Throwable cause) {
    	super(msg, cause);
    }
}

public class TestException {
	public static void main(String[] args) {
        int result;
        result = div(5, 0);
        System.out.println("戻り値 = " + result);
    }

    public static int div(int num1, int num2) {
        try {
            try {
                if (num2 == 0) {
                    throw new MyExc("0で割ったときの例外を発生させる");  //例外が発生する場所
                }
            } catch (MyExc e) {
                throw new MyExc("独自クラスの例外発生", e);
            }

            int result = num1 / num2;
            return result;

        } catch (MyExc e) {
            e.printStackTrace();

            return 0;
        }
    }

}

