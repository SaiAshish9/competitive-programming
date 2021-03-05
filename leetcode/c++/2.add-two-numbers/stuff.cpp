#include <iostream>
#include <cmath> 

using namespace std;

struct Node
{
	int data;
	struct Node* next;
};

void insert(Node** root, int item){
  Node *temp = new Node;
  Node* ptr;
  temp -> data = item;
  temp -> next = NULL;

  if(*root == NULL)
  	*root = temp;
  else{
  	ptr = *root;
  	while(ptr -> next != NULL)
  		ptr = ptr -> next;
  	ptr -> next = temp;
  }
}

void display(Node* root) 
{ 
    while (root != NULL) { 
        cout << root->data << " "; 
        root = root->next; 
    } 
    cout << endl;
} 
  
Node *arrayToList(int arr[], int n) 
{ 
    Node *root = NULL; 
    for (int i = 0; i < n; i++) 
        insert(&root, arr[i]); 
   return root; 
} 

int count(Node *root){
  int x=0;
  while(root!=NULL){
    x++;
    root= root->next;
  }
  return x;
}

int sum(Node* root,int len){
  int x =0;
  for(int i=len-1;i>=0;i--){
    x += root->data * pow(10,i);
    root=root->next;
  }
  return x;
}

int main(int argc,char const *argv[]){  
  int data1[]= {2,4,3};
  int data2[] = {5,6,4};
  int n = sizeof(data1)/sizeof(data1[0]);
  Node *l1 = arrayToList(data1,n);
  Node *l2 = arrayToList(data2,n);
  display(l1);
  display(l2);
  int length1 = count(l1);int length2 = count(l2);
  int total = sum(l1,length1) + sum(l2,length2);
  int ans=0;
  n=total;
  while(n>0){
   ans = ans*10 + n%10;
   n/=10;
  }
  cout << ans << endl;
  return 0;
}