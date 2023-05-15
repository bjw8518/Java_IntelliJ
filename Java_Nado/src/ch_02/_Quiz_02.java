package ch_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        //키가 115cm 이므로 탑승 불가능합니다
        //키가 121cm 이므로 탑승 가능합니다
        int height = 115; //변경가능
        int limit = 120;
        String result = (height >= limit) ? "탑승가능" : "탑승불가능";
        System.out.println("키가 " + height + "cm 이므로 " + result);
    }
}
