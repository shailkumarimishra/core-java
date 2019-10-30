package operators;

public class ShortCircuitOperator {

	public static void main(String[] args) {
		int a=10;
		if(a>0 || ++a<10)
		{
			a++;
		}
		
		System.out.println(a);//11

	}

}
