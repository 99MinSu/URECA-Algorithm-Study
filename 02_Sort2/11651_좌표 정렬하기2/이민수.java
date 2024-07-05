import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[][] arr = new int[N][2];

		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr, (e1, e2) -> { // 람다식
			if(e1[1] == e2[1]) { // y 좌표에 같은 게 있으면
				return e1[0] - e2[0]; // x 좌표 정렬
			} else {
				return e1[1] - e2[1];
			}
		});

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}


	}


}

// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 71132 KB , 시간 : 2456 ms
