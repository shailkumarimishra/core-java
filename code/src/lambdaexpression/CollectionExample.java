package lambdaexpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
/*Q1. int[] a={40,30,90,10,80,70,20};
 * i) Find highest element?
 * ii) Find Second highest element?
 * iii) Find lowest element?
 * iv) find second lowest element?
 */

/*add
remove
equals
hashCode
clear
contains
isEmpty
iterator
size
toArray
spliterator
addAll
stream
containsAll
removeAll
removeIf
retainAll
parallelStream
forEach*/

public class CollectionExample {

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		Collection<Integer> c1 = new ArrayList<>();
		List<Integer>l1=new ArrayList<>();
		ArrayList<Integer>a1=new ArrayList<>();
		boolean result = c.add(10);
		c.add(20);
		System.out.println(c.add(30));
		c.add(40);
		c1.add(90);
		c1.add(80);
		c1.add(70);
//		 boolean addAll(Collection<? extends E> c);
		c.addAll(c1);
//		c.addAll(l1);
//		c.addAll(a1);
		Iterator<Integer> iterator = c.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("****************************");
//		c.remove(40);
		
		c.forEach(System.out::println);
//	    boolean removeAll(Collection<?> c);
		System.out.println("****************************");
//		c.removeAll(c1);
//		c.retainAll(c1);
//		c.clear();
//	System.out.println(	c.contains(90));
		System.out.println(c1.containsAll(c));
		c.forEach(System.out::println);
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		Object[] array = c.toArray();
		Integer arr[]= {10,20,30,40};
		Integer[] array2 = c.toArray(arr);
//		default boolean removeIf(Predicate<? super E> filter)
//		boolean test(T t);
		Predicate<Integer>p=(a)->{return a>30; };
		c.removeIf(p);
		c.forEach(System.out::println);
		

	}

}
