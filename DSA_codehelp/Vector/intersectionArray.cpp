#include <iostream>
#include <vector>
using namespace std;

int main()
{
    // first vector
    vector<int> arr{1, 2, 3, 4, 5, 6, 7};
    // second vector
    vector<int> brr{3, 4, 5, 12, 45};

    // New vector to store value
    vector<int> ans;

    // outer loop to iterate all the element
    for (int i = 0; i < arr.size(); i++)
    {
        // inner loop to test first vector any element is present or not
        for (int j = 0; j < brr.size(); j++)
        {
            // test
            if (arr[i] == brr[j])
            {
                ans.push_back(arr[i]);
            }
        }
    }

    // Print the vector 
    for (int i = 0; i < ans.size(); i++)
    {
        cout << ans[i] << " ";
    }
    cout << endl;
    return 0;
}