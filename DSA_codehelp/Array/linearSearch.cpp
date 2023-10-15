#include <iostream>
using namespace std;

bool find(int arr[], int size, int key)
{
    if(size == 0) {
        cout << "Empty Array" << endl;
        return false;
    }
    // cout << size << endl;
    // linear search
    for (int i = 0; i < size; i++)
    {
        if (arr[i] == key)
        {

            // present
            return true;
        }
    }

    // Not present
    return false;
}

int main()
{
    // int arr[5] = {1, 3, 5, 7, 8};
    int arr[] = {-1,-3,0,0,90};

    int size = 5;

    cout << "Enter the key to find " << endl;
    int key;
    cin >> key;

    if (find(arr, sizeof(arr)/sizeof(int), key))
    {
        cout << "Found " << endl;
    }
    else
    {
        cout << "Not Found " << endl;
    }
    return 0;
}