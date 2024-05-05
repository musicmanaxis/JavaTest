import jdk.nashorn.internal.parser.JSONParser;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard1[] cards = new SutdaCard1[CARD_NUM];

    SutdaDeck() {
        //배열 석다카드를 적절히 초기화
       for(int i=0; i<cards.length;i++){
           int a=i%10+1;;
           boolean isKwang=(i<10)&&(a==1||a==3||a==8);  //특이하다...

               cards[i]=new SutdaCard1(a,isKwang);

       }
    }
}

class SutdaCard1{
    int num;
    boolean isKwang;

    SutdaCard1(){
        this(1,true);
    }

    SutdaCard1(int num, boolean isKwang){
        this.num=num;
        this.isKwang=isKwang;
    }

    public String toString(){
        return num+(isKwang ? "K":"");
    }
}
public class Test7_1 {
    public static void main(String[] args) {
        SutdaDeck deck=new SutdaDeck();

        for(int i=0 ; i<deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");

    }
}
