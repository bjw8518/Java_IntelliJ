package ch_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        //Dowhile
        int distance = 25;
        int move = 0;
        int height =2;

        while (move + height < distance){
            System.out.println("첨벙첨벙");
            System.out.println("현재 이동거리"+move);
            move+=3;
        }
        System.out.println("도착");

        System.out.println("-----반목문 #1-----");

        //키가 존나 큰사람
        move = 0;
        height = 25;
        while (move + height < distance){//참일때 실행하지만 distance랑 키가25라 거짓
            System.out.println("첨벙첨벙");
            System.out.println("현재 이동거리"+move);
            move+=3;
        }
        System.out.println("도착");

        System.out.println("-----반목문 #2-----");

        //Do while 반복문
        do {
            System.out.println("첨벙첨벙");
            System.out.println("현재 이동거리:"+move);
            move+=3;
        }while (move+height <distance);
            System.out.println("도착했습니다");
    }
}
