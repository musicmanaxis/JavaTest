class MyTv2{
    private boolean isPowerOn;
    private int channel;
    private int volumn;

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
        if(channel <MIN_CHANNEL || channel >MAX_CHANNEL) return;
        this.channel=channel;
    }
    public void setVolumn(int volumn){
        if(volumn<MIN_VOLUMN || volumn >MAX_VOLUMN) return;
        this.volumn=volumn;
    }



}

public class Test7_10 {
    public static void main(String[] args) {
        MyTv2 t=new MyTv2();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setVolumn(20);
        System.out.println("VOL:"+t.getVolumn());
    }
}
