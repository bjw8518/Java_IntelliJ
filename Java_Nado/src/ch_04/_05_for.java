package ch_04;

public class _05_for {
    public static void main(String[] args) {
        //반복문for
        System.out.println("어서오세요. 나코입니다");
        System.out.println("어서오세요. 나코입니다");
        System.out.println("환영합니다. 나코입니다");
        System.out.println("환영합니다. 나코입니다");

        System.out.println("-----반복문 사용-----");
        //반복문사용 for
//        for(선언;조건;증감){
//            
//        }
        for(int i=0;i<10;i++){
//            System.out.println("어서오세요. 나코입니다"+i);
            System.out.println("환영합니다. 나코입니다"+i);
        }

        for (int i = 0; i < 10; i+=2) {//fori+enter //i=i+2
            //짝수만 출력//0 2 4 6 8
            System.out.print(i);
        }

        System.out.println("");

        for (int i = 1; i < 10; i+=2) {//fori+enter
            ////홀수만 출력 홀수만 출력
            System.out.print(i);
        }

        System.out.println("");

        for (int i = 5; i > 0; i--) {//5 4 3 2 1
            System.out.print(i);

        }

        System.out.println("");

        //1부터 10까지의 수들의 합
        int sum=0;
        for (int i = 1; i <= 10; i++) { //작거나 같다
            sum+=i;
            System.out.println("1부터10까지의 합은"+sum);
        }
        System.out.println(sum);
    }
}
