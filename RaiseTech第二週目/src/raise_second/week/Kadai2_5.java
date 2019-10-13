package raise_second.week;

import java.util.ArrayList;
import java.util.List;

public class Kadai2_5 {
	//課題: String型のListかMapを作成して、その内容 をコンソール画面に表示
	/*public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        //listにデータ追加する
        list.add("apple");
        list.add("orange");
        list.add("melon");

        System.out.println(list.get(1));   // 0〜2まで指定範囲
    } */

	public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();

        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        list1.addAll(list2);  // addAllメソッドはあるリストに別のリストを追加する

        System.out.println(list1);
    }

}
