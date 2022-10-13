import java.util.*;
class file
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int a,b,count=0;
        a=k.nextInt();
        b=k.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=k.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(arr[i]%b!=0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}