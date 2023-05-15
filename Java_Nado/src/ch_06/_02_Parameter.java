package ch_06;
//  전달값, parameter
public class _02_Parameter {
    public static void power(int num){  //Parameter, 매개변수
        int result = num * num;
        System.out.println(num+"의 2승은"+result);
    }
    public static void powerByExp(int num, int exponent){
        int result=1;
        for (int i = 0; i < exponent; i++) {
            result = result*=num;
        }
        System.out.println(num+"의"+exponent+"승은"+result);
    }

    public static void main(String[] args) {
        //Argument
        power(2);   //2 * 2 = 4;
        power(3);   //3 * 3 = 9;

        powerByExp(2,3); //2 * 2 * 2 = 8;
    }
}
