public class Tv{
    private int channel;
    private int volumeLevel;
    private boolean on;

    public int getChannel(){
        return channel;
    }
    public int getVolumeLevel(){
        return volumeLevel;
    }
    public boolean getOn(){
        return on;
    }
    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }
    public void setChannel (int newChannel){ //1-120
        if (on && newChannel>=1 && newChannel<=120) {
            channel = newChannel;
         } 
    }
    public void setVolume (int newVolumeLevel){ //1-7
        if (on && newVolumeLevel>=1 && newVolumeLevel<=7){
            volumeLevel = newVolumeLevel;
        }
    }
    public void volumeUp(){
        //volumeLevel = volumeLevel + 1;
        if (on && volumeLevel <7){
            volumeLevel++;
        }
    }
    public void volumeDown(){
        if (on && volumeLevel >1){
            volumeLevel--;
        }
    }
    public void channelUp(){
        if(on && channel <120){
            channel++;

        }
    }
    public void channelDown(){
        if(on && channel >1){

            channel--;
        }
    }
    public static void main(String[] args) {
        Tv sony = new Tv();
        sony.turnOn();
        sony.setChannel(112);
        sony.setVolume(7);


        System.out.println("The tv is " + sony.getOn());
        
        System.out.println(" The channel is " + sony.getChannel()); 
        
        System.out.println(" The volume is "+ sony.getVolumeLevel());



        sony.volumeDown();
        System.out.println(sony.getVolumeLevel());
        sony.volumeDown();
        System.out.println(sony.getVolumeLevel());
        sony.volumeDown();
        System.out.println(sony.getVolumeLevel());
        sony.volumeDown();
        System.out.println(sony.getVolumeLevel());
        sony.volumeDown();
        System.out.println(sony.getVolumeLevel());
        sony.volumeDown();
        System.out.println(sony.getVolumeLevel());
        sony.volumeDown();
        System.out.println(sony.getVolumeLevel());

        sony.turnOff();
        
    }
}