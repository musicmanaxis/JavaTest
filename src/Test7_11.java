class MyTv3{
    private boolean isPowerOn;
    private int channel;
    private int volumn;
    private int prevChannel;

    final int MAX_VOLUMN=100;
    final int MIN_VOLUMN=0;
    final int MAX_CHANNEL=100;
    final int MIN_CHANNEL=1;

    public boolean isPowerOn(){
        return true;
    }

    public int getChannel(){
        return channel;
    }

    public int getVolumn(){
        return volumn;
    }

    public void setChannel(int channel){
        this.prevChannel=this.channel;
        this.channel=channel;

    }
    public void setVolumn(int volumn){
        this.volumn=volumn;
    }

    public void gotoPrevChannel(){
        setChannel(prevChannel);    //이부분...체크
    }


}

public class Test7_11 {
    public static void main(String[] args) {
        MyTv3 t=new MyTv3();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }
}
