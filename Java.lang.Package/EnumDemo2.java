package enumdemo2;

enum Dept2
{
    CS("john","Block A"),
    IT("paul","Block B"),
    ECE("Raju","Block C");
    String name;
    String location;
    private Dept2(String head,String loc)
    {
        this.name=head;
        this.location=loc;
        
    }
    public String getHeadName()
    {
        return name;
    }
    public String getLocation()
    {
        return location;
    }
    
    
    
}

public class EnumDemo2 {

   
    public static void main(String[] args) {
       Dept2 d=Dept2.ECE;
       System.out.println(d.getHeadName());
       System.out.println(d.getLocation());
    }
    
}
