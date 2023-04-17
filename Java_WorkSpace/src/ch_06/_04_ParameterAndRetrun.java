package ch_06;
//전달값과 반환값이 있는 메소드
public class _04_ParameterAndRetrun {

    public static int getPower(int num){
        int result = num*num;
        return result;
    }

    public static int getPowerByExp(int num, int exponent){
        int result=1;
        for (int i = 0; i < exponent; i++) {
            result = result*=num;
        }
        return result;
    }


    public static void main(String[] args) {
        int returnValue = getPower(2);
        System.out.println(returnValue);    //  2 * 2 = 4

        returnValue = getPower(3);
        System.out.println(returnValue);    //  3 * 3 = 9

        returnValue = getPowerByExp(3,3);
        System.out.println(returnValue);    //  3 * 3 * 3 = 27

        System.out.println(getPowerByExp(2,4)); //  2 * 2 * 2 * 2 = 16
    }
}
