package ch_07;

public class _01_class {
    public static void main(String[] args) {
        //  OOP : Object Oriented Programming (객체지향 프로그램)
        //  유지보수 유지
        //  높은 재사용성


        String modelName = "까망이";
        String resolution = "QHD";
        int price = 200000;
        String color = "Black";

        //새로운 제품을 개발
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 30000;
        String color2 = "white";

        //BlackBox라는 클래스로부터 bbox라는 객체 생성
        BlackBox bbox = new BlackBox();
        BlackBox bbox2 = new BlackBox();


    }
}
