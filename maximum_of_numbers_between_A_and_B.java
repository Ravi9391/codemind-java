import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        List<Integer> I=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        int c=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>=b && a[i]<=c)
            {
                I.add(a[i]);
                count++;
            }
        }
        if(count==0)
        {
            System.out.println(-1);
        }
        else
        {
            int s=Collections.max(I);
            System.out.println(s);
        }
    }
}