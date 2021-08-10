package customerclass;
class Customer
{
    String name;
    int phonenum;
    public void paybill()
    {
        System.out.println("pay the bill");
    }
}
class Member extends Customer
{
    String customerid;
    String adress;
    String dob;
    public void callback()
    {
        System.out.println("There is an offer ");
    }
   
}
public class Customerclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Member m=new Member();
        m.paybill();
        m.name="Dipankar";
        m.dob="12-6-1990";
        System.out.println("The name of customer is "+m.name+" "+"date of birth "+m.dob);
        m.callback();
    }
    
}
