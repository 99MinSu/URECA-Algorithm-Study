import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    static int [][] map;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        map = new int[N+1][M+1];

        for(int i = 1; i <= N; ++i)
        {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= M; ++j)
            {
              // 누적 합 사용 
                map[i][j] = Integer.parseInt(st.nextToken()) + map[i-1][j] + map[i][j-1] - map[i-1][j-1];
            }
        }

        int K = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < K; ++i)
        {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            sb.append(map[x2][y2] - map[x2][y1-1] - map[x1-1][y2] + map[x1-1][y1-1] + "\n"); // 구간 합 사용
        }

        System.out.println(sb);
    }
}
// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 120028 KB , 시간 : 840 ms
