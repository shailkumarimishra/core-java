package operators;

public class InstanceOfOperator {

	public static void main(String[] args) {
		Child c=new Child();
		Parent p=new Parent();
		Parent p1=new Child();
		if(p1 instanceof Child)//true but (p instanceof Child) -> false
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}

	}

}
