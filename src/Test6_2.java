public class Test6_2 {
    public static void main(String args[]){
        SutdaCard card1=new SutdaCard(3, false);
        SutdaCard card2=new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
       this(1, true);
    }
    SutdaCard(int a, boolean b){
        this.num=a;
        this.isKwang=b;
    }

    public String info(){
        return num+(isKwang ? "K" : "");
    }
}