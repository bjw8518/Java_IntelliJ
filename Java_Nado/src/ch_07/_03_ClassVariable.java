package ch_07;

public class _03_ClassVariable {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        //충돌감지
        System.out.println("-개발 전-");
        System.out.println(b1.modelName+"자동신고기능"+b1.canAutoReport);
        System.out.println(b2.modelName+"자동신고기능"+b2.canAutoReport);
        System.out.println("모든블랙박스의 기능"+BlackBox.canAutoReport);    //권장
        //클래스변수에 접근할때는 class명 . 통해서 접근하는것이 권장

        System.out.println("------------------------------------------");
        //기능개발
        BlackBox.canAutoReport = true;

        System.out.println("-개발 후-");
        System.out.println(b1.modelName+"자동신고기능"+b1.canAutoReport);
        System.out.println(b2.modelName+"자동신고기능"+b2.canAutoReport);
        System.out.println("모든블랙박스의 기능"+BlackBox.canAutoReport);
    }
}
