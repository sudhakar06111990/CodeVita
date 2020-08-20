import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string array");
		String arr_str=sc.nextLine();
		String arr[]=arr_str.split(" ");
		String final_out="";
		int i,j,k,temp_char=0,flag_dup=0;
		String temp="";
		char temp_char1;
		for(i=0;i<arr.length;i++)
		{
			temp=arr[i];
			for(j=0;j<temp.length()-1;j++)
			{
				temp_char1=temp.charAt(j);
				for(k=j+1;k<temp.length();k++)
				{
					if(temp_char1==temp.charAt(k))
					{
						flag_dup=1;
						break;
					}
				}
				if(flag_dup==1)
				{
					break;
				}
				
			}
		
			if(flag_dup==0)
			{
				final_out=final_out+" "+temp;
				
			}
			else
			{
				flag_dup=0;
			}
		}
		int final_index=0;
		String output="";
		String[] final1=final_out.trim().split(" ");
		for(i=0;i<final1.length-1;i++)
		{
			if(final1[i].length()>final1[i+1].length())
			{
				output=final1[i];
			}
			else
			{
				output=final1[i+1];
			}
			
		}
		
		System.out.println("Largest substring with no duplicates is: "+output);
		
	}

}
