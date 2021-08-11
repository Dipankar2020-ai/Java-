class Tv
{
    public void  switchon()
    {
        System.out.println("Switch on the Tv");
    }
    public void changechannel()
    {
        System.out.println("Chanage the channel");
    }
}
class Smarttv extends Tv
{
     @Override
    public void switchon()
    {
      System.out .println("Switch on Smart tv");    
    }
     @Override
    public void changechannel()
    {
        System.out.println("Change the channel of smart tv");
    }
    public void browse()
    {
        System.out.println("browse the channel of smarttv");
    }
}

public class Tvclass {

    
    public static void main(String[] args) {
        Tv t =new Tv();
        t.changechannel();
        t.switchon();
        Smarttv stv=new Smarttv();
        stv.changechannel();
        stv.switchon();
        Tv ts=new Smarttv();
        ts.changechannel();
        ts.switchon();
    }
    
}