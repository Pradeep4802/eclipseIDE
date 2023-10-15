package com.apti3.pract;

class box
{
	int width;
	int height;
	int length;
}

class recursion
{
	int func (int n)
	{
		int result;
		if (n == 1)
			return 1;
		result = func (n - 1);
		return result;
	}
}

public class FirstTest {

	public static void main(String[] args) {

	}
}