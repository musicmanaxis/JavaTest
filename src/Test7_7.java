class Parent{
    int x=100;

    Parent(){
        this(200);
    }

    Parent(int x){
        this.x=x;
    }

    int getX(){
        return x;
    }
}

class Child extends Parent{
    int x=3000;
    Child(){
        this(1000);
    }

    Child(int x){
        this.x=x;
    }


}

public class Test7_7 {
    public static void main(String[] args) {
        Child c=new Child();
        System.out.println(c.getX());

        //자식의 메서드가 없으므로 조상의 getX()가 호출되며
        //그 메서드로 인해 조상의 객체변수 값200이 호출된다.
    }


}
