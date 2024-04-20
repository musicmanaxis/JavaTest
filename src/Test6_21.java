    class MyTV{
        boolean isPowerOn;
        int channel;
        int volumn;

        final int MAX_VOLUME=100;
        final int MIN_VOLUME=0;
        final int MAX_CHANNEL=100;
        final int MIN_CHANNEL=1;

        void turnOnOff(){
            if(isPowerOn ? false:true);
        }

        void volumeUp(){
        }

        void volumeDown(){
        }

        void channelUp(){
            if(channel==MAX_CHANNEL) channel=MIN_CHANNEL;

        }

        void channelDown(){

        }
    }


    public class Test6_21 {
        public static void main(String[] args){
            MyTV t=new MyTV();

            t.channel=100;
            t.volumn=0;
            System.out.println("CH:"+t.channel+", VOL:"+t.volumn);

            t.channelDown();
            t.volumeDown();
            System.out.println("CH:"+t.channel+", VOL:"+t.volumn);

            t.volumn=100;
            t.channelUp();
            t.volumeUp();
            System.out.println("CH:"+t.channel+", VOL:"+t.volumn);

        }


    }
