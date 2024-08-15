import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] S;
    static boolean[] check;
    
    static int min = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        S = new int[N][N];
        check = new boolean[N];
        
        for(int i = 0 ; i < N ; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < N ; j++) {
                S[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        dfs(0);
        System.out.println(min);
    }
    
    private static void dfs(int cnt) {
        if(cnt == N) {  
            int start = 0;
            int link = 0;
            
            for(int i = 0 ; i < N ; i++) {
                for(int j = i + 1 ; j < N ; j++) {
                    if(check[i] != check[j])   continue;
                    
                    if(check[i])  start += S[i][j] + S[j][i];
                    else        link  += S[i][j] + S[j][i];
                }
            }
            
            min = Math.min(min, Math.abs(start - link));
            return;
        }
 
        // 해당 cnt번 사람 선택해 스타트 팀에 넣음
        check[cnt] = true;
        dfs(cnt + 1);
        
        // 해당 cnt번 사람 비선택해 링크 팀에 넣음
        check[cnt] = false;
        dfs(cnt + 1);
    }
}
// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 19092 KB , 시간 : 1112 ms
