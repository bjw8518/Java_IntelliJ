package ch_03;

import java.util.Locale;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I Like Java and Python and C."; //0부터 카운트
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length());

        //대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //포함 관계
        System.out.println(s.contains("Java")); //특정 문자열이 포함되면 true
        System.out.println(s.contains("C#")); //특정 문자열이 포함되지않으면 false
        System.out.println(s.indexOf("Java")); //위치정보 확인 7
        System.out.println(s.indexOf("C#")); //포함되지않으면 -1

        System.out.println(s.indexOf("and")); //처음 일치하는 위치정보
        System.out.println(s.lastIndexOf("and")); //마지막 일치하는 위치 정보

        System.out.println(s.startsWith("I Like")); //이문자열로 시작하면 true
        System.out.println(s.endsWith(".")); //이문자열로 끝나면 true





    }
}
