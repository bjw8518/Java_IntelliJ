package ch_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        //조건문 elseif
        //한라봉에이드+1
        //또는 망고주스+1
        //또는 아아+1

        boolean halabongAde = true;
        boolean mangoJuice = true;
//        if (halabongAde){
//            System.out.println("한라봉에이드"+1);
//        } else if (mangoJuice) {
//            System.out.println("망고쥬스"+1);
//        }else{
//            System.out.println("아아"+1);
//        }
//        System.out.println("음료 주문완료"+1);

        //else if는 여러번 사용가능

        halabongAde = false;
        mangoJuice = false;
        boolean orangeJuice = true;
        if (halabongAde){
            System.out.println("한라봉에이드"+1);
        } else if (mangoJuice) {
            System.out.println("망고쥬스"+1);
        } else if(orangeJuice){
            System.out.println("오렌지쥬스"+1);
        } else {
        System.out.println("아아"+1);
    }
        System.out.println("음료 주문완료#2");

        ////////////////////////////////////////
        halabongAde = false;
        mangoJuice = false;
        orangeJuice = false;
        if (halabongAde){
            System.out.println("한라봉에이드"+1);
        } else if (mangoJuice) {
            System.out.println("망고쥬스"+1);
        } else if(orangeJuice){
            System.out.println("오렌지쥬스"+1);
        }
        System.out.println("음료주문완료#3");
}
}
