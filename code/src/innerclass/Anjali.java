package innerclass;

import java.util.Comparator;

public class Anjali {
	public int m1() {
		return 200;
	}
  Ambe a = new Ambe() {
	 public int m1() {
		 System.out.println("m1()");
		 return 100;
	 }
	 
  };//Anonymous class
  Comparator<Integer> comp=new Comparator() {

	@Override
	public int compare(Object o1, Object o2) {
		return 0;
	}
	  
  };
}
class Ambe{
	
}