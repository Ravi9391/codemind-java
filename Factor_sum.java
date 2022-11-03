import java.util.*;
class Solution
{
    public static int factor(int n)
    {
        int s=0;
        for(int i=1;i<n+1;i++)
        {
            if(n%i==0)
            {
                s+=i;
            }
        }
        return s;
    }
    public static int coderboltey(int[] a,int n,int se)
    {
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==se)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] a=s.split(",");
        List<Integer> I=new ArrayList<>();
        Arrays.sort(a);
        int[] arr=Arrays.asList(a).stream().mapToInt(Integer::parseInt).toArray();
        int f=0;
        for(int i=0;i<arr.length;i++)
        {
            int p=factor(arr[i]);
            int r=coderboltey(arr,arr.length,p);
            if(r==1)
            {
                I.add(arr[i]);
            }
        }
        if(I.size()>0)
        {
            for(int i=0;i<I.size();i++)
            {
                System.out.print(I.get(i)+" ");
            }
        }
        else
        {
            System.out.print(-1);
        }
    }
}