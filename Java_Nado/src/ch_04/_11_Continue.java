package ch_04;

public class _11_Continue {
    public static void main(String[] args) {
        //Continue
        //치킨 주문 손님중에 노쇼 손님이 있다고 가정
        //for
        int max = 20;   //20마리까지
        int sold = 0;   //현재 치킨 판매수량
        int no_show = 17;   //17번 노쇼
        for (int i = 1; i <= 50; i++) {
            System.out.println(i+"번째 손님 주문하신 치킨 나왔습니다");
            //손님이 없다면noshow
            if(i == no_show){
                System.out.println(i+"번 손님 노쇼로 인해 다른손님에게 기회가 넘어갔습니다");
                continue;
            }

            sold++; //판매처리
            if(sold == max){
                System.out.println("금일 치킨이 모두 판매되었습니다");
                break;
            }
        }
        System.out.println("영업종료");//반복문 밖에서
        System.out.println("=======================================================");

        //while문
        sold =0;
        int index =1; //손님번호
        while(index <= 50){
            System.out.println(index+"번째 손님 주문하신 치킨 나왔습니다.");
            //noshow시작
            if(index == no_show){
                System.out.println(index+"번째 손님 노쇼로 인해 다른손님에게 기회가 넘어갑니다");
                index++;
                continue;   //바로다음문장실행 //continue를 만나면 noshow끝 아래부분을 아예 실행을 안하기때문에 바로 윗줄에 index++추가
            }

            //noshow끝
            sold++;//판매처리
            if(sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break; //break만나면 조건문 탈출
            }
            index++;
        }
        System.out.println("영업종료");
    }
}
