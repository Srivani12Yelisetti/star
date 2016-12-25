import java.util.Scanner;
public class Amstrong
{
public static void main(String args[])
{
int i,num,r,a=0,c;
System.out.println(" enter the number ");
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
c=i;
while(i>0)
{
num=i%10;
a=a+(num*num*num);
i=i/10;
}
if(c==a)
System.out.println(" the number is amstrong ");
else
System.out.println( " the number is not amstrong ");
}
}
 

