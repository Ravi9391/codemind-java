import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int c=0,s=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++)
        {
            if(n%2==0)
            {
                System.out.format("%d %d ",a[i],a[(n-i)-1]);
            }
            else
            {
                System.out.format("%d %d ",a[i],a[(n-i)-1]);
            }
        }
        if(n%2!=0)
        {
            System.out.format("%d %d",a[n/2],0);
        }
    }
}