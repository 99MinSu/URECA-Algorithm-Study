//언어 : JAVA , (성공/실패) : 1/4 , 메모리 : 365416 KB , 시간 : 2356 ms
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];

		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr); //배열 정렬함수 사용

		for(int num : arr) {
			sb.append(num).append('\n');
		}

		System.out.println(sb);
	}
}
