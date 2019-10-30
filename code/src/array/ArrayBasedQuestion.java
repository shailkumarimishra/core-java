package array;

public class ArrayBasedQuestion {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70,80,90};//1
//		int[] b= {4,5,8,9,12,15,18,1,3};//max,min,2nd largest value print 
        for(int i=0;i<a.length;i++) {
        	if(i>0 && i%3==0) {
        		System.out.println();
        	}
        	System.out.print(a[i]+" ");
        }
	}

}
