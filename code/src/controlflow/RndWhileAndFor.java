package controlflow;

public class RndWhileAndFor {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		int k=0;
//		long k=0;//not allowed
//		byte k=0;//allowed
		
	/**while(true)//boolean is compulsory
		System.out.println("sanjali");//infinite loop**/
		
		//rnd of for loop
		
		
//for( ; ; );
/**for( ; ; ) {
	
}**/
		//for( i=j=k=0;i<9;i++);//multiple initialisation is allowed
//		for(i=j=k=0;i<9;i++);//diff datatypes not allowed
		/**for(i=j=k=0; ;) {
			System.out.println("hello");
		}**/
		for ( ; i<9;i++) {
		++i;
		}//initialization is compulsory.
		
		
	}

}
