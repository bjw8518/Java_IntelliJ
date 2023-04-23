package ch_07;

public class _02_instanceVariables {
    public static void main(String[] args) {
        //처음만든 블랙박스
        BlackBox b1 = new BlackBox(); //객체생성
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "Black";

        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);

        System.out.println("====================");


        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        b2.resolution = "QHD";
        b2.price = 300000;
        b2.color = "White";

        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);
    }
}
