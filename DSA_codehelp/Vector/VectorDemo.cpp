#include <iostream>
#include <vector>
using namespace std;

int main()
{
    vector<int> arr(10,-1);
    vector<int> brr{10,20,30,40,50};

    // arr.push_back(12);
    // arr.push_back(45);
    // arr.push_back(67);

    for (int i = 0; i < brr.size(); i++)
    {
        cout << brr[i] << endl;
    }
    

    cout << "SizeOf : " << sizeof(arr)/sizeof(int) << endl;
    cout << "Size of the vector : " << arr.size() << endl;
    cout << "Capacity of the vector : " << arr.capacity() << endl;

    cout << "IS u r Vector is empty or not : " << brr.empty() << endl;

    int a = 10;
    int b = 20;

    a = a ^ b;
    cout << "A : " << a << endl;
    b = a ^ b;
    a = a ^ b;

    cout << a << endl << b << endl;
    return 0;
}