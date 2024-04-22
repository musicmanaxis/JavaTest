public class Test6_24 {

    static int abs(int value) {
        int a = value;
        if (value < 0) {

            a = (value * -1);

        }
        return a;
    }
    public static void main(String[] args) {
        int value=5;
        System.out.println(value+"의 절대값:"+abs(value));
        value=-20;
        System.out.println(value+"의 절대값:"+abs(value));
    }
}
