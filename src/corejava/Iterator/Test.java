package corejava.Iterator;


import java.util.Arrays;

import java.util.List;
import java.util.Set;

public class Test {

	 static String  names;
	public static void main(String[] args) {
		 List al;
		 int count=1;
		
		Employee e1=new Employee(1,"Sravan",444);
		Employee e2=new Employee(2,"Gova",555);
		Employee e3=new Employee(3,"Sravan",2563);
		Employee e4=new Employee(4,"Mohan",444);
		Employee e5=new Employee(5,"Sravan",563);
		Employee e6=new Employee(6,"Mohini",533);
		
		List<Employee> l = /* new ArrayList<>(); */ Arrays.asList(e1,e2,e3,e4,e5,e6);		
		System.out.println("This is Original Data"+l);
		System.out.println("**********");
		System.out.println("");
		System.out.println("");
		System.out.println("**********");
		try {
			System.out.println(names.length());
			
		} catch (ArithmeticException e) 
		{
			System.out.println("please provide string data for eliminating nullpointer Exception: ");		
			}catch (Exception ee) 
		{
			System.out.println("please provide string data: ");		
			}
		}
	}
