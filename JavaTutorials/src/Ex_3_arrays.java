import java.util.ArrayList;
import java.util.Arrays;

import com.google.common.collect.ObjectArrays;

public class Ex_3_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a[] = {"A","B","C","D","E","F","G"};
		String b[] = {"NOW I KNOW MY ABCs"};
		String j1[] = ObjectArrays.concat(a, b, String.class);
		System.out.println("First is:"+Arrays.toString(j1));
		String c[] = {"123456"};
		String j2[] = ObjectArrays.concat(c, j1, String.class);
		System.out.println("Second is:"+Arrays.toString(j2));
		
		System.out.println("************************");  
		/**
		 * 
		 * 
		 * 
		 * */
		System.out.println("************************");
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("A");list.add("B");list.add("C");list.add("D");list.add("E");list.add("F");list.add("G");
		System.out.println("1st is:"+list);
		list.add("NOW I KNOW MY ABCs");
		System.out.println("2nd is:"+list);
		list.add(0, "123456");
		System.out.println("3rd is:"+list);
		//list.remove("D");list.remove("E");list.remove("F");list.remove("G");
		list.subList(4, 8).clear();
		System.out.println("4th is:"+list);
		list.remove(0);
		System.out.println("5th is:"+list);
		
		
	}

}
