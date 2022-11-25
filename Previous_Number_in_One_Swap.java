import java.util.*;
class TestSample
{
    static String solve(String s)
    {
        char[] ch = new char[s.length()];
        for(int i = 0;i < s.length();i++)
        {
            ch[i]=s.charAt(i);
        }
        boolean x=true;
        int i;
        for(i=s.length()-1;i>0;i--)
        {
            if(ch[i-1]>ch[i])
            {
                i--;
                x=false;
                break;
            }
        }
        if(x || (i==0 && ch[i+1]=='0'))
        return "-1";
        int j,y=i+1;
        for(j=i+1;j<s.length();j++)
        {
            if(ch[y]<ch[j]&&ch[j]<ch[i])
            y=j;
        }
        char temp=ch[i];
        ch[i]=ch[y];
        ch[y]=temp;
        String s1=new String(ch);
        return s1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(solve(s));
    }
}