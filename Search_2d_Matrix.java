package lec14;

import java.util.Scanner;

public class Search_2d_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int c = s.nextInt();
		int [][]arr = new int[r][c];
		for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		int x = s.nextInt();
		Search(arr,x);

	}
	public static boolean Search(int[][]arr,int x) {
		int r =0;
		int c = arr[0].length;
		while(r<arr.length-1&&c>=0) {
			if(arr[r][c]==x) {
				return true;
			}else if(arr[r][c]>x) {
				c--;
			}else {
				r++;
			}
		}
		return false;
	}
	

}
