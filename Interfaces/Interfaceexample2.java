class Phone
{
    public void call()
    {
        System.out.println("Dial the number");
    }
    public void sms()
    {
        System.out.println("Send the sms");
    }
}
interface Camera
{
    public void click();
    public void record();
}
interface Music
{
    void play();
    void pause();
    void stop();
}

class Smartphone extends Phone implements Camera ,Music
{
    void videocall()
    {
        System.out.println("Start doing video call");
    }
    @Override
     public void click()
    {
        System.out.println("Click the picture");
    }
      @Override
    public  void record()
    {
        System.out.println("Start recording ");
    }
    
     @Override
    public void play()
    {
        System.out.println("play the  music");
    }
      @Override
     public void pause()
    {
        System.out.println("pause the music");
    }
      @Override
     public void stop()
    {
        System.out.println("stop the music");
    }
    
}       


public class Interfaceexample2 {

  
    public static void main(String[] args) {
        Smartphone s=new Smartphone();
        s.videocall();
        Phone p=s;
        p.call();
        Camera c=s;
        c.click();
        Music m=s;    
        m.play();
    }
    
}
