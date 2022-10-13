import java.util.*;
import java.lang.*;
class file
{
    public static boolean isprime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int n,sum=0,count=0;
        n=k.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=k.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(isprime(arr[i]))
            {
                sum=sum+arr[i];
                count++;
            }
        }
        double avg=(float)sum/count;
        System.out.format("%.2f",avg);
    }
}