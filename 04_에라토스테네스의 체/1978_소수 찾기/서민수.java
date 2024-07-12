# 언어 : Java , (성공/실패) : 1/0, 메모리 : 	14136 KB , 시간 : 108 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int chk = 0;
			int num = Integer.parseInt(st.nextToken());
			if(num < 2) continue;
			//반복을 제곱근까지 하는 이유는 약수특성상 약수쌍의 한쪽은 무조건 제곱근 이하이기 떄문
			for (int j = 2; j <= Math.sqrt(num); j++) {
        // 나누어 떨어지면 chk를 증가
				if(num % j == 0) chk++;
				
			}
			if(chk == 0) cnt++; //chk가 0이면 소수
		}
		System.out.println(cnt);
	}
}
