package methodsandencapsulation;
/**
 * #Difference between constructor overloading and method overloading:-
 * 1.you can invoke/call another constructor using this() function & 
 *   you can invoke/call another method using method signature of that method  
 * 2.constructor invocation will happen from constructor only but there is no restriction for method invocation
 *   (e.g., you can call method from block,method,constructor) 
 * 3.Recursive invocation of constructor error will happen at compile time but Recursive invocation of method error will
 *   happen at run time 
 *   
 * # similarity:
 * constructor overloading & method overloading are similar  
 */

public class ConstructorOverloading {
	ConstructorOverloading(){
		this(10,"Shail");
		m1();
	}
	ConstructorOverloading(int a,String s){
//		System.out.println("hii");
//		this(null);
//		ConstructorOverloading(null);
		this(null);
		System.out.println("Two argumented constructor");
	}
	ConstructorOverloading(Methods obj){
//		this();

		System.out.println("Methods argumented constructor");
	}
	void m1() {
		this.m2(10, "Anjali");
	}
	void m2(int a,String s) {
		this.m3(10f, 10, 20d);
	}
	void m3(float b,int a,double d) {
		System.out.println("Three argumented method");
		m1();
	}

	public static void main(String[] args) {
		ConstructorOverloading obj=new ConstructorOverloading();

	}

}
