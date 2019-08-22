import java.util.ArrayList;
import java.util.List;

public class Exaple {
	
	 static final List a=new ArrayList();
	
	
	public static void main(String[] args) {
		//final List a=new ArrayList();
		 a.add(1);	
		 a.add(2);	
		 a.add(" ");	
		 a.add(3);	
		 a.add(new ArrayList<>());
		 System.out.println(a);
		 
		 a.remove(2);
	 
	 System.out.println(a);
	 List a1=new ArrayList();
	 a1.add(6);
	 a1.add(7);
	 a1.add(8);
	 a1.add(9);
	 System.out.println(a1);
	// a=a1;
	 a1=a;
	 a.add(a1);
	 
	 System.out.println(a);
	 
	}

}
