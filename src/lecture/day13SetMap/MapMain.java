package lecture.day13SetMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 	MAP : key, value 쌍으로 이루어진 집합(순서 X, key 중복 X)
 	 - HashMap
 	 - TreeMap
 */

public class MapMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // key : id, value : password
        Map<String, String> map1 = new HashMap<>();

        map1.put("aaa", "1111");
        map1.put("bbb", "2222");
        map1.put("ccc", "3333");
        map1.put("ddd", "4444");

        System.out.println("패스워드 변경서비스입니다");
        System.out.print("변경할 아이디를 입력하세요 : ");
        String id = sc.nextLine();

        if(!map1.containsKey(id) ) {
            System.out.println("입력하신 아이디 [" + id + "]는 존재하지 않습니다");
            System.out.println("서비스를 종료합니다");
            System.exit(0);
        }

        System.out.print("현재 패스워드를 입력하세요 : ");
        String password = sc.nextLine();

        if(!map1.get(id/*"aaa"*/).equals(password)) {
            System.out.println("패스워드가 올바르지 않습니다");
            System.out.println("서비스를 종료합니다");
            System.exit(0);
        }

        System.out.print("변경할 패스워드를 입력하세요 : ");
        String newPassword = sc.nextLine();
        map1.put(id, newPassword);
        System.out.println("패스워드를 변경하였습니다");

        System.out.println("< 전체 회원 목록 >");


        Set<Entry<String, String>> entry = map1.entrySet();

        Iterator<Entry<String, String>> ite = entry.iterator();
        while(ite.hasNext()) { //1
            Entry<String, String> e = ite.next();//2
            String key = e.getKey();//3
            String value = e.getValue();//4
            System.out.println("id : " + key + ", password : " + value);//5
        }

		for(Entry<String, String> e : entry) {
			System.out.println("id : " + e.getKey() + ", password : " + e.getValue());
		}

		Set<String> keys = map1.keySet();
		for(char a = 'a'; a < 'z'; a++) {

        }
		for(String key : keys) {
			System.out.println("id : " + key + ", password : " + map1.get(key));
		}
    }
}





