import java.util.Scanner;

public class Program_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the last number for fibinacci series");
		int	last_num=sc.nextInt();
		int f0=0,f1=1,f=0;
		while(f<last_num)
		{
			if(f0==0 && f1==1)
			{
				System.out.print(f0+" "+f1+" ");
			}
			else
			{
				System.out.print(f+" ");
			}
			f=f0+f1;
			f0=f1;
			f1=f;
		}
	}

}
