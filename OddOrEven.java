import java.util.Scanner;
class OddOrEven 
{

	public static void main(String[] args) 
	{
		int num;
		System.out.println("Entered integer number");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		if(num%2==0)
		System.out.println("the number is Even");
		else
		System.out.println("the number is Odd");
	}
}
	


