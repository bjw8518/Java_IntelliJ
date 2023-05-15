package ch_04;

public class _01_IF {
    public static void main(String[] args) {
        int hour = 15; //오전10시
        if(hour < 14){
            System.out.println("아이스아메리카노+1");
            System.out.println("샷추가");
            System.out.println("커피주문완료");
        }else{
            System.out.println("먹지말자");
        }

        hour = 10;
        boolean morningCoffe = false;
        //if(hour < 14 && morningCoffe == false){
        if(hour < 14 && !morningCoffe){ //논리 부정연산자
            System.out.println("아이스아메리카노"+1);
        }
        System.out.println("주문완료");

        //오후 2시 이후이거나 모닝커피를 마신경우?
        hour = 15;
        morningCoffe = true;
        if(hour >=14 || morningCoffe == true){
            System.out.println("아이스 아메리카노 (디카페인)");
        }
        System.out.println("주문완료#3");

        //
    }
}
