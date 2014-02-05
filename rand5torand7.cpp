#include <iostream>
#include <cstdlib>
//#include <random>
#include "time.h"

using namespace std;


int rand5()
{
  srand (time(NULL));
/*  default_random_engine generator;
  uniform_int_distribution<int> distribution(1,5);
  return (distribution(generator));
*/
  return(rand()%5+1);
}

int main()
{
  cout << rand5() << endl;
  getchar();
  return 0;
}
 
