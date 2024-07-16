# 언어 : Java , (성공/실패) : 1/0, 메모리 : 26064 KB , 시간 : 400 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		int max = 0;// 최대 중량
		for (int i = 0; i < N; i++) {
			max = Math.max(max, arr[i] * (i+1));//로프 중에서 가장 작은 무게 * N 가 최대무대이기때문에 위에서 내림차순정렬
		}
		System.out.println(max);
	}

}
