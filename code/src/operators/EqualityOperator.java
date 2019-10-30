package operators;

public class EqualityOperator {

	public static void main(String[] args) {
		String s1="Anjali";
		String s2="Anjali";
		System.out.println(s2);//Anjali
		System.out.println(s1==s2);//true@doubt
		System.out.println(s1.equals(s2));//true
		String s3=new String("shail");
		String s4=new String("shail");
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));//true
        s2="Anu";//khule mei sonch nahi karna hai...but yaha band hai :)
        System.out.println(s2);
	}

}
