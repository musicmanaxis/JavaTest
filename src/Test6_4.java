public class Test6_4 {
    public static void main(String[] args){
        Student s =new Student();
        s.name="홍길동";
        s.ban=1;
        s.no=1;
        s.kor=100;
        s.eng=60;
        s.math=76;

        System.out.println("name="+s.name);
        System.out.println("Total="+s.getTotal());
        System.out.println("Average="+s.getAverage());


    }

}

class Student{

    String name;
    int ban;
    int no;
    int kor, eng, math;
    int total;
    float average;

    //답안 부분
    public int getTotal(){
        return  this.total=kor+eng+math;
    }

    public double getAverage(){
        return (Math.round((float) (total/3.0)*10))/10.0;
       // return  Math.round((total/3);
    }


}
