import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Stockmax {

    public static long solve(int[] prices) {
        int biggest_next, biggest;
        biggest_next = prices[prices.length-1];
        long profit = 0;
        
        for (int i = prices.length-2; i >= 0; i--) {
            if (prices[i] > biggest_next) {
                biggest = prices[i];
            } else {
                biggest = biggest_next;
                profit += biggest_next - prices[i];
            }
            biggest_next = biggest;
        }
        
        return profit;
    }

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int T;
            String line;
            
            line = reader.readLine();
            T = Integer.parseInt(line);
            
            for (int i = 0; i < T; i++) {
                line = reader.readLine();
                int[] prices = new int[Integer.parseInt(line)];
                line = reader.readLine();
                String[] lineArgs = line.split(" ");
                
                for (int j = 0; j < lineArgs.length; j++) {
                    prices[j] = Integer.parseInt(lineArgs[j]);
                }

                System.out.println(solve(prices));
            }
        } catch (IOException e) {
        
        }
    }

}
