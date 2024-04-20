public class Test6_20 {

    static int[] shuffle(int arr[]){
        int[] arr1=new int[9];
             for(int i=0; i<arr.length ;i++){

        //       int arr1 [i] =arr[(int)(Math.random())];


             }
        return arr1;
    }

    public  static  void  main(String[] args){
        int[] original={1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result=shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
