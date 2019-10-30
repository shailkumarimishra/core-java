package methodsandencapsulation;
// local variable->argument variable->instance variable->static variable(Scope)
public class ScopeOfLocalVariables {
	{
	int x;	
	}
	static {
	int x;	
	}
	public void m1() {
	int x;	
	}
	public static void m2() {
//	static int x;//with local variable or method parameter only final is applicable.
	}
	public void m3(int i,int j) {
//		int i;
	}
	public static void m4(String s1,char c) {
//		int s1;
		try {
			int x=10;
		}
		catch(Exception e) {
//		System.out.println(x);	
		}
		finally {
//			System.out.println(x);
		}
	}
	public void m5() {
		if(true);
		for(int x=0; ;);
//		System.out.println(x);
		/*do {
			int x=9;
			}while(x>10);*///In while loop we can't use x because scope of x is limited to do block.(out of scope)
	}
}
