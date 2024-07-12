import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static int n, sum, left, right, ans;
	static boolean[] check;
	static ArrayList<Integer> prime = new ArrayList<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		n = Integer.parseInt(br.readLine());

        check = new boolean[n+1];      

        if(n == 1) {
        	System.out.println(0);
        	return;
        }
        
        for(int i=2; i*i<=n; i++) {
        	if(!check[i]) {
        		for(int j=i*i; j<=n; j+=i) {
        			check[j] = true;
        		}
        	}
        }
        
		for(int i=2; i<=n; i++) {
			if(!check[i]) 
				prime.add(i);
		}

		sum= (prime.size() < 0) ? 0 : prime.get(0); // 사이즈가 0
				
		// 투 포인터
		while(left <= right && right < prime.size()) {
			if(sum <= n) {
				if(sum == n) {
					ans++;
				}
				right++;
				if(right < prime.size()) {
					sum += prime.get(right);					
				}
			}else if(sum > n) {
				sum -= prime.get(left);
				left++;
				if(left < prime.size() && left >right) { 
					left = right; // 넘어가면 두 포인터를 같은 위치로 다시 초기화
					sum = prime.get(right);
				}
			}
		}
		
		System.out.println(ans);
	}
}
// 언어 : JAVA , (성공/실패) : 1/4 , 메모리 : 29876 KB , 시간 : 212 ms
