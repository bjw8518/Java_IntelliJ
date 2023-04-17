package ch_05;

public class _05_ASCII {
    public static void main(String[] args) {
        //아스키코드 (ANSI)
        char c = 'A';   //문자 하나 //알파벳 대문자는 65부터 시작, 소문자는 97부터 시작, 숫자는 0부터 시작.
        System.out.println(c);
        System.out.println((int)c);

        c = 'A';   //문자 하나
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);


        String [][]seats3 = new String[10][15]; //[세로] [가로]
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j]  = String.valueOf(ch) +(j+1);   //영문자
            }
            ch++;
        }

        //영화관 좌석 번호 확인
        for (int i = 0; i < seats3.length ; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println(""); //7 8
        }

    }
}
