package ch_04;

public class _09_multipleTable {
    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i+" * " + j + " = "+ (i*j));
            }
            System.out.println("");
        }


        System.out.println("============================================");
        for (int i = 2; i <10; i++) {
            for (int j = 1; j <10; j++) {
                System.out.println(i+"*"+j+"="+(i*j));  //*연산부분은 괄호 해주는게 좋음
            }
            System.out.println("");
        }
    }
}
