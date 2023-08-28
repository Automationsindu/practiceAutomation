package practices;

public class Practice_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s= "abccba";
		String s="gfhjfsj";
		
		StringBuffer sb=new StringBuffer(s);
		String r_s= sb.reverse().toString();
		
		if(s.equals(r_s))
		{
			System.out.println("The String is a paliandrome "+ s + " is same as "+ r_s );
		}
		else
		{
			System.out.println("The string is not same " + s+ "is same as "+ r_s );
		}
	/*String new_s="";	
	for(int i=(s.length()-1);i>=0;i--)
	{
		
		new_s=new_s+s.charAt(i);
		
	}
		System.out.println(new_s); 
		if(s.equals(new_s))
		{
			System.out.println("Its a paliandrome string");
		}
	}*/

		
		//write a prog to count the number of words in a string
		
		String str1="Selenium Automation    testing using   BDD framework";
		int count=0;
		int num=1;
		String[] arr_str1= str1.split(" ");
		for(int i=0;i<arr_str1.length;i++)
		{
			count=num+i;
			
		}
		System.out.println("The total number of words ina string is "+ count);
		for(String new_str1:arr_str1)
		{
			if(new_str1.equals("framework"))
			{
				System.out.println("The length of target string is "+ new_str1.length());
				System.out.println(new_str1.substring(5, 9));
			}
		}
		
		String Str="This is     Java Programming";
		//String trimmedStr ="";
		//System.out.println(Str.length());
		String trimmedStr = Str.trim();
		//System.out.println(trimmedStr.length());
		//int Countt = trimmedStr.isEmpty() ? 0 : trimmedStr.split(" ").length;
		int  Countt = trimmedStr.split(" ").length;
		System.out.println(Countt);
		
	String si="Sindu";
	String sa="Saritha";
	System.out.println("sa is "+sa);
	System.out.println("si is "+si);
	
	sa=sa+si;
	si=sa+si;
	System.out.println(sa.length());
	
	sa=sa.substring(7, 12);
	System.out.println("sa is "+sa);
	
	si=si.substring(0, sa.length()+2);
	System.out.println("si is "+si);
	
	
}
}
