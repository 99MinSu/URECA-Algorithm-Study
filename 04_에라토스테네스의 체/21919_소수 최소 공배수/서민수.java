# 언어 : Java , (성공/실패) : 1/2, 메모리 : 	15144 KB , 시간 : 184 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        long result = 1;
        boolean foundPrime = false;

        for (int num : A) {
            if (isPrime(num)) {
                foundPrime = true;
              //1, 2, 3이 있으면 1, 2의 최소공배수를 구한후 그 값과 3의 최소공배수를 구함 => 반복
                result = lcm(result, num); 
            }
        }

        if (!foundPrime) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }
    // 소수 판별 함수
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 최대공약수
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 최소공배수를 구하는 함수
    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
}
