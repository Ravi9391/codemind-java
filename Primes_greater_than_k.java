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
        for(int i=2;i<=(int)Math.sqrt(n);i++)
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
        int n,count=0,m;
        n=k.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=k.nextInt();
        }
        m=k.nextInt();
        for(int i=0;i<n;i++)
        {
            if(isprime(arr[i]))
            {
                if(m<=arr[i])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}