import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("***Program to find largest product of two consecutive elements***");
		//Taking the array size
		System.out.println("Enter the array size");
		int count=sc.nextInt();
		Integer arr[]=new Integer[count];
		System.out.println("Enter array elements");
		
		//Taking the value of an array from the user
		for(int i=0;i<count;i++)
		{
			System.out.println("Enter array element["+i+"]");
			arr[i]=sc.nextInt();
		}
		
		//Printing the value of an array
		for(int i=0;i<count;i++)
		{
			System.out.println("array element: "+arr[i]);
		}
		int max_prod=0, temp=0;
		for(int i=0;i<count-1;i++)
		{
			temp=arr[i]*arr[i+1];
			if(temp>max_prod)
			{
				max_prod=temp;
			}	
		}
		System.out.println("Maximum product of element: "+max_prod);

		
	}

}
