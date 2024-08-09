# 언어 : Java , (성공/실패) : 1/0, 메모리 : 29456 KB , 시간 : 384 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int start = 0;
		int end = N-1;
		int closeSum = Integer.MAX_VALUE;
		int left = start;
		int right = end;
		
		while(start < end) {
			int sum = arr[start] + arr[end];
			
			if(Math.abs(sum) < Math.abs(closeSum)) {
				closeSum = sum;
				//합이 0에 가장 가까웠던 왼쪽인덱스와 오른쪽인덱스 left, right에 값 최신화
				left = start;
				right = end;
			}
			
			if(sum < 0) start++;
			else if(sum > 0) end--;
			else break;
		}
		
		System.out.print(arr[left] + " " + arr[right]);
    }
}
