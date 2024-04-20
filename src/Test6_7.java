class MyPoint{
    int x, y;

    MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    public double getDistance(int x1, int y1){
        return Math.sqrt((x1-this.x)+(y1-this.y));
    }
}

public class Test6_7 {
    public static void main(String[] args){
        MyPoint p=new MyPoint(1,1);

        System.out.println(p.getDistance(2,2));
    }
}
