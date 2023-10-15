#include<iostream>
#include<vector>
using namespace std;

int main() {
    vector<vector<int>> arr;

    vector<int> a{1,2,3};
    vector<int> b{2,4,6};
    vector<int> c{1,3,7};

    arr.push_back(a);
    arr.push_back(b);
    arr.push_back(c);

    vector<vector<int>> vrr(5, vector<int>(5, -8));

    for(int i=0; i < vrr.size(); i++) {
        for(int j=0; j<vrr[i].size(); j++) {
            cout << vrr[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}