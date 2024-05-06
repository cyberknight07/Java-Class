import java.util.*;

public class youtubeBasic {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int array[] = new int[20];
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			array[i] = sc.nextInt();
		
		}
		for (int i = 0; i < n; i++) {
			
			int small = array[i];
			for (int j = i; j < n; j++) {
				
				if(small > array[j]){
					
					small = array[j];
					i = j;
				}				
			}
			System.out.println(small + "is the smallest number.");

		}
	}
}
  
