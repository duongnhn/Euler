#include <iostream>

using namespace std;

struct Node
{
  int data;
  Node * next;
};

class Stack
{
  public:
    Stack();//constructor
    ~Stack();//destructor
    void push(int);
    int pop();
    friend void print(Stack);
 // private: 
    Node *Top;
};

Stack::Stack()
{
  Top = NULL;
}


Stack::~Stack() {
  while (Top)
  {
    int n = 
  }
//	while(Top) {
//		Node *elm = Top->next;
//		delete Top;
//		Top = elm;
//	}
}

void Stack::push(int x)
{
  Node * tmp = new Node;
  tmp->data = x;
  tmp->next = Top;
  Top = tmp;
}

int Stack::pop()
{
  Node * tmp = new Node;
  tmp = Top;
  Top = Top->next;
  int val = tmp->data;
  delete(tmp);
  return val;
}

void print(Stack s)
{
  Node * tmp;
  tmp = s.Top;
  while (tmp!=NULL)
  {
    cout << tmp->data << " ";
    tmp = tmp->next;
  };
  cout << endl;
}

int main()
{
  Stack x = Stack();
  print(x);
  x.push(4);
  print(x);
  x.push(5);
  //cout << x.Top->next << endl;
  print(x);
  //print(x);
  x.push(6);
  print(x);
  int n = x.pop();
  print(x);
  getchar();
  return 0;
}

//Implement Stack with Push, Pop, Min
