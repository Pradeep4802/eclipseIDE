#include <iostream>
using namespace std;

int main()
{
    int arr[] = {0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
    int zeroc = 0;
    int oneC = 0;
    int flag = 0;
    for (int i = 0; i < sizeof(arr) / sizeof(arr[0]); i++)
    {
        // check if any element is not other than 0 and 1
        if (arr[i] == 0 || arr[i] == 1)
        {
            // If zero found , increment zero
            if (arr[i] == 0)
            {
                zeroc++;
            }

            // If one found , increment one

            if (arr[i] == 1)
            {
                oneC++;
            }
        }
        else
        {
            cout << "Only 0 and 1 are allowed in the array" << endl;
            flag = 1;
            break;
        }
    }
    if (flag == 0)
    {
        cout << zeroc << " ";
        cout << oneC << " ";
        cout << endl;
    }
    return 0;
}