import java.util.*;
class file
{
    public static void main(String args[])
    {
        Scanner k=new Scanner(System.in);
        int a;
        double sum=0;
        a=k.nextInt();
        for(float i=1;i<=a;i++)
        {
            sum+=1/i;
        }
        System.out.format("%.2f",sum);
    }
}