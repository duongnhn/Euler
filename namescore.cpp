#include <iostream>
#include <string>
#include <fstream>
#define MAXI 6000

using namespace std;

class NameScore{
  public:
    void readfile();
    string s[MAXI];
    void sort(int);
    void print(int);
    void findscore();
    long score;
    int len;
};

//string s[MAXI];
void NameScore::readfile()
{
  ifstream myfile("names.txt");
  char str[256];
  if (myfile.is_open())
  {
    int index = -1;
    while (myfile.good())
    {
      myfile.getline(str,256,',');
      index++;
      s[index] = string(str);
      s[index] = string(s[index].begin()+1,s[index].end()-1);
      sort(index);
      //s[index] = 
      //cout << s[index] << endl;
      //cout << s[index] << endl;
      //if (index==MAXI-1) break;
    }
    myfile.close();
    len = index+1;
    //cout << index << endl;
  }
}

void NameScore::sort(int index)
{
  int i;
  string str = s[index];
  for (i=0;i<=index;i++)
    if (str.compare(s[i])<0)
      break;
  //exchage s[i] and s[index]
  if (i<index)
  {
    for (int j=index;j>i;j--)
      s[j]=s[j-1];
    s[i] = str; 
  }
}

void NameScore::print(int index)
{
  cout << s[index] << endl;
}

int scorestr(string x)
{
  int r = 0;
  for (int i=0;i<x.length();i++)
    r = r+x.at(i)-'A'+1;
  return r;
}

void NameScore::findscore()
{
  int i;
  score = 0;
  for (i=0;i<len;i++)
  {
    score = score+(long)(scorestr(s[i]))*(long)(i+1); 
    if (score < 0)
      break;      
  }
  cout << i << endl;

  //return score;
}

int main()
{
  NameScore ns;
  ns.readfile();
  cout << ns.len << endl;
  ns.print(937);
  ns.findscore();
  //string x1 = "abc";
  cout << ns.s[937] << endl;
  cout << scorestr(ns.s[937]) << endl;
  cout << ns.score << endl;
  //readfile();
  getchar();
  return 0;
}
