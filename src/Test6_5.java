
public class Test6_5 {
    public static void main(String[] args){


        Student1 s=new Student1("홍길동",1,1,100,60,76);
        System.out.println(s.info());
    }

}

class Student1{
    Student1(){

    }
    String name;
    int ban;
    int no;
    int kor, eng, math;
    int total;
    float average;

    public int getTotal(){
        return  this.total=kor+eng+math;
    }

    public double getAverage(){
        return (Math.round((float) (total/3.0)*10))/10.0;
        // return  Math.round((total/3);
    }
    //답안 부분
    public String info(){
        return name+", "+ban+", "+no+", "+kor+", "+eng +", "+math+", "+getTotal()+", "+getAverage();
    }

    Student1(String name, int ban, int no, int kor, int eng, int math){
        this.name=name;
        this.ban=ban;
        this.no=no;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
    }
}
