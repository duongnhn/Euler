#include <iostream>

using namespace std;

struct Node
{
  int data;
  Node* next;
};

void initNode(struct Node* head, int x)
{
  head->data = x;
  head->next = NULL;
}

void addNode(struct Node* head, int x)//add to the end
{
  Node *newNode = new Node;
  newNode->data = x;
  newNode->next = NULL;
  Node *curNode = head;
  while (curNode->next)
  {
    curNode = curNode->next;
  }
  curNode->next = newNode;
}

void addNode2front(struct Node** head, int x)//change the head
{
  Node *newNode = new Node;
  newNode->next = *head;
  newNode->data = x;
  *head = newNode;
}

int printList(struct Node* head)
{
  int length = 0;
  Node *curNode = head;
  while (curNode)
  {
    length++;
    cout << curNode->data << "-> " ;
    curNode = curNode->next;
  }
  cout << "NULL" << endl;
  return length;
}

//Node *newHead = new Node; //New head of reverse list
Node* reverseList(struct Node* head)
{
  Node *newHead = new Node;
  newHead->data = head->data;//New head of reverseList
  newHead->next = NULL;
  Node *curNode = new Node;
  curNode = head->next;
  while (curNode)
  {
     addNode2front(&newHead,curNode->data);
     curNode = curNode->next;
  }
  return newHead;
}

int checkPalindrome(struct Node* head, struct Node* newhead, int length)
{
  int check = 0;
  int i;
  for (i=1;i<=length/2;i++)
  {
    if (head->data!=newhead->data)
    {
      return check;
      break;
    }
    head = head->next;
    newhead = newhead->next;
  }
  check = 1;
  return check;
}

int main()
{
  Node *head = new Node;
  initNode(head, 2);
  addNode(head, 1);
  addNode(head, 1);
  addNode(head, 2);
  //addNode2front(&head, 3);
  int length = printList(head);
  Node *newhead = new Node;
  newhead = reverseList(head);
  printList(newhead);
  int check;
  check = checkPalindrome(head, newhead, length);
  if (check==1)
    cout << "Palindrome" << endl;
  else
    cout << "Not Palindrome" << endl;
  //cout << newhead->data << endl;
  getchar();
  return 0;
}
