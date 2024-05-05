import jdk.nashorn.internal.parser.JSONParser;

class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck2() {
        //배열 석다카드를 적절히 초기화
        for (int i = 0; i < cards.length; i++) {
            int a = i % 10 + 1;
            ;
            boolean isKwang = (i < 10) && (a == 1 || a == 3 || a == 8);  //특이하다...

            cards[i] = new SutdaCard2(a, isKwang);

        }
    }
        public void shuffle() {
            //배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
            for (int i = 0; i < cards.length; i++) {

                int j = (int) (Math.random() * cards.length);

                SutdaCard2 sd2 = cards[i];
                cards[i] = cards[j];
                cards[j] = sd2;

            }

        }

    public SutdaCard2 pick(int index){
        //배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
        if(index<0 ||index>CARD_NUM) return null;   //유효성 검사 필수

        return cards[index];
    }

    public SutdaCard2 pick(){
       int i=(int)(Math.random()* cards.length);
        return pick(i);

    }
}

class SutdaCard2{
    int num;
    boolean isKwang;

    SutdaCard2(){
        this(1,true);
    }

    SutdaCard2(int num, boolean isKwang){
        this.num=num;
        this.isKwang=isKwang;
    }

    public String toString(){
        return num+(isKwang ? "K":"");
    }
}
public class Test7_2 {
    public static void main(String[] args) {
        SutdaDeck2 deck=new SutdaDeck2();

        System.out.println(deck.pick(0));
        System.out.println("무작위 카드 뽑기후:"+deck.pick());
        deck.shuffle();

        for(int i=0 ; i<deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");

        System.out.println();
        System.out.println(deck.pick(0));

    }
}
