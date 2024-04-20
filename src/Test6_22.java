public class Test6_22 {

    static boolean isNumber(String str) {
        boolean tmp=false;    //여기 확인   지역변수이면 초기화를 해줘야 하나? 해줘야 한다..

        if (str.equals(null) || str.equals("")) {   //여기 확인
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
               if(str.charAt(i)<'A'|| str.charAt(i)<'a') {
                   tmp = true;
               }else{
                   tmp=false;
               }

            }
            return tmp;
        }
    }
        public static void main(String[] args){
            String str = "123";

            System.out.println(str+"는 숫자입니까? "+isNumber(str));

            str="1234o";
            System.out.println(str+"는 숫자입니까? "+isNumber(str));
        }

}