#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <bitset>
#include <cstdio>
#include <vector>
#include <cstdlib>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
using namespace std;

void printArray(vector<int> &ar) {
    cout << ar[0];
    for (int i = 1; i < ar.size(); i++) {
        cout << " " << ar[i];
    }
    cout << endl;
}

/* Head ends here */
void insertionSort(vector <int>  ar) {
    int ix = ar.size()-1;
    int number = ar[ix];
    while (ix > 0 && ar[ix-1] > number) {
        ar[ix] = ar[ix-1];
        printArray(ar);
        ar[ix-1] = number;
        --ix;
    }
    printArray(ar);
}

/* Tail starts here */
int main() {
    vector <int>  _ar;
    int _ar_size;
    cin >> _ar_size;
    
    for(int _ar_i=0; _ar_i<_ar_size; _ar_i++) {
        int _ar_tmp;
        cin >> _ar_tmp;
        _ar.push_back(_ar_tmp); 
    }

    insertionSort(_ar);
   
    return 0;
}
