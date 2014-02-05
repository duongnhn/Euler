#include <iostream>

using namespace std;

int reverse(int original_number)
{
  if (original_number < 0) return -1;
  int result = 0;
  int x;
  while (original_number>0)
  {
    x = original_number % 10;
    result = result*10+x;
    original_number = (int) original_number/10;
  }
  return result;
}

int main()
{
  cout << reverse(45632);
  getchar();
  return 0;
}
