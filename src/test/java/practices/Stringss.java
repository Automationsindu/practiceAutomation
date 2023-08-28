package practices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stringss {

	static String str= "I Love India which is beautiful";
	public static void main(String[] args) {
		//split();
		//replace();
		//charAt() ;
		//reverseStr();
		//S_to_I();
		//Even_String();
		//insert_subString();
		fetch_string();
	}

	public static void split() {
		String st="";
		 String arr[]= str.split("\\s");
		for(String s:arr)
		{
			
			st=st+s;	
		}
		System.out.println(st);
		/*String[] words= str.split("\\W+");
		for(String s1:words)
		{
			System.out.println(s1 );
		}*/
		
		
	}
	
	public static void replace() 
		{
			//System.out.println(str.replace(" ", "").toUpperCase());	
			System.out.println(str.substring(1, 7));
			String newStr= str.substring(1, 7);
			System.out.println(newStr.length());
			//newStr.trim();
			System.out.println(newStr.trim().length());
			
			
		}

	public static void charAt() 
	{
		String str1= "emp1258";
				
		System.out.println("The length is  "+ str1.length());
		System.out.println("The length of str is "+ str.length());
		System.out.println(str1.charAt(2));
		
		int count=0;
		for(int i=0;i<=str.length()-1; i++)
		{
	//counting the particular character
			/*if(str.charAt(i)=='e')
			{
				count++;
			}*/
	//counting the number of white space		
			if((str.charAt(i)==' ')&& (str.charAt(i+1)!=' '))
			{
				count++;
			}
			
			
		}
		System.out.println("the count of e is "+count);	
	}
	
	public static void reverseStr()
	{
		//using concatenation
		String rStr="";
		for(int i=(str.length())-1;i>=0;i--)
		{
			rStr=rStr+str.charAt(i);
			//System.out.println("revers string is " + rStr);
		}
		
		System.out.println("revers string is " + rStr);
		
	//using StringBuffer class
		String str2="abbac";
		boolean ans=false;
		StringBuffer sb= new StringBuffer(str2);
		//System.out.println(sb.reverse().replace(2, 5, str2));
//means 2-> insert starts from that index includes, 5->insertion happens before to this index and this includes resultant
		StringBuffer sbStr= sb.reverse();
		String rstr2= sbStr.toString();
		System.out.println(sbStr.toString());
		
		if(str2.equals(rstr2))
		{
			System.out.println("Its is a paliandrome "+ str2 + "is equals "+ sbStr);
			 ans= true;
			 System.out.println("Is it a Paliandrome :"+ ans);
		}
		else
		{
			 System.out.println("Is it a Paliandrome :"+ ans);
		}
		
	}
	
	public static void S_to_I()
	{
		String str= "123";
		int num= Integer.parseInt(str);
		System.out.println(num+10);
		System.out.println(String.valueOf(num)+10);
		
	}
	public static void Even_String()
	{
		String str="Selenium is a Testing Automation tool";
		String[] aStr= str.split(" ");
		
			for(int i=0; i<=(aStr.length-1);i++)
			{
				if(i%2==0)
				{
					System.out.println(aStr[i]);
				}
				
			}
			
		
		for(int i=0;i<=(str.length()-1);i++)
		{
			if(i%2==0)
			{
				
				System.out.println("The even length characters are "+ str.charAt(i));
				
			}
		}	
	}
	
	public static void insert_subString()
	{
		String s= "456";
		String news="123789";
		int index=2;
		StringBuffer sb= new StringBuffer(s);
		//System.out.println(sb.replace(0, 0, news));
		String newnum= news.substring(0, index+1)+s+news.substring(index+1);
		System.out.println(newnum);
		
	}
	public static void fetch_string()
	{
		String str= "fdg hfhf love hfhgjh gfhgjg love fhgjgj love hfhghg";
		boolean ans = false;
		int count=0;
		int index=-1;
		if(str.contains("love"))
		{
			ans=true;
			System.out.println("the presence of string love is  "+ ans);
			
		}
		String[] finds=(str.split("\\s"));
		
		for(String find:finds)
		{
			if(find.equals("love"))
			{
				System.out.println("The search word in the string is "+ find);
				break;
			}
			
		}
		
		
			for(int i=0; i<=(finds.length-1);i++)
		{
			if(finds[i].equals("love"))
			{
				index=i;
				count=count+1;
				System.out.println("The index of love is "+ index);
				
			}
					
		}
			System.out.println("The number of occurence of targeted string is "+ count);
			List<String> strmStr= Arrays.asList(finds);
			//strmStr.stream().filter(n->n.equals("love")).forEach(System.out::println);
			long occurence= strmStr.stream().filter(n->n.equals("love")).count();
			System.out.println("The number of occurence of targeted string is "+occurence);
	}
	
		

		
	
}
