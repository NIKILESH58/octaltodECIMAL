import java.util.Scanner;
public class octaltodECIMAL
{
    public static void main(String[] args) 

    {
        Scanner in = new Scanner(System.in);      
        int n = in.nextInt();
        int a=0,i=0,n1=n;
        double b=0,c=0,d=0;
        for(;n1>0;)
        {
            i=i+1;
            n1=n1/10;
        }
        for(;n>0;)
        {
            a=n%10;
            b=Math.pow(8,i);
            c=a*b;
            d=d+c;
            i=i-1;
            n=n/10;
        }
        System.out.println(d);
    }
}

