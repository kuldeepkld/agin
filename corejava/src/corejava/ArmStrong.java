package corejava;
public class ArmStrong {
public static void main (String[]args){
int num=123456, temp= num, strong=0, count=0, rem;
while (num>0)
{ num=num/10;
count++;
	}
num=temp;
while(num>0)
{
rem= num%10;
strong=strong+kaa(count, rem);
num= num/10;
}
System.out.println(strong);
if (strong==temp)
	System.out.println("Armstrong");
else
	System.out.println("not Armstrong");}
 public static int kaa(int arg1,int arg2)
{ int a=1;
for (int i=1; i<=arg1; i++)
{a =a*arg2;}
return a;}
}