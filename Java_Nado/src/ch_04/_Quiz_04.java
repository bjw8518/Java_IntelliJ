package ch_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        //주차요금은 시간당 4000원(일일 최대요금은 30000원)
        //경차 또는 장애인 차량은 최종요금에서 50% 할인 (||) or연산자

        //일반차량 5시간 주차 시 20000원
        //경차 5시간 주차 시 10000원
        //장애인 차량 주차 시 15000원

        //실행결과 주차요금은 XX원입니다

        int parkHour = 5; //주차시간 5시간
        boolean light_car = false; //경차여부
        boolean disabledP = true;  //장애인여부

        int fee = parkHour * 4000;  //요금=주차시간*4000원

        //30000원 초과 시 일일 최대요금으로 수정
        if(fee > 30000){
            fee = 30000; //fee가 30000보다 크면 최대요금(3만원)으로 설정
        }
        //경차또는 장애인 50프로 할인
        if(light_car || disabledP){ //경차 || 장애인
            fee/=2; //fee = fee / 2; 50프로니까 2를 나눈다
        }
        //실행결과
        System.out.println("주차요금은"+fee+"입니다");

    }
}
