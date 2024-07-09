import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
	static int N, ans, max;
	static int[] arr;
    public static void main(String[] args) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	N = Integer.parseInt(br.readLine());
    	
    	arr = new int[N];
    	for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine()); 
		}
    	
    	Arrays.sort(arr);
    	
    	for (int i = 0; i < N; i++) {
			ans = arr[i] * (N-i);
			max = Math.max(max, ans);
		}
    	
    	System.out.println(max);
    }


}
// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 26808 KB , 시간 : 348 ms
