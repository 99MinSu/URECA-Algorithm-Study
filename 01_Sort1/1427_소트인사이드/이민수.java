import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		List<Integer>list = new ArrayList<>(); 
		
		for (int i = 0; i < N.length(); i++) {
			list.add( N.charAt(i) - '0');
		}
		Collections.sort(list,Collections.reverseOrder()); // 내림차순 정렬 함수 사용했습니다.
		
		for (Integer i : list) {
			System.out.print(i);
		}		
		
	}
}
 // 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14376 KB , 시간 : 104 ms
