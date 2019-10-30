package operators;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		int a=10;
		a=++a;
		System.out.println(a++);
		System.out.println(a);
//		a=a+ ++a + a++ + --a + ++a;
//		System.out.println(a);
		System.out.println(a+ ++a + a++ + --a + ++a);//here it binary operator is used without assigning it to a variable b/c internally .toString() metod is called which assign it to buffer.
		

	}

}
