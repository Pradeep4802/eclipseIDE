#include <iostream>
#include <vector>
using namespace std;

int main()
{
    vector<int> arr{1, 3, 5, 7};
    int sum = 8;
    vector<int> pair;

    for (int i = 0; i < arr.size(); i++)
    {
        for (int j = i + 1; j < arr.size(); j++)
        {
            if ((arr[i] + arr[j]) == sum)
            {
                pair.push_back(arr[i]);
                pair.push_back(arr[j]);
                break;
            }
        }
        break;
    }

    // print the pair
    for (int i = 0; i < pair.size(); i++)
    {
        cout << pair[i] << " ";
    }
    cout << endl;

    return 0;
}