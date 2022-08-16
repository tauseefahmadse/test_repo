
public class BubbleSort {
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,8,1,9,3,0};
		int n = arr.length;
		// Bubble Sort time complexity O(n^2) 
		for(int i=0; i<n-1;i++) {
			for(int j=0;j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}		
			}
		}
		// end of Bubble Sort 
		printArray(arr);
	}
}
