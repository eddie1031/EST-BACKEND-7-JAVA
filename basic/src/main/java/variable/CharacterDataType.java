package variable;

public class CharacterDataType {

    public static void main(String[] args) {

        // # 1-3. 문자 자료형
        // char (2byte)
        char a = 97;
        System.out.println(a); // a

        char A = 'A';
        System.out.println(A); // A

        char B = 'A' + 1;
        System.out.println(B); // B

        char b = 97 + 1;
        System.out.println(b); // b

        // unicode
        char letter1 = '\uC548';
        char letter2 = '\uB155';
        char letter3 = '\uD558';
        char letter4 = '\uC138';
        char letter5 = '\uC694';

        System.out.printf("%c%c%c%c%c\n",letter1,letter2,letter3,letter4,letter5); // 안녕하세요



    }

}
