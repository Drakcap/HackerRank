import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Pairs {
    int N, K;
    int[] numbers;

    public Pairs(int N, int K, int[] numbers) {
        this.N = N;
        this.K = K;
        this.numbers = numbers;
    }
    
    public int solve() {
        Arrays.sort(numbers);
        int pair, ixRes, ix;
        int answ = 0;
        
        for (int i = 0; i < N; i++) {
            pair = numbers[i] - K;
            
            if (pair > 0) {
                ixRes = Arrays.binarySearch(numbers, pair);
                ix = ixRes;
                
                while (ix >= 0 && numbers[ix] == pair) {
                    ++answ;
                    --ix;
                }
                
                ix = ixRes+1;
                
                while (ix >= 0 && ix < numbers.length && numbers[ix] == pair) {
                    ++answ;
                    ++ix;
                }
            }
        }
        
        return answ;
    }

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int N, K;
            String line;
            String[] lineArgs;
            int[] numbers;
            
            line = reader.readLine();
            lineArgs = line.split(" ");
            
            N = Integer.parseInt(lineArgs[0]);
            K = Integer.parseInt(lineArgs[1]);
            numbers = new int[N];
            
            line = reader.readLine();
            lineArgs = line.split(" ");
            
            for (int i = 0; i < N; i++) {
                numbers[i] = Integer.parseInt(lineArgs[i]);
            }
            
            Pairs pairs = new Pairs(N, K, numbers);
            System.out.println(pairs.solve());
        } catch (IOException e) {
        
        }
    }

}