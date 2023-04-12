package ch_04;
public class _04_SwitchCase {
    public static void main(String[] args) {
        //Switch Case
        //1등 : 전액 장학금
        //2등 : 반액 장학금
        //3등 : 반액 장학금
        //그 외 : 장학금 대상 아님
        int ranking = 4;
        if (ranking == 1) {
            System.out.println("전액장학금#1");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금#1");
        } else {
            System.out.println("장학금대상아님#1");
        }
        System.out.println("조회완료#1");

        System.out.println("-----swith case-----");

//        switch (ranking == 1){
//            case A; 어쩌구 저쩌구
//                    break
//            case A; 어쩌구 저쩌구
//                break
//            case A; 어쩌구 저쩌구
//                break
//            default:
//        }
        ranking = 1;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회완료#1");

        System.out.println("-----swith case-----");

        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2://case의 내용이 중복되기 때문에 내용없어도 상관없음
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회완료#2");

        System.out.println("-----swith case-----");

        ranking = 3;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2://case의 내용이 중복되기 때문에 내용없어도 상관없음
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회완료#3");

        //중고상품의 등급에 따른 가격을 책정 (1급 : 최상, 4급 최하)
        int grade = 1;
        int price = 7000;
        switch (grade){
            case 1:
                price += 1000; // price = price + 1000
            case 2:
                price += 1000; // price = price + 1000
            case 3:
                price += 1000; // price = price + 1000
                break;
        }
        //break가 없어서 계속 1000원씩 더함 //reult = 10000원
        System.out.println(grade+"제품의 등급의 가격: "+ price);

        //어떤 범위에 해당하는 값을 쓸때는 if
        //if else문을 이용( 여러 조건 또는 범위에 해당하는 조건)

        //명확한 어떤 값으로 나와질때는 swith case
        //switch case 문을 이용 (명확한 케이스가 있는경우)
    }
    }