package studentchallenge1;

import java.util.Date;

class Student
{
    private String rollno;
    private static int count=1;
    private String generaterollno()
    {
        Date d=new Date();
       String rno="Univ-"+(d.getYear()+1900)+"-"+count;        
        count++;
        return rno;
    }
    Student()
     {
       
         rollno=generaterollno();
      }
    public String getrollno()
    {
        return rollno;
    }
}


public class Studentchallenge1 {

   
    public static void main(String[] args) {
        
        Student s1=new Student();
         Student s2=new Student();
         Student s3=new Student();
        System.out.println(s1.getrollno());
         System.out.println(s2.getrollno());
          System.out.println(s3.getrollno());
        
    }
    
}
