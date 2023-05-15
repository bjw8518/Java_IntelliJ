package ch_02;

public class _01_operator1 {
    public static void main(String[] args) {
        //산술 연산자

        //일반연산
        System.out.println(4+2);
        System.out.println(4-2);
        System.out.println(4*2);
        System.out.println(4/2);
        System.out.println(5/2);
        System.out.println(2/4);

        //System.out.println(5.0/2.0);

        System.out.println(4%2); //나머지 연산 4를 2로 나눈 나머지
        System.out.println(5%2);

        //우선순위 연산
        System.out.println(2 + 2 * 2); //6
        System.out.println((2 + 2) * 2); //8

        //변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a+b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);//20에서 10을 나눴을 때 나머지
        //몫은 2 나머지 0


        //증감연산 ++, --
        int val;
        val = 10;
        System.out.println(val); //10
        System.out.println(++val); //11 ex)연산이 먼저 수행 한 후 다른문장이 수행
        System.out.println(val);

        val = 10;
        System.out.println("-----------------");
        System.out.println(val); //10
        System.out.println(val++); //10 ex)일단 문장을 먼저 수행한 후 연산을 실행
        System.out.println(val); //11

        System.out.println("--------------뺴기");
        val = 10;
        System.out.println(val);//10
        System.out.println(--val); //9 ex)10에서 1을 먼저 증감하고 문장을 수행
        System.out.println(val);

        val =10;
        System.out.println(val); //10
        System.out.println(val--);//10 ex)10을 먼저 출력하고 그 다음줄에서 연산내용 반영
        System.out.println(val); //9

        //은행 대기번호표

        System.out.println("-----은행대기-----");
        int watting = 0;
        System.out.println("대기인원은 : " + watting++); //대기인원:0
        System.out.println("대기인원은 : " + watting++); //대기인원:1
        System.out.println("대기인원은 : " + watting++); //대기인원:2

        System.out.println("총 대기 인원 : " + watting); //총 대기인원 3

    }
}

