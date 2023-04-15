package ch_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        //배열의 순회
        String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};

        //for 반복순회
        for (int i = 0; i < 4; i++) {   //i 요소로 접근
            System.out.println(coffees[i]+" 하나");
        }
        System.out.println("주세요.");

        System.out.println("=================================");

        //배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {   //i 요소로 접근
            System.out.println(coffees[i]+" 하나");
        }
        System.out.println("주세요.");

        System.out.println("=================================");

        //enhanced for (for-each) 반복문
        for (String coffee : coffees) { //coffees라는 배열의 값들을 순서대로 순회하는데
            //그때그때 순회되는 값을 coffee라는 이름으로 받아서 사용한다
            System.out.println(coffee+ "하나");
        }
        System.out.println("주세요");


    }
}
