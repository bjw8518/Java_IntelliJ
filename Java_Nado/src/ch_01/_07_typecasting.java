package ch_01;

public class _07_typecasting {
    public static void main(String[] args) {
        //형변환 Typecasting
        //정수형에서 실수로
        //실수에서 정수로


        //int to float
        //int to double
        int score = 93;
        System.out.println(score);

        System.out.println((float)score);  //93.0
        System.out.println((double)score); //93.0

        //float, double to int
        float score_i = 93.3F;
        double score_j = 93.8;

        System.out.println((int) score_i);
        System.out.println((int) score_j);

        //정수와 실수연산

        score = 93 + (int)98.8;
        System.out.println(score); //191

        score_j = 93+98.8;
        System.out.println(score_j);


        //변수에 형변환된 데이터 집어넣기
        double convertDouble = score; //->자동형변환

        int convertInt;

        //숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1); //93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
                System.out.println(s2);

                //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);

        double d = Double.parseDouble("98.8");
        System.out.println(d);

        int error = Integer.parseInt("자바");
    }
}
