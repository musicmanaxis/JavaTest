public class Test6_22 {

    static boolean isNumber(String str) {
           //여기 확인   지역변수이면 초기화를 해줘야 하나? 해줘야 한다..

        if (str==null || str.equals(""))             return false;
            for (int i = 0; i < str.length(); i++){
                  if(ch<'0' || ch>'9') return false;
               }
    return  true;
    }
        public static void main(String[] args){
            String str = "123";

            System.out.println(str+"는 숫자입니까? "+isNumber(str));

            str="1234o";
            System.out.println(str+"는 숫자입니까? "+isNumber(str));
        }

}