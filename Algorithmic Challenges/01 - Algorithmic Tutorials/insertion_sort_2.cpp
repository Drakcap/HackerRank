#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

void 
printArray(vector<int> &ar) {
    cout << ar[0];
    for (int i = 1; i < ar.size(); i++) {
        cout << " " << ar[i];
    }
    cout << endl;
}

void 
insertionSort(vector<int> &ar, int start, int end) {
    int ix = end;
    int number = ar[ix];
    while (ix > 0 && ar[ix-1] > number) {
        ar[ix] = ar[ix-1];
        ar[ix-1] = number;
        --ix;
    }
    printArray(ar);
}

int 
main() {
    
    int size,  n;
    vector<int> ar;
    
    cin >> size;
    
    for (int i = 0; i < size; i++) {
        cin >> n;
        ar.push_back(n);
    }
    
    for (int i = 1; i < size; i++) {
        insertionSort(ar, 0, i);
    }
    
    return 0;
}
