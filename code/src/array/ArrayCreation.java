package array;

public class ArrayCreation {

	private static final int MAX_VALUE = 2147483647;

	public static void main(String[] args) {
		int[] a=new int[0];
		System.out.println(a);
		System.out.println(a.length);
//		System.out.println(a[0]);
		/*for(int i=0;i<10;i++) {
			System.out.println(a[i]);
		}
		for(int i:a) {
			System.out.println(i);
		}*/
		/*int[] b={10,20,30,40,50,60};
		for(int i:b) {
			System.out.println(i);
		}*/
		/*Object[] obj=new Object[10];
		obj[0]=10;
		obj[1]="Anjali";
		obj[2]=20.0d;
		for(Object v:obj) {
			System.out.println(v);
		}*/
		int[] b= {};
		System.out.println(b);
		System.out.println(b.length);
		System.out.println(b[0]);

	}

}
