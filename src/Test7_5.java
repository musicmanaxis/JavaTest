class Product{
    int price;
    int bonusPoint;

    Product(){

    }

    Product(int price){
        this.price=price;
        bonusPoint=(int)(price/10.0);
    }
}

class Tv extends Product{
    Tv(){
        this(100);
    }
    Tv(int price){
        this.price=price;
        this.bonusPoint=(int)(price/10.0);
    }

    public String toString(){
        return "TV";
    }
}
public class Test7_5 {


    public static void main(String[] args) {
        Tv t=new Tv();
        System.out.println(t.bonusPoint);
    }
}
