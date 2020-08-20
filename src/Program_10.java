import java.util.Scanner;

public class Program_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	public void displ();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arr_size=sc.nextInt();
		Integer[] arr=new Integer[arr_size];
		for(int i=0;i<arr_size;i++)
		{
			System.out.println("Enter Number ["+i+"]: ");
			arr[i]=sc.nextInt();
		}
		int j=0,k, max1=0,max2=0,sec_max=0;
		for(j=0;j<arr_size-1;j++)
		{
			max1=arr[j];
				if(max1 < arr[j+1])
				{
					max1=arr[j+1];
				}
		}
		System.out.println("maximum number is: "+max1);
		for(j=0;j<arr_size-1;j++)
		{
				max2=arr[j];
			
				if(max1==arr[j+1])
				{
					continue;
				}
				else if(max2 < arr[j+1])
				{
					max2=arr[j+1];
					sec_max=max2;
				}
		}
		System.out.println("Second maximum number is: "+sec_max);
		
	}

}
