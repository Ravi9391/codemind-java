import java.util.*;
class file
{
    public static void main(String args[])
    {
        Scanner k=new Scanner(System.in);
        int hf,sf,sp;
        hf=k.nextInt();
        sf=k.nextInt();
        sp=k.nextInt();
        if(hf>50 && sf>60 && sp>100)
        {
            System.out.println("10");
        }
        else if(hf>50 && sf>60)
        {
            System.out.println("9");
        }
        else if(sf>60 && sp>100)
        {
            System.out.println("8");
        }
        else if(hf>50 && sp>100)
        {
            System.out.println("7");
        }
        else if(hf>50||sf>60||sp>100)
        {
            System.out.println("6");
        }
        else
        {
            System.out.println("5");
        }
    }
}