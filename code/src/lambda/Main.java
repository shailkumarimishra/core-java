package lambda;
import java.util.ArrayList;
public class Main implements C,D {

	@Override
	public void methodOne() {
		System.out.println("overriding methodOne()");
		C.super.methodOne();
//		C c=new Main();
//		c.methodOne();
	}
	public static void main(String[] args) {
//		C.super.methodOne();
		C c=new Main();
//		c.methodOne();

	}

}
interface C extends E{
default void methodOne(){
//	C.super.methodOne();
System.out.println("Interface C default method");


}
}
interface D{
default void methodOne(){
System.out.println("Interface D default method");
}
}
interface E{
	default void methodOne(){
		System.out.println("Interface E default method");

		}	
}


