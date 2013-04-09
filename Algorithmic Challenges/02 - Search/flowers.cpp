#include <iostream>
#include <algorithm>
using namespace std;

int K, N;
int flowers[100];


int main()
{
    cin >> N >> K;
    
    int used = 0;
    int totalBought = 1;
    int result = 0;
    
    for (int i = 0; i < N; i++) {
        cin >> flowers[i];
    }
    
    sort(flowers, flowers+N);
    
    for (int i = N-1; i >= 0; i--) {
        result += totalBought * flowers[i];
        ++used;
        
        if (used == K) {
            used = 0;
            ++totalBought;
        }
    }

    cout << result << endl;
    
    return 0;
}
