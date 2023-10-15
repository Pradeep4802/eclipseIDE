#include <iostream>
using namespace std;

int main()
{
    // int arr[] = {1, 2, 3, -4, 5, 6, -7, 8};
    int arr[] = {1, 2, 3};
    int size = 3;

    int start = 0;
    int end = size - 1;

    while (true)
    {
        if (start > end)
        {
            break;
        }
        if (start == end)
        {
            cout << arr[start] << " ";
        }
        else
        {
            cout << arr[start] << " ";
            cout << arr[end] << " ";
        }

        start++;
        end--;
    }
    cout << endl;
    return 0;
}