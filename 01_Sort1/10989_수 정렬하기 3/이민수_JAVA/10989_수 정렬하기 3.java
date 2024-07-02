import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
        
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
        
		Arrays.sort(arr);
        
		for(int i = 0; i < N; i++){
			sb.append(arr[i]).append('\n');
		}
 
		System.out.println(sb);
	}
}
// 언어 : JAVA , (성공/실패) : 1/4 , 메모리 : 360780KB , 시간 : 2328 ms
// 실패 시간초과 4번 (퀵 정렬, Arrays.sort)
// StrigBuilder 사용하니까 통과됐다... 엄청 오래 걸린 것을 보니 겨우 통과 한 것 같다.
