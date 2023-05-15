package ch_07;

public class BlackBox {

    String modelName;   //  모델명
    String resolution;  //  해상도
    int price ; //  가격
    String color;   //  색상
    //인스턴스 변수
    static boolean canAutoReport = false;   //클래명 .

    void autoReport(){
        if(canAutoReport){
            System.out.println("충돌이 감지되어 자동으로 신고합니다");
        }else {
            System.out.println("자동신고기능이 지원되지 않습니다");
        }
    }
    void insertMemoryCard(int capacity){
        System.out.println("메모리카드가 삽입됨");
        System.out.println("용량은"+capacity+"GB입니다");
    }

    int getVideoFileCount(int type){
        if (type == 1){
            return 9;
        }else if (type == 2){
            return 1;
        }
        return 10;
    }

    void record(boolean showDateTime,boolean showSpeed,int min){
        System.out.println("녹화를 시작합니다");
        if(showDateTime){
            System.out.println("영상에 날짜정보가 표시됩니다");
        }
        if(showSpeed){
            System.out.println("영상에 속도가 표시됩니다");
        }
        System.out.println("영상은 " + min+"분 단위로 기록됩니다");
    }
    void record(){
     record(true,true,10);
    }

}
