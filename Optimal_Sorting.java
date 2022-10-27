import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int k=0;k<x;k++)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int l=0;l<n;l++)
            {
                a[l]=sc.nextInt();
            }
            int c=0;
            for(int i=1;i<n;i++)
            {
                if(a[i-1]>a[i])
                {
                    c++;
                }
            }
            if(c==0)
            {
                System.out.println(c);
            }
            else
            {
                int max=a[0],min=a[0];
                for(int j=0;j<n;j++)
                {
                    if(min>a[j])
                    {
                        min=a[j];
                    }
                    if(max<a[j])
                    {
                        max=a[j];
                    }
                }
                System.out.println(max-min);
            }
        }
    }
}