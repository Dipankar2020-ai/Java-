class Stackunderflow extends Exception
{
    @Override
    public String toString()
    {
        return "Stack is in underflow";
    }
}
class Stackoverflow extends Exception
{
     @Override
    public String toString()
    {
        return "Stack is full";
    }
}
class Stack
{
    int size;
    int st[];
    int top=-1;
    Stack(int size)
    {
        this.size=size;
        st=new int[size];
    }
    public void push(int x) throws Stackoverflow
    {
        if(top==size-1)
        {
            throw new Stackoverflow();
        }
        top++;
        st[top]=x;
    }
    public int  pop() throws Stackunderflow
    {
        if(top==-1)
            throw new Stackunderflow();
        int x=st[top];
        top--;
        return x;
    }
}

public class Stackexception {

    
   
    public static void main(String[] args) {
        Stack s=new Stack(5);
        try
        {     
        s.push(10);
        s.push(12);
        s.push(13);
        s.push(14);
        s.push(15);
       s.push(16);
        }
        catch(Stackoverflow e)
        {
            System.out.println(e);
        }
        
        }   
    
}
