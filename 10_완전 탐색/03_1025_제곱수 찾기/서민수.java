# 언어 : Java , (성공/실패) : 1/0, 메모리 : 14368	 KB , 시간 : 132 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[][] arr;
	static int result = -1;
	
	static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        arr = new int[10][10];
        
        for (int i = 0; i < N; i++) {
			String[] s = br.readLine().split("");
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(s[j]);
			}
		}
        
        for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				for (int mi = -N; mi < N; mi++) {
					for (int mj = -M; mj < M; mj++) {
						if(mi == 0 && mj == 0) {
							continue;
						}
						
						int t = 0;
						int newI = i;
						int newJ = j;
						while(newI >= 0 && newI < N && newJ >= 0 && newJ <M) {
							t = 10 * t + arr[newI][newJ];
							
							if (Math.abs(Math.sqrt(t) - (int)Math.sqrt(t)) < 1e-10){
                                result = Math.max(result, t);
                            }
							newI += mi;
							newJ += mj;
						}
					}
				}
			}
		}
        System.out.println(result);
    }
}
