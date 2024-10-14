package collection.arrayList;

import java.util.ArrayList;

public class JavaUtilArrayListTests {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        System.out.println("배열에 값 추가");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        print(list);
        System.out.println();

        System.out.println("특정 인덱스에 값 추가");
        print(list);
        System.out.println("0번 인덱스에 5 추가");
        list.add(0, "5");
        print(list);

        System.out.println();

        System.out.println("특정 인덱스 값 삭제");
        print(list);
        System.out.println("1번 인덱스 삭제");
        list.remove(1);
        print(list);

        System.out.println();

        System.out.println("배열에 중복되는 값 5 추가");
        list.add("5");
        print(list);

        System.out.println("배열에 중복되는 값 5 삭제");
        list.remove("5");
        print(list);

        System.out.println();

        System.out.println("0번 인덱스의 값 꺼내오기");
        print(list);
        String value1 = list.get(0);
        System.out.println("value1 = " + value1);

    }

    static void print(ArrayList<String> arr) {

        for ( int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

}
