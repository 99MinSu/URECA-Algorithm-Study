# 언어 : Java , (성공/실패) : 1/0, 메모리 : 16256 KB , 시간 : 184 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int min = N;
		int sum = 0;
		
		for(int i = M; i <= N; i++) {
			//소수인지 판별
			boolean check = true;
			//1이 올 수 있지만 1은 소수가 아니기에 chech에 false 저장
			if(i == 1) check = false;
			
			for(int j = 2; j < i; j++) {
				//나누어 떨어진다면 check에 false 저장
				if(i % j == 0) {
					check = false;
					break;
				}
			}
			
			//check가 true면 실수
			if(check) {
				if(min > i) min = i;
				sum += i;
			}
		}
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum + "\n" + min);
		}
	}

}
