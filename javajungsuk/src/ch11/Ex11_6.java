package ch11;

import java.util.Arrays;

public class Ex11_6 {
	
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12,13},{21,22,23}};
		
		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("arr2D"+Arrays.toString(arr2D));
		
		System.out.println("arr2D="+Arrays.deepToString(arr2D));
		
		int[] arr2 = Arrays.copyOf(arr, 5); // (배열,크기)
		int[] arr3 = Arrays.copyOf(arr, 3); // (배열,크기)
		int[] arr4 = Arrays.copyOf(arr, 7); // (배열,크기)
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);  // 2<= x < 4 
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);  // 0 ~ 5 까지 나머지 0으로 채움 
			
		System.out.println("arr2="+Arrays.toString(arr2)); // 0 1 2 3 4
		System.out.println("arr3="+Arrays.toString(arr3)); // 0 1 2 
		System.out.println("arr4="+Arrays.toString(arr4)); // 0 1 2 3 4 0 0
		System.out.println("arr5="+Arrays.toString(arr5)); // 2 3 
		System.out.println("arr6="+Arrays.toString(arr6)); // 0 1 2 4 0 0 
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9); // arr=[9,9,9,9,9]
		System.out.println("arr7="+Arrays.toString(arr7)); // 9, 9, 9, 9, 9

		Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1); // 1 부터 6까지 
		System.out.println("arr7="+Arrays.toString(arr7)); // 5, 5, 4, 4, 1
		
		for(int i : arr7) {
			char[] graph = new char[i];
			Arrays.fill(graph, '*'); 
			System.out.println(new String(graph)+i); 
			// *****5
			// *****5
			// ****4
			// ****4
		}
		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2)); // false
		System.out.println(Arrays.deepEquals(str2D, str2D2)); // true
		
		char[] chArr = {'A','D','C','B','E'};
		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B')); // -2 이상한값
		
		// ----------------------binarySearch 하기전에는 반드시 정렬 sort 해야함
		System.out.println("= After sorting =");
		Arrays.sort(chArr);
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B')); // 1 
	}
}
