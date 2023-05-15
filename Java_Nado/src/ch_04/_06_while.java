package ch_04;

public class _06_while {
    public static void main(String[] args) {
        //while
        int distance = 25;
        int move = 0;
        while (move < distance){//현재이동거리 전체 거리보다 작다는 조건이 참인동안 수행
            System.out.println("첨벙첨벙");
            System.out.println("현재이동거리는"+move);
            move +=3; //3미터이동
        }
        System.out.println("도착");

        //무한루프
        move = 0;
        while (move < distance){//현재이동거리 전체 거리보다 작다는 조건이 참인동안 수행
            System.out.println("첨벙첨벙");
            System.out.println("현재이동거리는"+move);
//          move +=3; //3미터이동
            move +=3;
        }
        System.out.println("도착");
    }
}
