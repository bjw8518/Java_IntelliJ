package ch_06;

public class _03_Return {
    //   호텔전화번호
    public  static  String getPhoneNumber(){
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }
    //   호텔주소
    public static String getAdress(){
        return "서울시 용산구 한남동";   //바로 값 자체를 반환도 가능
    }

    //  호텔 액티비티
    public static String getActivity(){
        return "볼링장,탁구장,수영장";
    }

    public static void main(String[] args) {
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호: " + contactNumber);

        String hotelAddr = getAdress();
        System.out.println("호텔주소: "+hotelAddr);

        System.out.println("호텔 액티비티 :" +getActivity());
    }
}
