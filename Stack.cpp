#include <iostream>

using namespace std;

struct Node
{
  int data;
  Node * next;
}

int main()
{
  Node * head1,head2;
  head1->data = 3;
  head1->next = head2;
  head2->data = 4;
  head2->next = NULL;

  getchar();
  return 0;
}

//Implement Stack with Push, Pop, Min
