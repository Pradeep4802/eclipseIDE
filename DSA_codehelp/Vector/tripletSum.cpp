#include <iostream>
#include <vector>
using namespace std;

int main()
{
    vector<int> arr{10, 20, 30, 40};
    int sum = 80;

    for (int i = 0; i < arr.size(); i++)
    {
        int elem1 = arr[i];
        for (int j = i + 1; j < arr.size(); j++)
        {
            int elem2 = arr[j];
            for (int z = j + 1; z < arr.size(); z++)
            {
                int elem3 = arr[z];
                if ((elem1 + elem2 + elem3) == sum)
                {
                    cout << "(" << arr[i] << "," << arr[j] << "," << arr[z] << ")";
                }
            }
        }
    }
    cout << endl;
    return 0;
}