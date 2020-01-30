package javabasics;
/**
 * This program gives you information about students record;
 * @author HP
 *
 */
public class CountObjects {
static int count=0;
int a;
int b;
int c;

CountObjects(){
	System.out.println(++count);
}
	public static void main(String[] args) {
		new CountObjects();
		new CountObjects();
		new CountObjects();
		new CountObjects();
		new CountObjects();

	}

}
