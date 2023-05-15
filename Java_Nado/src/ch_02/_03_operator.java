package ch_02;

public class _03_operator {
    public static void main(String[] args) {
        //비교연산자
        System.out.println(5 > 3); //5가 3보다 크다 true
        System.out.println(5 >= 3); //5가 3보다 크거나 같다 true
        System.out.println(5 >= 5); //5가 5보다 크거나 같다 true
        System.out.println(5 >= 7); //5가 7보다 크거나 같다 false

        System.out.println("------");

        System.out.println(5<3); //5는 3보다 작다 false
        System.out.println(5<=3); //5는 3보다 작다 false

        System.out.println("------");

        System.out.println(5 == 5); //5는 5와 같다 true
        System.out.println(5 == 3); //5는 3과 같다 false
        System.out.println(5 != 5); //5는 5와 같지않다 false
        System.out.println(5 != 3); //5는 3과 같지않다 true


    }
}
