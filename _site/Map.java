package week14_theFinal;

import java.util.*;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String side = sc.nextLine();
		int sidelength = Integer.parseInt(side);
		String [] map1 = sc.nextLine().split(" ");
		String [] map2 = sc.nextLine().split(" ");
		char[][] map = new char[sidelength][sidelength];
		
		for (int i=0;i<map1.length;i++) {
			int to_Int1 = Integer.parseInt(map1[i]);
			int to_Int2 = Integer.parseInt(map2[i]);//문자를 숫자로!
			String to_binary1 = Integer.toBinaryString(to_Int1);
			String to_binary2 = Integer.toBinaryString(to_Int2);//이진수로 바꾸어!
			char [] baeyal1 = to_binary1.toCharArray();
			char [] baeyal2 = to_binary2.toCharArray();//이진수를 문자열로 반환하여 저장(ex : '00100'이면 0 0 1 0 0으로 char형 배열에 저장)

			for (int j=0;j<to_binary1.length();j++) {
				int hap1 = Character.getNumericValue(baeyal1[j]);
				int hap2 = Character.getNumericValue(baeyal2[j]);//숫자로 바꾸어~
				switch(hap1+hap2) {
				case 0 :
					map [i][j]  = '0';
				case 1 :
					map [i][j]  = '-';
				case 2 :
					map [i][j]  = '#';
				}
				
			}
			
		}
		
		
		for (int i = 0; i < sidelength; i++) {
	         for (int j = 0; j < sidelength; j++) {
	            System.out.print(map[i][j]);
	         }
	         System.out.println();	      }
		
	}

}

