# 언어 : Java , (성공/실패) : 1/0, 메모리 : 16864 KB , 시간 : 1460 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		//가장 작은 정수보다 큰 수는 공약수가 될 수 없기 때문에 정렬후 arr[0]까지 반복
		for(int i=1; i<=arr[0]; i++) {
			int cnt = 0;
			
			// 공약수 찾기 
			for(int j=0; j<n; j++) {
				if(arr[j] % i == 0)
					cnt ++;
			}
			// 자연수 n개가 모두 i로 나누어떨어질때
			if(cnt == n)
				System.out.println(i);
		}
		
	}
	
}
