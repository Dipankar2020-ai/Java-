class Student
{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int total()
    {
        return m1+m2+m3;
        
    }
    public int average()
    {
        return total()/3;
    }
    public String grade()
    {
        int m=average();
        if(m>70)
        {
            return "A";
        }
        else if(m>60 && m<70)
        {
            return "B";
        }
        else if(m>50 && m<60)
        {
            return "C";
        }
        else if(m>40 && m<50)
        {
            return "D";
        }
        
        return "F";
    }
}
public class Studentmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1=new Student();
        s1.m1=20;
        s1.m2=60;
        s1.m3=55;
        System.out.println("The total marks is "+s1.total());
        System.out.println("The average marks is "+s1.average());
        System.out.println("The grade is "+s1.grade());
    }
    
}
