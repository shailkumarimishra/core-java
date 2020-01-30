package api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		boolean b=list.add(10);
		System.out.println(b);
		list.add("Anjali");
		list.add(10.0);
		list.add(129);
		list.add("Shail");
		boolean b1=list.add(null);
		System.out.println(b1);
		/*for(int i=0;i<list.size();i++) {
		int a=(int)list.get(i);
		System.out.println(a);
		
		}*/
//		List<Integer> list2=new ArrayList<>();//polymorphism
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		/*for(int i=0;i<list2.size();i++) {
			int a=list2.get(i);
			System.out.println(a);
		}*/
		int i=0;
		/*while(i<list2.size()) {
			int a=list2.get(i);
			System.out.println(a);
			i++;
		}*/
		/*for(int a : list2) {
			System.out.println(a);
		}*/
		/*Iterator<Integer> iterator = list2.iterator();
		while(iterator.hasNext()) {
			int next=iterator.next();
			System.out.println(next);
		}*/
		/*ListIterator<Integer> listIterator = list2.listIterator();
		while(listIterator.hasNext()) {
			int next=listIterator.next();
			System.out.println(next);
		}*/
		/*Enumeration<Integer> enumeration = Collections.enumeration(list2);
		while(enumeration.hasMoreElements()) {
			int next=enumeration.nextElement();
			System.out.println(next);
		}*/
//		list2.forEach(j->System.out.println(j));
//		list2.stream().forEach(System.out::println);
		list2.forEach(System.out::println);

	}

}
