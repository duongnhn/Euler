#include <iostream>
#include <string>
#include <sstream>

using namespace std;

string convertInt(int number)
{
   stringstream ss;//create a stringstream
   ss << number;//add number to the stream
   return ss.str();//return a string with the contents of the stream
}

int length2(string str)
{
  int l1 = str.length();
  int l2 = 0;
  if (l1 == 0)
    return 0;
  char c = str[0];
  int count = 1;
  for (int i=1;i<l1;i++)
  {
    if (str[i]==c)
      count++;
    else
    {
      //char *intStr = itoa(count);
      string strTemp = convertInt(count);
      l2 = l2+1+strTemp.length();
      c = str[i];//reset
      count = 1;
    }
  }
  string strTemp = convertInt(count);
  l2 = l2+1+strTemp.length();
  return l2;
}

void compress(string str1, string& str2)
{
  int l1 = str1.length();
  //int l2 = str2.length();
  int count = 1;
  char c = str1[0];
  int l2 = 0;
  for (int i=1;i<l1;i++)
  {
    if (str1[i]==c)
      count++;
    else
    {
      str2[l2] = c;
      l2++;
      string s = convertInt(count);
      int ls = s.length();
      while (ls > 0)
      {
        str2[l2+ls-1] = s[ls-1];
        ls--; 
      }
      l2 = l2 + s.length();
      c = str1[i];
      count = 1;
    }
  }
  str2[l2] = c;
  l2++;
  string s = convertInt(count);
  int ls = s.length();
  while (ls > 0)
  {
    str2[l2+ls-1] = s[ls-1];
    ls--; 
  }
}

int main()
{
  string str1 = "aabbbbbbbbbbbcccca";
  int l1 = str1.length();
  int l2 = length2(str1);
  string str2(l2,' ');
  compress(str1,str2);
  cout << str2 << endl; 
  getchar();
  return 0;
}
