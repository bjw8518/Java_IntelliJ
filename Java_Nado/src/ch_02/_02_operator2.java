package ch_02;

public class _02_operator2 {
    public static void main(String[] args) {
        //대입연산자
        int num = 10;
        num = num+2;
        System.out.println(num);

        num = num-2;
        System.out.println(num);

        num = num * 2;
        System.out.println(num);

        num = num / 2;
        System.out.println(num);

        num = num % 2; //나머지 0
        System.out.println(num);

        //복합대입연산자
        System.out.println("----복합대입연산자----");
        num = 10;

        num += 2; //num = num + 2;
        System.out.println(num);

        num -= 2; //num = mum +2;
        System.out.println(num);

        num *= 2;
        System.out.println(num);

        num /= 2;
        System.out.println(num);

        num %= 2;
        System.out.println(num);
    }
}
