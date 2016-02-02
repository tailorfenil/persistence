import java.util.HashSet;
import java.util.Set;

public class HasTwoIntegersSumtTo12 {

	public static void main(String[] args) {
		System.out.println(has2IntegersSumTo12(new int[] {2,6,2,7,8,2,1,2,93,5,9}));
		int a=8;
		System.out.println(a&5);
		System.out.println(a>>=1);
		
	}
	
	public static boolean has2IntegersSumTo12(int[] a) {
		if(a==null || a.length < 2) return false;
		
		Set<Integer> s = new HashSet<Integer>();
		for(int i=0; i< a.length; i++) {
			if(s.contains(12-a[i])) return true;
			s.add(new Integer(a[i]));
			System.out.println(s);
		}
		return false;
	}
}