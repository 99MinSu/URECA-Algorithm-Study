# 언어 : Java , (성공/실패) : 1/2, 메모리 : 49036 KB , 시간 : 496 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int num[] = new int[8001]; // 입력값의 범위는 -4000 ~ 4000 이므로, 8001 크기의 배열 생성
        int sum = 0;
        int max = -4000;
        int min = 4000;
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // 배열을 오름차순으로 정렬
        Arrays.sort(arr);
        
        // 배열을 순회하며 합계, 최대값, 최소값을 구하고 num 배열에 빈도수를 저장
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
            num[arr[i] + 4000]++; // 값의 범위를 0 ~ 8000으로 조정하여 저장
        }
        
        // 최빈값을 구하기 위해 num 배열을 순회
        int tmp = 0;
        int result = 0;
        for(int i = 0; i < num.length; i++) {
            if(tmp < num[i]) {
                tmp = num[i];
                result = i - 4000;
            }
        }
        
        // 최빈값이 여러 개인 경우를 처리
        int cnt = 0;
        for(int i = 0; i < num.length; i++) {
            if(tmp == num[i]) {
                result = i - 4000;
                if(cnt == 1) { // 두 번째로 작은 최빈값을 찾으면 종료
                    break;
                }
                cnt++;
            }
        }
        
        System.out.println(Math.round((double)sum / n)); // 산술평균
        System.out.println(arr[n/2]); // 중앙값
        System.out.println(result); // 최빈값
        System.out.println(max - min); // 범위
    }
}
