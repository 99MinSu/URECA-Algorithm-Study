// 언어 : Java , (성공/실패) : 1/0 , 메모리 : 19152 KB , 시간 : 1180 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N, result;
	static int[][] matrix;
	static boolean[] visited;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		matrix = new int[N][N];
		visited = new boolean[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				matrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		result = Integer.MAX_VALUE;
		
		back(0);
		
		System.out.println(result);
	}
	
	static void back(int cnt) {
		if(cnt == N) {
			int start = 0;
			int link = 0;
			
			for (int i = 0; i < N; i++) {
				for (int j = i+1; j < N; j++) {
					if(visited[i] != visited[j])continue;
					if(visited[i]) {
						start += matrix[i][j] + matrix[j][i];
					}
					else {
						link += matrix[i][j] + matrix[j][i];
					}
				}
			}
			result = Math.min(result, Math.abs(start - link));
			
			return;
		}
		
		visited[cnt] = true;
		back(cnt+1);
		visited[cnt] = false;
		back(cnt+1);
	}
}
