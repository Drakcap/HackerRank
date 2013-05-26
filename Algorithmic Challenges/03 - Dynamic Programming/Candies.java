import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Candies {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(reader.readLine());
            int[] ratings = new int[N];
            int[] countWorse = new int[N];
            
            for (int i = 0; i < N; i++) {
                ratings[i] = Integer.parseInt(reader.readLine());
            }
            
            for (int i = N-2; i >= 0; i--) {
                if (ratings[i] > ratings[i+1]) {
                    countWorse[i] = countWorse[i+1]+1;
                }
            }
            
            int answ = countWorse[0]+1;
            int previous = answ, current;
            
            for (int i = 1; i < N; i++) {
                if (ratings[i] > ratings[i-1]) {
                    current = Math.max(previous+1, countWorse[i]+1);
                } else {
                    current = countWorse[i]+1;
                }
                
                answ += current;
                previous = current;
            }
            
            System.out.println(answ);
            
        } catch (IOException e) {}
    }

}