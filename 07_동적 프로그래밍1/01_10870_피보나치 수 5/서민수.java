 // 언어 : Java , (성공/실패) : 1/0 , 메모리 : 14152 KB , 시간 : 120 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        System.out.println(fibo(n));
    }
    
    public static int fibo(int n) {
    	if(n <= 1) {
    		return n;
    	}
    	else {
    		return fibo(n-2) + fibo(n-1);
    	}
    }
}
