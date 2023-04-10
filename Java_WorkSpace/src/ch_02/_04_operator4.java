package ch_02;

public class _04_operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음);// and 연산자 (하나라도 true이면 true)
        System.out.println(김치찌개 && 계란말이 && 제육볶음);// or 연산자 ()

        //and 연산
        System.out.println((5 > 3) && (3 > 1)); //5는 3보다 크고, 3은 1보다 크다
        System.out.println((5 > 3) && (3 < 1)); //5는 3보다 크고, 1은 3보다 크다

        //or 연산 둘중 하나만 맞아도 true
        System.out.println((5 > 3) || (3 > 1)); //5는 3보다크고 3은 1보다 크다 (true)
        System.out.println((5 > 3) || (3 < 1)); //5는 3보다 크고 1이 3보다 크다 (false)
        System.out.println((5 < 3) || (3 < 1)); //5는 3보다 크고 1이 3보다 크다 (false)

        //불가능한 코드System.out.println(1 < 3 < 5);
        System.out.println(1 < 3 && 3 < 5); //()를 써주는게 좋음

        //논리 부정연산자
        System.out.println(!true); //반대값 출력 false
        System.out.println(!false); //반대값 출력 true
        System.out.println(!(5==3)); //반대값 출력 true (원래는 false)

    }
}
