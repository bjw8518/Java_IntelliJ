package ch_04;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

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
    }
    }