
public class ExcerciseDay4 {
		public static void main(String args[]) {
			int i=1;
		
			int number[];
			number = new int[50];
			while(i<=50) {
				number[i-1]=i;
				i++; 
			}
			int y=0;
			while(y<50) {
				System.out.println(number[y]);
				y++;
			}
		}
}
