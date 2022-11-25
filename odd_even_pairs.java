import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        List<Integer>e=new ArrayList<>();
        List<Integer>o=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                e.add(a[i]);
            }
            if(a[i]%2!=0)
            {
                o.add(a[i]);
            }
        }
        int I1=e.size(),I2=o.size();
        int i=0,j=0;
        while(i<I1 || j<I2)
        {
            if(j<I2)
            {
                System.out.format("%d ",o.get(j));
                j++;
            }
            if(i<I1)
            {
                System.out.format("%d ",e.get(i));
                i++;
            }
        }
        if(n%2!=0)
        {
            System.out.println("0");
        }
    }
}