#include <iostream>
#include <string.h>

using namespace std;

bool palind(char* str, int i, int j)
{
  if (i>=j) return true;
  if (str[i]==str[j])
    return palind(str,i+1,j-1);
  else
    return false;
}

int main()
{
  char s[] = "ab";
  int l = strlen(s);
  cout << palind(s,0,l-1);
  getchar();
}
