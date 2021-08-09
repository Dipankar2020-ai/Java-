package productcustomer;

class Product
{
    private String itemno;
    private String name;
    public int price;
    public int quantity;
    public void setprice(int price)
    {
        this.price=price;
        
    }
    public void setquantity(int quantity)
    {
        this.quantity=quantity;
    }
    public String getname()
    {
        return name;
    }
    public String getitemno()
    {
        return itemno;
    }
    Product(String itemno,String name,int quantity,int price)
    {
        this.name=name;
        this.itemno=itemno;
        this.quantity=quantity;
        this.price=price;
    }
    
}
public class ProductCustomer {

    
    public static void main(String[] args) {
        Product p=new Product("DELL","A234",2,121);
         System.out.println(p.price+" "+p.quantity);
        System.out.println(p.getname()+" "+p.getitemno());
        p.setprice(212);
        p.setquantity(12);
         System.out.println(p.price+" "+p.quantity);
    }
    
}
