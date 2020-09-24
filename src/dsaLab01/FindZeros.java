package dsaLab01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindZeros {

	public static void main(String[] args) {
		
		int Nints = 4000;
		int[] theints = new int[Nints];
		int i = 0;
		String path = "files/4KintsV1.txt";
		
		try {
			File fname = new File(path);
			Scanner scan = new Scanner(fname);
			
			while(scan.hasNext()) {
				
				String number = scan.nextLine();
				theints[i] = Integer.parseInt(number);
				i++;
				
			}
			int number0 = count(theints,i);
			System.out.println(number0);
			System.out.println(sum2(theints,i));
			System.out.println(sum3(theints,i));
			
			scan.close();
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}
	
	public static int count(int[] a, int Nread) {
		
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			
			if(a[i] == 0) {
				cnt ++;
			}
		}
		
		return cnt;
		
		
	}
	
	public static int sum2(int[] a, int Nread) {
		
		int cnt = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i] + a[j] == 0) {
					cnt++;
				}
				
			}
			
		}
		return cnt;
		
	}
	
	public static int sum3(int[] a, int Nread) {
		
		int cnt = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				for (int j2 = j+1; j2 < a.length; j2++) {
					
					if(a[i] + a[j] + a[j2] == 0) {
						cnt++;
					}
				}
				
				
				
			}
			
		}
		return cnt;
		
	}

}
