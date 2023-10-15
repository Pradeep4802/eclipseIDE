#include <iostream>
#include <limits.h>
using namespace std;

int maximum(int arr[], int size)
{
    // Initialize the maximum varaible with the minimum possible integer value
    int max = INT_MIN;
    for (int i = 0; i < size; i++)
    {
        if (arr[i] > max)
        {
            // If arr[i] is greater than max then assigned that arr[i] into max variable and return it.
            max = arr[i];
        }
    }
    return max;
}

int main()
{
    int arr[] = {1020, 2, 4, 101, -64, -21000, 887, -99282, 0, -45, -23000, 45};
    // int size = 6;

    cout << "Maximum Number is : " << maximum(arr, sizeof(arr) / sizeof(arr[0])) << endl;
    return 0;
}