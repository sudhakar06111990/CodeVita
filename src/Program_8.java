import java.util.Scanner;

public class Program_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers to swap");
		Integer arr[]=new Integer[2];
		for(int i=0;i<=1;i++)
		{
			System.out.println("Enter number ["+i+"]");
			arr[i]=sc.nextInt();
		}
		System.out.println("Number before swapping is: "+ arr[0]+" "+arr[1]);
		
		arr[0]=arr[0]+arr[1];
		arr[1]=arr[0]-arr[1];
		arr[0]=arr[0]-arr[1];
		
		System.out.println("Number after swapping is: "+ arr[0]+" "+arr[1]);

	}

}
