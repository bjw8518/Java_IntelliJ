package ch_06;
//메소드 오버로딩
public class _05_Overloading {
    //전달값이 한개(int)
    public static int getPower(int num){    //  int로 전달값을 줌
        int result = num*num;               //  이름은 같지만 전달값을 서로 다르게 줘서 자료형 또는 전달값의 갯수에 따라 실행됨
        return result;
    }

    //전달값이 한개(String)
    public static int getPower(String strNum){  //  String으로 전달값을 줌
        int number = Integer.parseInt(strNum);  //  이름은 같지만 전달값을 서로 다르게 줘서 자료형 또는 전달값의 갯수에 따라 실행됨
        return number * number;

    }
    //전달값이 두개(int)
    public static int getPower(int num, int exponent){
        int result=1;
        for (int i = 0; i < exponent; i++) {
            result = result*=num;
        }
        return result;
    }



    public static void main(String[] args) {
        //메소드 오버로딩
        //같은 이름의 메소드를 여러 번 선언
        //1. 전달값의 타입이 다르거나
        //2. 전달값의 갯수가 다르거나
        System.out.println(getPower(3));    //  3 * 3 = 9

        System.out.println(getPower("4"));  // 4 * 4 = 16

        System.out.println(getPower(3,3)); //  3 * 3 * 3 = 27
    }
}
