package ch_06;

public class _07_variableScope {
    public static void methodA(){
        //System.out.println(number);
        //System.out.println(result);
    }
    public static void methodB(){
        int result = 1; //  지역변수
    }

    //메인영역안에서 선언된 변수는 메인안에서만 쓸수있음
    public static void main(String[] args) {
        int number = 3;

        //메소드B에서 정의된 result는 쓸수없음
        //System.out.println(result);


        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //i는 for문 밖에서 쓸수없음
        int j =5;
        System.out.println(j);
    }

}
