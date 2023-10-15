#include <iostream>
using namespace std;

void Print(int[], int);
void inc(int[], int);

void Print(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
        // cout << arr[0] ;
    }
    cout << endl;
}
void inc(int brr[], int size)
{
    brr[0] = brr[0] + 10;
    brr[1] = brr[1] + 12;

    Print(brr, size);
}

int main()
{
    int arr[] = {5, 6};
    inc(arr, 2);

    Print(arr, 2);
}
