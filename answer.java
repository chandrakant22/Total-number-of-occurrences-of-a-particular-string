package cogni_genc;

import java.util.Scanner;
//code by chandrakant bobade asterisc.in
public class answer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		
		String element[]=new String[n];
		
		
		for(int i=0;i<n;i++)
		{
			element[i]=sc.nextLine();
		}
		
		String check_element=sc.nextLine();
		
		
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(check_element.equals(element[i]))
			{
				count++;
			}
			else
			{
				String newstring="";
				
				
				for(int j=0;j<check_element.length();j++)
				{
					//checking both string length
					
					if(check_element.length()==element[i].length())
					{
						
					//checking char at index in both string 
					if(!(check_element.charAt(j)==element[i].charAt(j)))
					{
						newstring =element[i].replace(element[i].charAt(j), check_element.charAt(j));
					}
					
					}
				}
				
				
				if(newstring.equals(check_element))
				{
					count++;
				}
				
			}
		}
		
		System.out.println(count);

	}

}
