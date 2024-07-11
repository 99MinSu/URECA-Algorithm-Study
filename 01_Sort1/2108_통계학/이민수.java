import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];

		double sum = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}

		Arrays.sort(arr);

		int count = 1; // 1개로 시작
		int max = 0;

		int mod = arr[0]; // 젤 처음 겂을 최빈값으로 저장
		boolean check = false;
		for (int i = 0; i < N - 1; i++) {
			if(arr[i] == arr[i+1]) {
				count++;
			}else {
				count = 1;
			}
			if(max < count) {
				max = count;
				mod = arr[i];
				check = true;
			}else if( max == count && check == true) {
				mod = arr[i];
				check = false;
			}
		}

		System.out.println(Math.round(sum/N));
		System.out.println(arr[(N-1)/2]);
		System.out.println(mod);
		System.out.println(arr[N-1] - arr[0]);
	}
}


// 언어 : JAVA , (성공/실패) : 1/6 , 메모리 : 52648 KB , 시간 : 592 ms
