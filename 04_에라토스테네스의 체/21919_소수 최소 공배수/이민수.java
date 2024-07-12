import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());

		boolean arr[] = new boolean[1000001];
		
		for (int i = 2; i < 500001; i++) {
			if (!arr[i]) {
				for (int j = i + i; j < 1000001; j += i) {
					arr[j] = true;
				}
			}
		}

		Set<Integer> set = new HashSet<>();
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (!arr[num]) {
				set.add(num);
			}
		}

		if (set.size() == 0)
			System.out.println(-1);
		else {
			long result = 1;
			for (int num : set) {
				result *= num;
			}
			System.out.println(result);
		}
	}
}
// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 17608 KB , 시간 : 180 ms
