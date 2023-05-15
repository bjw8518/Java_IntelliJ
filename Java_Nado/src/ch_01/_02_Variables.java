package ch_01;

public class _02_Variables {
    public static void main(String[] args) {
        String name = "사용자";
        int hour = 15;

        System.out.println(name+"님, 배송이 시작됩니다. " +hour+ "시에 방문예정입니다.");
        System.out.println(name+"님 배송이 완료되었습니다");

        double score = 98.5;
        char grade = 'a';
        name = "강백호"; //값 업데이트 가능
        System.out.println(name+"님의  평균 정수는" + score+"점입니다");
        System.out.println(name+"님의 학점은"+grade+"입니다");

        boolean pass = true;
        System.out.println(name+"님은 시험에 합격했을까요?"+pass);

        double d = 3.14123456789;
        float f = 3.14123456789f;       //4byte (32 bit) 크기를 가진다.
                                        //자바의 실수 타입의 기본 처리는 double 타입이므로,
                                        //float 타입에 값을 저장하려면 실수 리터럴 뒤에 f 또는 F 를 붙여야 한다.
        System.out.println(d);
        System.out.println(f);

//        int i = 1000000000000;  //+21억 -21억까지 받을수있음 error
        long l = 1000000000000l;  //long타입에 값을 저장하려면 초기값뒤에 l , L 을 쓰면됨
        l = 1_000_000_000_000l;

        System.out.println(l);

        // int, long, String, char, double, float
        // int, String, double

    }
}
