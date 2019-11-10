#define _CRT_SECURE_NO_WARNINGS 1

#include<stdio.h>

#include "stdio.h"

int main()
{
	int i = 2;
	int j = 2;
	for (i = 100; i <= 200; i++)
	{
		int j = 1;
		int a = 0;
		for (j = 1; j <= i; j++)
		{
			
			if (i%j == 0)
			{
				a++;
			}
		}
		if (a == 2)
		{
			printf("%d\n", i);
		}
	}
	return 0;
}

#if 0

#include<math.h>

unsigned int reverse_bit(unsigned int value)
{
	double i = 0;
	double sum = 0;
	for (i = 31; i >= 0; i--)
	{
		if (value != 0)
		{
			if ((value & 1) == 1)
			{
				sum = pow(2, i) + sum;
			}
			value = value >> 1;
		}
		else
		{
			return sum;
		}
	}
}

int main()
{
	double a = reverse_bit(25);
	printf("%f\n", a);
}
//int main()
//{
//	int a = 10;
//	int b = 16;
//	int c = 0;
//	c = b+((a - b) >> 1);//右移相当与除；
//	printf("%d\n", c);
//	return 0;
//}

//void Nizhi(char *left, char *right)
//{
//	while (left<right)
//	{
//		char tmp = *left;
//		*left = *right;
//		*right = tmp;
//		left++;
//		right--;
//	}
//}
//void reverse_str(char arr[], int len)
//{
//	char *left = arr;
//	char *right = arr + len - 1;
//	char *start = arr;
//	char *end = arr;
//	Nizhi(left, right);
//	while (*end != '\0')
//	{
//		while ((*end != ' ') && (*end != '\0'))
//		{
//			end++;
//		}
//		Nizhi(start, end - 1);
//		if (*end != '\0')
//		{
//			start = end + 1;
//			end = start;
//		}
//	}
//}
//int main()
//{
//	char arr[] = "student a am i";
//	int len = 0;
//	len = sizeof(arr) / sizeof(arr[0]) - 1;
//	reverse_str(arr, len);
//	printf("%s\n", arr);
//	return 0;
//}
//



#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<assert.h>
#include<string.h>
//void reverse_string(char *str)
//{
//	assert(str != NULL);
//	char tmp = *str;
//	int len = strlen(str);
//	*str = *(str + len - 1);
//	*(str + len - 1) = '\0';
//
//	if (strlen(str + 1) >= 2)
//		reverse_string(str + 1);
//	*(str + len - 1) = tmp;
//}
void reverse(char *left, char *right)
{
	while (left<right)
	{
		char tmp = *left;
		*left = *right;
		*right = tmp;
		left++;
		right--;
	}
}
void Hh(char arr[],int len)
{
	char*end = arr;
	char*start = arr;
	char*left = arr; 
	char*right = arr+(len-1);
	while (*end != '\0')
	{
		while ((*end != '\0') && (*end != ' '))
		{
			end++;
		}
		reverse(left, right);
		if (*end != '\0')
		{
			start = end + 1;
			end = start;
		}

	}
}

int main()
{
	char arr[] = "student a am i";
	int len = sizeof(arr) / sizeof(arr[0]) - 1;
	Hh(arr, len);
	printf("%s", arr);
}

//int main()
//{
//	char a[14] = "student a am i";
//	char b[14] = { 0 };
//	char c[14] = { 0 };
//	int i = 0;
//	int j = 0;
//	int m= 0;
//	int n = 0;
//	while (i<14)
//	{
//		j = 0;
//		
//		for (; i < 14; i++, j++)
//		{
//			
//			if (a[i] !=' ')
//			{
//				b[j] = a[i];
//			}
//			else
//			{
//				i++;
//				j++;
//				break;
//			}
//
//		}
//		reverse_string(b);
//
//		for ( m=0; m < i-1 ;n++, m++)
//		{
//			a[n] = b[m];
//		}
//		for (m = 0; m < i-1; m++)
//		{
//			b[m] = 0;
//		}
//		n++;
//	}
//	/*for (m = 0; m < i - 1; m++)
//	{
//		b[m] = 0;
//	}*/
//	reverse_string(a);
//	printf("%s\n", a);
//}



int main()
//打印杨辉三角
{
	int i=0;
	int j = 0;
	int arr[5][5] = { 0 };
	for (i = 0; i < 5; i++)
	{
		arr[i][0] = 1;
		for (j = 1; j <= i; j++)
		{
			arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
		}
	}
	for (i = 0; i < 5; i++)
	{
		for (j = 0; j <= i; j++)
		{
			printf("%d ", arr[i][j]);
		}
		printf("\n");
	}
	return 0;
}


int main()
//找出真凶
{
	char xs = 'a';
	for (xs = 'a'; xs <= 'd'; xs++)
	{
		if ((xs != 'a') + (xs == 'c') + (xs == 'd') + (xs != 'd') == 3)
		{
			printf("凶手是：%c\n",xs);
		}
	}
	return 0;
}


int main()
//确定本次比赛的正确排名
{
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;
	int e = 0;
	for (a = 1; a <= 5; a++)
	{
		for (b = 1; b <= 5; b++)
		{
			for (c = 1; c <= 5; c++)
			{
				for (d = 1; d <= 5;d++)
				{
					for (e = 1; e <= 5;e++)
					{
						if (((a == 3) + (b == 2)) == 1 &&
							((e == 4) + (b == 2)) == 1 &&
							((c == 1) + (d == 2)) == 1 &&
							((c == 5) + (d == 3)) == 1 &&
							((a == 1) + (e == 4)) == 1)
						{
							if (a*b*c*d*e == 120)
							{
								printf("a是第%d名\n",a);
								printf("b是第%d名\n",b);
								printf("c是第%d名\n",c);
								printf("d是第%d名\n",d);
								printf("e是第%d名\n",e);
							}
						}
					}
				}
			}
		}
	}
	return 0;
}

int main()
{
	int a[7] = {  2, 2, 8, 6,6, 5, 5 };
	int i = 0;
	int j = 0;
	for (i = 0; i < 7; i++)
	{
		int count = 0;
		for (j = 0; j < 7; j++)
		{
			if (a[i]>a[j])
			{
				if ((a[i] & a[j]) == a[i])
				{
					count++;
				}
			}
			else if (a[i] < a[j])
			{
				if ((a[i] & a[j]) == a[j])
				{
					count++;
				}
			}
			else
			{
				count++;
			}
		}
		if (count == 1)
		{
			printf("%d\n", a[i]);
		}
	}
	return 0;
}



int main()
{
	int a = 46;
	int b = 88;
	b = b + (a - b) / 2;
	printf("%d\n", b);
	return 0;
}


unsigned int reverse_bit(unsigned int value)
{
	double i = 0;
	double sum = 0;
	for (i = 31; i >= 0; i--)
	{
		if (value != 0)
		{
			if ((value & 1) == 1)
			{
				sum = pow(2, i) + sum;
			}
			value = value >> 1;
		}
		else
		{
			return sum;
		}
	}
}

int main()
{
	double a = reverse_bit(25);
	printf("%f\n", a);
}




void Shuchu(int n)//输出一个整数的每一位
{
	if (n>9)
	{
		Shuchu(n / 10);
	}
	printf("%d", n%10);
	printf("\n");
}

int main()
{
	Shuchu(1234);
	return 0;
}



int count_one_bits(unsigned int value)//返回一个数二进制序列中1的个数
{
	int count = 0;
	int i = 1;
	while (i <= 32)
	{
		if ((value & 1) == 1)
		{
			count++;
		}
		value = value >> 1;
		i++;
	}
	return count;
}

int main()
{
	int ret = count_one_bits(11);
	printf("%d\n", ret);
	return 0;
}


void Print(int n)//获取一个数二进制序列中的偶数位和奇数位
{
	int i = 0;
	printf("偶数位：");
	for (i = 31; i >= 1; i -= 2)
	{
		printf("%d ", ((n >> i) & 1));
	}
	printf("\n");
	printf("奇数位：");
	for (i = 30; i >= 0; i -= 2)
	{
		printf("%d ", ((n >> i) & 1));
	}
	printf("\n");
}

int main()
{
	 Print(12);
	return 0;
}


//0000 0111   
//0001 0101  
//0001 0010

int Fun(int num1, int num2)//两个整形数的二进制中位置

{
	int tmp = num1 ^ num2;
	int count = 0;
	while (tmp != 0)
	{
		count++;
		tmp = tmp & (tmp - 1);
	}
	return count;
}int main()
{
	printf("%d\n", Fun(12, 21));
	return 0;
}
#endif