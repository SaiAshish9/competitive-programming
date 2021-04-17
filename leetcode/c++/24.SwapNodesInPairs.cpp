#include<iostream>
#include<bits/stdc++.h>
#include<vector>

using namespace std;

struct ListNode {
   int val = 0;
   ListNode *next;
   ListNode() : val(0), next(nullptr) {}
   ListNode(int x) : val(x), next(nullptr) {}
   ListNode(int x, ListNode *next) : val(x), next(next) {}
};


ListNode* swapPairs(ListNode* head){
  ListNode* fakeHead = new ListNode();
  fakeHead->next = head;
  ListNode* node;
  node = fakeHead;
  while(node != nullptr && node->next != nullptr && node->next->next != nullptr){
    ListNode* first = node;
    ListNode* second = node->next;
    ListNode* third = node->next->next;
    first->next = third;
    second->next = third->next;
    third->next = second;
    node = second;
  }
  return fakeHead->next;
}

void linebreak(){
  cout << "######################\n";
}

void display(ListNode* l){
  ListNode* temp;
  temp=l;
  while(temp!=nullptr){
    cout<<temp->val<<endl;
    temp = temp->next;
  }
}

ListNode* insert(vector<int> l){
 ListNode* root;
 for(int i=0;i<l.size();i++){
   ListNode* data;
   data = new ListNode(l[i]);
   if(i==0){
     root = data;
   }else{
     ListNode* temp;
     temp = root;
     while(temp->next!=nullptr){
       temp = temp->next;
     }
     temp->next = data;
   }
 }
 return root;
}

int main(){
  vector<ListNode*> lists;
  vector<int> list1{1,2,3,4};
  linebreak();
  ListNode* l1;
  l1 = insert(list1);
  display(l1);
  linebreak();
  ListNode* res = swapPairs(l1);
  display(res);
  linebreak();
  return 0;
}