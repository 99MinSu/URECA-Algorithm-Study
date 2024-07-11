import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String[] s = new String[N];

		for (int i = 0; i < N; i++) {
			s[i] = br.readLine();
		}

		Arrays.sort(s, new Comparator<String>() {
			public int compare(String s1, String s2) {
				// 단어 길이가 같을 경우
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				// 그 외의 경우
				else {
					return s1.length() - s2.length();
				}
			}
		});

		System.out.println(s[0]);

		for (int i = 1; i < N ; i++) {
			// 중복되지 않는 단어만 출력
			if (!s[i].equals(s[i - 1])) {
				System.out.println(s[i]);
			}
		}
	}
}
 // 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 22620 KB , 시간 : 556 ms
