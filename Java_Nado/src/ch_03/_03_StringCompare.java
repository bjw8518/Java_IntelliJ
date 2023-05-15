package ch_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";
        //문자열 내용이 같으면 True, 다르면 False
        System.out.println(s1.equals("Java"));
        //대소문자 구분없이 문자열 내용이 같으면 True
        System.out.println(s2.equalsIgnoreCase("python"));

        //문자열 비교 심화
        s1 = "1234"; //참조
        s2 = "1234";
        System.out.println(s1.equals((s2))); //true (내용)
        System.out.println(s1 == s2); //true (참조)

        s1 = new String("1234");
        s2 = new String("1234");

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); //false

        ////////////////////////////////////////////////
        //자바에서 문자열의 내용을 비교할때는 equals를 써야한다//
        ////////////////////////////////////////////////
    }
}

