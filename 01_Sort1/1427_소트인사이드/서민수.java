# 언어 : Java , (성공/실패) : 1/0, 메모리 : 14352 KB , 시간 : 124 ms
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N[] = br.readLine().split("");
		
		Arrays.sort(N, Comparator.reverseOrder()); //array 내림차순
		
		for(int i=0;i<N.length;i++) {
			System.out.print(N[i]);
		}
		
	}
}
