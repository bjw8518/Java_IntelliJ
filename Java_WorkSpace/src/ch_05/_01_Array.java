package ch_05;

public class _01_Array {
    public static void main(String[] args) {
        //배열 : 같은 자료형의 값 여러개를 지정하는 연속된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + "하나");
        System.out.println(coffeeRachel + "하나");
        System.out.println(coffeeChandler + "하나");
        System.out.println(coffeeMonica + "하나");
        System.out.println("주세요");

        System.out.println("========================================");
        //배열선언 첫번째 방법
        //String[] coffees = new String[4];   //크기 4에 해당하는 배열 생성

        //두번째 방법
        //String coffees[] = new String[4];   //크기 4에 해당하는 배열 생성
//        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        coffees[2] = 라떼;
//        coffees[3] = "카푸치노";

        //세번째 방법
        //String[] coffees =new String[]{"아메리카노","카페모카","라떼","카푸치노"};

        //네번째 방법
        String [] coffees = {"아메리카노","카페모카","라떼","카푸치노"};

        //커피주문
        System.out.println(coffees[0]+" 하나");
        System.out.println(coffees[1]+" 하나");
        coffees[2] = "에스프레소";   //coffees의 2인덱스 값 변경
        System.out.println(coffees[2]+" 하나");
        System.out.println(coffees[3]+" 하나");
        System.out.println("주세요");

        //다른자료형
        //1. int
        int[] i =new int[3];
        i[0] =1;
        i[1] =2;
        i[2] =3;
        //2. double

        double[] d = new double[] {11.1,22.2,33.3};
        boolean[] b = new boolean[] {true,false,true};





    }
}


