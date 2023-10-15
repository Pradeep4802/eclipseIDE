#include <iostream>
#include <vector>
using namespace std;

int findUnique(vector<int> arr) {
    int ans = 0;
    for (int i = 0; i < arr.size(); i++)
    {
        ans = ans ^ arr[i];
    }
    return ans;
}

int main()
{
    int n;
    cout << "Enter the size of the array: ";
    cin >> n;
    vector<int> vect(n);
    for (int i = 0; i < vect.size(); i++)
    {
        cin >> vect[i];
    }

    int unique = findUnique(vect);

    cout << "UNIQUE Value are : " <<  unique << endl;
    return 0;
}