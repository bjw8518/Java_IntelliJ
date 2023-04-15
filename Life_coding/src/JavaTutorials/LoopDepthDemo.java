package JavaTutorials;

public class LoopDepthDemo {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.println(i+""+j);
//            }
//
//        }
        //99
//        for (int i = 2; i <= 9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.println(i+"*"+j+"="+i*j);
//            }
//            System.out.println("");
//        }

        for (int i = 0; i < 5; i++) {  //바깥쪽for문이 세로
            for (int j = 0; j < 10; j++) {   //안쪽for문이 가로
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("==========================================");

        for (int i = 0; i < 5; i++) {   //0부터4까지 세로로 찍기
            for (int j = 0; j <= i; j++) {  //i에 +1씩 더하면서 찍음
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("==========================================");

        for (int i = 0; i < 3; i++) {   //세로
            for (int j = 0; j < 4; j++) {   //가로
                System.out.print("*");
            }
            System.out.println(""); //공백찍고 위로 올라감

        }
        System.out.println("==========================================");

        for(int i=0; i<5; i++) {
            for(int j=0; j<4; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
