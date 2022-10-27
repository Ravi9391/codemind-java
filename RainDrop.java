import java.util.*;
class sloution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        if(n%3==0)
        {
            System.out.format("Pling");
            c++;
        }
        if(n%5==0)
        {
            System.out.format("Plang");
            c++;
        }
        if(n%7==0)
        {
            System.out.format("Plong");
            c++;
        }
        if(c==0)
        {
            System.out.println(n);
        }
    }
}