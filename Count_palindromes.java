import java.util.*;
import java.util.Scanner;
class file
{
    public static boolean ispalindrome(int n)
    {
        int rem,rev=0,a=n;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==a)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int n,count=0;
        n=k.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=k.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(ispalindrome(arr[i]))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}