package Hashmapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapRandomValues {
	
	public static void main(String[] args) {
		
		Map<Integer,String> hm=new HashMap<>();
		hm.put(1,"sravan");
		hm.put(2,"pavan");
		hm.put(3,"dinesh");
		hm.put(4,"kanna");
		hm.put(5,"sravan");
		
		System.out.println("this is original DATA:"+hm);
		
		Iterator i=hm.entrySet().iterator();
		while (i.hasNext()) {
			
			if(i.equals(hm.containsValue("sravan"))) {
				
				System.out.println(hm.keySet());
			}
		}
	}
}
