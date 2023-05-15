package ch_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자
        //\n줄바꿈
        System.out.println("자바가\n너무\n맛있어요");

        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t12000원");
        System.out.println("파전\t89000원");

        System.out.println("C:\\  Program Files\\Java");

        System.out.println("단비가 \"냐옹\" ");

        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요");
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");


        char c = 'A';
        c = '\'';

        System.out.println(c);

    }
}

