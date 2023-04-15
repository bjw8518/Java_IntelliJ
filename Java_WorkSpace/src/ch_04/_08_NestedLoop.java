//가로 = 행
//세로 = 열
package ch_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        //이중반복문
        for (int i = 0; i < 5; i++) {   //#1. 5되기전까지 ++되면서 반복 *****
            for (int j = 0; j < 5; j++) {   //#2. 5되기전까지 ++되면서 반복
                System.out.print("*");
            }
            System.out.println(""); //#3. 여기까지 실행되고 다시 #2로가서 반복
        }
        System.out.println("========================================================");
        //left stars
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("========================================================");
        //left stars
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) { //i <= i i랑 크거나같을때
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("========================================================");
        //right stars
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print("S");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");

            }
            System.out.println("");

        }
    }
}
