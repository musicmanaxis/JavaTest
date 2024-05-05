import javax.swing.text.Position;

public class Test7_22 {
    public static void main(String[] args) {
      Shape[] arr={new Circle(5.0), new Rectangle(3,4), new Circle(1)};
      System.out.println("면적의 합:"+sumArea(arr));


    }

    static double sumArea(Shape[] arr){
        double sum=0.0;
       for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].calcArea());
           sum+=arr[i].calcArea();
       }
       return  sum;
    }
}

abstract class Shape{
    Point p;

    Shape(){
        this(new Point(0,0));
    }

    Shape(Point p){
        this.p=p;
    }

    abstract double calcArea();   //도형의 면적을 계산해서 반환하는 메서드

    Point getPosition(Point p){
        return p;
    }

    void setPosition(Point p){
        this.p=p;
    }

}

class Point{
    int x, y;

    Point(){
        this(0,0);
    }

    Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public String toString(){
        return "["+x+", "+y+"]";
    }
}

class Circle extends Shape{
    Circle(){

    }

    Circle(double r){
        this.r=r;
    }
    double r;

    public double calcArea(){
        return 3.14*r;
    }


}

class Rectangle extends Shape{
    Rectangle(){
       this(2.0, 2.0);
    }

    Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }

    double width, height;

    public double calcArea(){
        return width*height;
    }

    public boolean iSquare(){
        if(this instanceof Rectangle) return true;
            return  false;

    }


}

