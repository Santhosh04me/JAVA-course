package arrayUtil;

import java.util.Arrays;

public class ArrayUtil {

	

	

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] ar= {2,3,4,5,6,8,12,13};
//		int[] br= {7,2,3,4,5,6,8,12};
////		int result=Arrays.binarySearch(ar, 8);
//		int result=Arrays.compare(ar, br);
//		System.out.println(result);
//		int[] cr =Arrays.copyOf(br, 3);
//		
//		for (int i=0;i<cr.length;i++)	
//		System.out.print(cr[i]+" ");
//		
//		System.out.println();
//		int[] dr= {7,2,9,3,5,44,23,6,8,12};
//		Arrays.sort(dr,0,10);
//		for (int i=0;i<dr.length;i++)	
//			System.out.print(dr[i]+" ");
//			
		String[] name= {"santhsh","muhtu","naveena","anbu","ranjith"};
		Mycomparator mc=new Mycomparator();
		Arrays.sort(name,mc);
		for (int i=0;i<name.length;i++)	
			System.out.println(name[i]+" ");
		
		
		
		
		
		
	}

}
