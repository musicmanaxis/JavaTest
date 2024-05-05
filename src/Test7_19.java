public class Test7_19 {

    public static void main(String[] args) {
        Buyer b=new Buyer();

        b.buy(new Tv1());
        b.buy((new Computer()));
        b.buy(new Tv1());
        b.buy((new Audio()));

        b.buy((new Computer()));
        b.buy((new Computer()));
        b.buy((new Computer()));

       b.summary();
    }
}

class Buyer{
    int money=1000;
    Product1[] cart=new Product1[3];
    int i=0;

    void buy(Product1 p){
        if(money<p.price) {
              System.out.println(p+"는 잔액이 부족하여 구매불가");
            return;
        }
        money-=p.price;
        add(p);
        System.out.println("구매한 물건:"+p+", 잔액:"+money);
    }

    void  add(Product1 p){

        if(i>=cart.length) {
            Product1[] cart2 = new Product1[cart.length*2];

           for(int i=0; i<cart.length;i++) {
               cart2[i]=cart[i];
           //    System.out.print("카트2의 내용물:"+cart2[i]+", ");
           }
            cart=cart2;   //장바구니를 바꾼다...여기서 많이 생각함...확인
        }
        cart[i]=p;
        i++;
    }

    void summary(){
        int sum=0;
        System.out.print("구매한 물건:");
        for(int i=0; i<cart.length;i++) {    //이거 어떻게 처리했는지 확인
            System.out.print(cart[i] + ",");
            sum += cart[i].price;
        }
        System.out.println();
        System.out.println("사용한 금액: "+sum+"입니다.");
        System.out.println("남은 금액:"+money+"남았습니다.");
    }
}

class Product1{
    int price;

    Product1(int price){
        this.price=price;
    }

}

class Tv1 extends Product1 {
    Tv1() {super(100);}

    public String toString(){return "TV";}
}

class Computer extends Product1 {
    Computer() {super(200);}

    public String toString(){return "Computer";}
}

class Audio extends Product1 {
    Audio() {super(50);}

    public String toString(){return "Audio";}
}



