package ch_06;
//  메소드가 필요한 이유
//  중복제거
//메소드로 코드 간결화

public class _06_WhenToUse {
    public static int getPower(int num){
        return getPower(num,2);

    }


    //전달값 2개
    public static int getPower(int num,int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;    //  2 * 2
        }
        return result;
    }
    public static void main(String[] args) {
        //2의 2승을 구하기
        System.out.println(getPower(2,2));
        //전달값2,2
        //  3의 3승 구하기
        System.out.println(getPower(3,3));
        //전달값3,3
        //  4의 2승 구하기
        System.out.println(getPower(4,2));
        //전달값4,2
    }
}
