# 언어 : Java , (성공/실패) : 1/0, 메모리 : 14980 KB , 시간 : 152 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int x = A;
			int y = B;
			int r;
			// A와 B의 최대공약수 구하기
			while(A % B != 0) {
				r = A % B;
				A = B;
				B = r;
			}
			//두 수의 곱을 최대공약수로 나눈 값
			System.out.println(x*y/B);
		}
	}
}
