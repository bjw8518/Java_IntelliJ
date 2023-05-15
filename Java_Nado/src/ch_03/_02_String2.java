package ch_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I Like Java and Python and C."; //0부터 카운트
        //문자열 변환
        System.out.println(s.replace(" and ",",")); //and를 .로 변환
        System.out.println(s.substring(7)); //7번째부터(java부터)

        System.out.println(s.substring(s.indexOf("Java"))); //"Java"가 시작하는 위치부터, "."이 시작하는 위치 바로 앞까지
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));//시작위치부터 끝위치 직전까지 출력

        //공백제거
        s = "          I Love Java          ";
        System.out.println(s);
        System.out.println(s.trim()); //공백제거

        //문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1+s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2));











    }
}
