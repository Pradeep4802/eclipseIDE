#include <iostream>
#include <limits.h>
using namespace std;

void printRowWiseSum(int arr[][4], int rows, int cols)
{

    // outer loop to iterate over row
    for (int i = 0; i < rows; i++)
    {
        // Sum will calcute for each row in this variables
        // I declared insie the outer loop because at each row iteration sum will initialze with 0
        int sum = 0;

        // inner loop to traverse over colums to sum the each rows
        for (int j = 0; j < cols; j++)
        {
            // assign value of each column cell into sum with addition
            sum += arr[i][j];
        }

        // I printed the sum outside the inner loop
        cout << "Sum of Rows " << i + 1 << "th is : " << sum;
        cout << endl;
    }
}

void printColumnWiseSize(int arr[][4], int rows, int cols)
{
    for (int i = 0; i < cols; i++)
    {
        int sum = 0;
        for (int j = 0; j < rows; j++)
        {
            sum += arr[j][i];
        }
        cout << "Sum of Colums " << i + 1 << "th is : " << sum;
        cout << endl;
    }
}

bool findKey(int arr[][4], int rows, int cols, int key)
{
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            if (arr[i][j] == key)
            {
                // If the key was found then  return true
                return true;
            }
        }
    }
    // If the key was not found then return false
    return false;
}

int getMax(int arr[][4], int rows, int cols)
{
    int maxi = INT_MIN;
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            if (arr[i][j] > maxi)
            {
                // If arr[i][j]  was greater than then assign that value into maxi variables
                maxi = arr[i][j];
            }
        }
    }
    return maxi;
}

void printArray(int arr[][3], int rows, int cols)
{
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            cout << arr[i][j] << " ";
        }
        cout << endl;
    }
}

int getMin(int arr[][4], int rows, int cols)
{
    int mini = INT_MAX;
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            if (arr[i][j] < mini)
            {
                // If arr[i][j]  was less than then assign that value into maxi variables
                mini = arr[i][j];
            }
        }
    }
    return mini;
}

void transposeMatrix(int arr[][3], int rows, int cols,int trans[][3])
{
    // we need to transpose the row into column
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            // transpose goes here
            // int temp = arr[i][j];
            // arr[i][j] = arr[j][i];
            // arr[j][i] = temp;
            // swap(arr[i][j], arr[j][i]);
            trans[i][j] = arr[j][i];
            // cout << arr[i][j] << " ";
        }
        cout << endl;
    }
}

int main()
{
    // Declared array with the size of 4 by 4
    int arr[5][4] = {{1, 2, 3, 4}, {2, 3, 4, 1}, {5, 6, 1, 3}, {2, 4, 6, 8}, {1, 9, 9, 6}};
    int brr[3][3] = {{1,2,3},{4,5,6},{7,8,9}};
    int rows = 5;
    int colums = 4;

    // printRowWiseSum(arr, rows, colums);
    // printColumnWiseSize(arr, rows, colums);

    int key = 8;
    if (findKey(arr, rows, colums, key))
    {
        cout << key << " is present in array." << endl;
    }
    else
    {
        cout << key << " is not present in array." << endl;
    }

    // 3. Find Maximum And Minimum value in array
    cout << "Maximum is : " << getMax(arr, rows, colums) << endl;
    cout << "Minimum is : " << getMin(arr, rows, colums) << endl;

    cout << "--------------------------------";

    // 4. Transpose of matrix
    int trans[3][3];
    cout << "Printing Array before transpose" << endl;
    printArray(brr, 3, 3);
    transposeMatrix(brr, 3, 3,trans);
    cout << "Printing Array After transpose" << endl;
    printArray(trans, 3, 3);
    return 0;
}