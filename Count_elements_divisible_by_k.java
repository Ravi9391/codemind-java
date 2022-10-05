import java.util.*;
class file
{
    public static void main(String args[])
    {
        Scanner k=new Scanner(System.in);
        int n,m,count=0;
        n=k.nextInt();
        int arr[]=new int[n];
        m=k.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=k.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%m==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}