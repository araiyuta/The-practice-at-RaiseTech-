package raise_second.week;

import java.util.HashMap;
import java.util.Map;

public class Kadai2_5_2 {

	public static void main(String[] args) {
        // Mapの宣言
        Map<String, String> map = new HashMap<>();

        // Mapにキーと値を格納
        map.put("key1", "orange");
        map.put("key2", "apple");
        map.put("key3", "melon");

        // Mapからデータを取得する
        System.out.println(map.get("key1"));
        System.out.println(map.get("key2"));
        System.out.println(map.get("key3"));
    }

}
