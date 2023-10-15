#include <iostream>
// #include <limit>
#include <vector>
using namespace std;

int main()
{
    int arr[] = {2, 4, 6, 8, 75, 90};
    int brr[] = {1, 3, 7, 4, 9, 3};

    vector<int> vrr;

    for (int i = 0; i < sizeof(arr) / sizeof(int); i++)
    {
        vrr.push_back(arr[i]);
    }
    for (int i = 0; i < sizeof(brr) / sizeof(int); i++)
    {
        vrr.push_back(brr[i]);
    }

    vector<int> uni;

    for (int i = 0; i < vrr.size(); i++)
    {
        for (int j = i+1; j < vrr.size(); j++)
        {
            if (vrr[i] == vrr[j])
            {
                vrr[j] = -1;
            }
        }
    }
    
    for (int i = 0; i < vrr.size(); i++)
    {
        if (vrr[i] != -1)
        {
            uni.push_back(vrr[i]);
        }
    }
    for (int i = 0; i < uni.size(); i++)
    {
        cout << uni[i] << " ";
    }
    cout << endl;
    return 0;
}