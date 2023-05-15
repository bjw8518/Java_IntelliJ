package ch_05;
//신발 사이즈는 250부터 295까지 5단위로 증가
//신발 사이즈 수는 총 10가지

//사이즈 250 (재고있음)
//사이즈 255 (재고있음)
public class _Quiz_05 {
    public static void main(String[] args) {
        int[] sizeAr = new int[10];
        for (int i = 0; i < sizeAr.length; i++) {
            sizeAr[i] = 250 +(5 * i);   //250부터 시작해서 5씩 늘어남
        }
        for (int size:
                sizeAr) {
            System.out.println("사이즈 ㅜ  "+size+" 재고있음");

        }
    }
}
