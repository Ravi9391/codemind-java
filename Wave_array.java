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
        for(int i=0;i<n-1;i+=2)
        {
            if(a[i]<a[i+1])
            {
                s+=1;
            }
            if(a[i]>a[i+1])
            {
                c+=1;
            }
        }
        if(s==n/2||c==n/2)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}