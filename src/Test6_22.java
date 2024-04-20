public class Test6_22 {

    static boolean isNumber(String str) {
           //여기 확인   1.지역변수이면 초기화를 해줘야 하나? 해줘야 한다..

        if (str==null || str.equals(""))             return false;
           //2.객체 참조변수가 아무것도 가리키지 않을 때 null을 사용, 기본자료형에서는 쓰일수 없음..
            for (int i = 0; i < str.length(); i++){      //3.배열의 크기는 length, 문자열의 크기는 length()
                  char ch= str.charAt(i);               //4.지정한 위차의 문자를 반환
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