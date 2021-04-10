#include <iostream>
#include <bits/stdc++.h>
#include <vector>

using namespace std;

struct ListNode {
   int val = 0;
   ListNode *next;
   ListNode() : val(0), next(nullptr) {}
   ListNode(int x) : val(x), next(nullptr) {}
   ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Main{
  
  public:
  ListNode *root;

  void add(vector<int> v1){
  vector<int> v(v1);
  ListNode* temp= new ListNode();
  for(auto i=0;i<v.size();i++){
    if(v.size()==0)
    return;
    else if(i==0){
     root = new ListNode(v[i]);
    }else{
     temp = root;
     while(temp->next!=nullptr){
      temp = temp -> next;
     }
     temp -> next = new ListNode(v[i]);
    }
  }
  }

  static ListNode* mergeTwoLists(ListNode* l1,ListNode* l2){
    ListNode* l3   = new ListNode(-1);
    ListNode* node = l3;
    while(l1 != nullptr && l2 != nullptr){
       if(l1->val < l2->val){
         node-> next = l1;
         l1 = l1->next;
         node = node->next;
       }else{
         node-> next = l2;
         l2 = l2->next;
         node = node->next; 
       }
    }
    if(l1 != nullptr){
      node->next = l1;
    }else if(l2 != nullptr){
      node->next = l2;
    }
    return l3->next;
  }

  void display(){
    ListNode *temp = new ListNode();
    temp = root;
    while(temp!= nullptr){
      cout << temp -> val << endl;
      temp = temp -> next;
    }
  }

};


int main(){
  vector<int> v(5);
  iota(v.begin(),v.end(),1);
  Main m;
  m.add(v);
  Main m1;
  m1.add(v);
  cout << endl;
  ListNode* m2=Main::mergeTwoLists(m.root,m1.root);
  while(m2!= nullptr){
      cout << m2 -> val << endl;
      m2 = m2 -> next;
  }  
  return 0;
}
