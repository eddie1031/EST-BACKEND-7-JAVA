import java.util.HashMap;
import java.util.Map;

public class StringSplitTests {

    public static void main(String[] args) {

        // 문자열 분리
        // 안녕하세요. 제 이름은 ㅇㅇㅇ 입니다. 저는 오르미 여러분들과 공부하고 있습니다.

//        String sentence = "안녕하세요. 제 이름은 ㅇㅇㅇ 입니다. 저는 오르미 여러분들과 공부하고 있습니다.";
//        String[] words = sentence.split(" ");
//
//        for ( int i = 0; i < words.length; i++ ) {
//            String word = words[i];
//            System.out.println("word = " + word);
//        }

        // MAP
        Map<String, String> map = new HashMap<>();

        map.put("1번","1");
        map.put("2번","2");
        map.put("3번","3");
        map.put("4번","4");

        String findValue = map.get("1");

        System.out.println("findValue = " + findValue);


    }

}
