package ch_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.autoReport();//지원안됨
        BlackBox.canAutoReport = true;
        b1.autoReport();
        b1.insertMemoryCard(256);

        //일반영상 : 1

        //충돌감지영상 : 2
        int fileCount = b1.getVideoFileCount(1);
        System.out.println("일반주행 파일갯수 : "+fileCount);

        fileCount = b1.getVideoFileCount(2);
        System.out.println("충돌감지 파일갯수 : "+fileCount);

    }
}
