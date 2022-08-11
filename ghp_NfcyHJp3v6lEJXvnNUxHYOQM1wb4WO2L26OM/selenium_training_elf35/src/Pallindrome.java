
public class Pallindrome {
	public static void main(String[] args) {
int num=1234321,sum=0,rem=0,temp=num;
while(num>0)
{
	rem=num%10;
	sum=(sum*10)+rem;
	num=num/10;
}
if (temp==sum) {
	System.out.println("its a pallindrome number");
}
else {
	System.out.println("its not a pallindrome number");
	
}
	}

}
