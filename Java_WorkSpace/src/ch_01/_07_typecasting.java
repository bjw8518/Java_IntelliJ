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



    }
}
