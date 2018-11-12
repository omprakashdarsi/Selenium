package prc;

import java.io.FileNotFoundException;

public class hhh {

	
	public static void add(int i, int j){
		try{
	System.out.println("i and j is : "+ i + "     "+j);
		}
		
		catch(ArithmeticException e){
			System.out.println("arr");
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			
		}
catch(Exception e){
			
		}
		
		
	}
public  void add(String a, int b){
	
	
		
	}
public  void add(int a, String b){
	
}
public  void add(int a, char b){
	
}
public  void add(int a, int b ,int c){
	
}




public static void main(String[] args){
	hhh obj = new hhh();
	hhh.	add(20,30);
obj.	add("om",20);
obj.add(20,"om");
obj.add(90,'c');
obj.add(10,20,30);

StringBuffer sb=new StringBuffer("Hello ");
System.out.println(sb.append("om"));
System.out.println(sb.insert(1,"om"));


	}
	
	
}
