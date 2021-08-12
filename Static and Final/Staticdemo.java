class Honda
{
    static int price=10;
    int j=6;
    static int onroadprice(String city)
    {
        switch(city)
        {
            case "kolkata": return price*12;
            case "Delhi":return price*15;
        } 
        return 0;
    }
}

public class Staticdemo {

 
    public static void main(String[] args) {
       System.out.println(Honda.price);
       System.out.println(Honda.onroadprice("Delhi"));
    }
    
}
