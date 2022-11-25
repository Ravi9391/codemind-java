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
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    a[j]=9999;
                }
            }
            if(a[i]!=9999 && a[i]%2!=0)
            {
                s+=a[i];
            }
        }
        System.out.println(s);
    }
}