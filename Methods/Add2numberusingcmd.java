public class Add2numberusingcmd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<args.length;i++)
        {
            int j=Integer.parseInt(args[i]);
            sum=sum+j;
        }
        System.out.println(sum);
    }
    
}
