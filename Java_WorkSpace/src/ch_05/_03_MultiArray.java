package ch_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        //다차원배열(2차원 배열)


        //소규모 영화관 좌석
        //A1 - A5
        //B1 - B5
        //C1 - C5

        String[] seatA = {"A1", "A2", "A3", "A4"};
        String[] seatB = {"B1", "B2", "B3", "B4"};
        String[] seatC = {"C1", "C2", "C3", "C4"};

        //3 X 5 크기의 2차원 배열
        String[][] seats = new String[][]{
            {"A1", "A2", "A3", "A4", "A5"},
            {"B1", "B2", "B3", "B4", "B5"},
            {"C1", "C2", "C3", "C4", "C5"}
        };

        //B2에 접근하려면
        System.out.println(seats[1][1]); //1. 가로줄부터 확인 2. 세로 줄 확인
        //C5에 접근하려면
        System.out.println(seats[2][4]); //1. 가로줄부터 확인 2. 세로 줄 확인

        System.out.println("=========================================");
        //첫줄에는 3칸, 둘째칸에는 4칸, 셋째칸에는 5칸
        String[][] seats2 = {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"},
        };

        //A3에 접근하려면?
        System.out.println(seats2[0][2]);

        //A5에 접근하려면? //접근할수없음
//        System.out.println(seats2[0][4]);


    }
}
