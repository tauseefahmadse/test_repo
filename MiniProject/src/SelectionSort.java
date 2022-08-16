
public class SelectionSort {
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,8,1,9,3,0};
		int n = arr.length;
		// Selection Sort time complexity O(n^2) 
		for(int i=0; i<n-1;i++) {
			int min = i;
			for(int j=i+1; j<n; j++) {
				if(arr[min] > arr[j]) {
					min= j;
				}		
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		// end of Bubble Sort 
		printArray(arr);
	}
}
