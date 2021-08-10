package phone;

class Cellphone
{
    public int phonenumber;
    public String imie;
    public void call()
    {
        System.out.println("call to Dipankar");
    }
    public void sms()
    {
        System.out.println("Sending a Sms");
    }
    public void save()
    {
        System.out.println("Save the number");
    }
    public void delete()
    {
        System.out.println("Delete the number");
    }
}
class Smartphone extends Cellphone
{
    public int macno;
     public void playmusic()
    {
        System.out.println("Start a song");
    }
    public void Click()
    {
        System.out.println("click the picture");
    }
    public void video()
    {
        System.out.println("play the video");
    }
    
}
public class Phone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Smartphone s=new Smartphone();
        s.call();
        s.sms();
        s.Click();
        s.video();
        
    }
    
}
