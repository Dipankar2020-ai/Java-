package enumdemo;
enum Dept
{
    CS,IT,ECE,CIVIL,ME;
    public void display()
    {
        System.out.println(this.name()+" "+this.ordinal());
    }
}


public class EnumDemo {

   
    public static void main(String[] args) {
        Dept d=Dept.ECE;
        System.out.println(d.name());
        System.out.println(d.ordinal());
        System.out.println(d.name());
        Dept List[]=d.values();
        for(Dept x:List)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        switch(d)
        {
            case CS:System.out.println("This is Department of computer science");
            break;
            case ECE:System.out.println("This is Department of Electronics");
            break;
            case IT:System.out.println("This is Department of IT");
            break;
        }
        d.display();
        
        
    }
    
}
