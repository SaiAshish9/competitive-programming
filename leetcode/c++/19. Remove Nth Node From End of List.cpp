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

  ListNode* removeNthFromEnd(int n){
    int len =0;
    ListNode *tmp;
    tmp = root;
    while(tmp!=NULL){
      tmp = tmp->next;
      len++;
    }
    int toDe = len -n;
    ListNode* fake = new ListNode(0); 
    ListNode* parent = fake;
    parent->next = root;
    while(toDe>0){
      parent = parent->next;
      toDe--;
    }
    parent -> next = parent -> next -> next;
    return fake->next;
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
  m.display();
  cout << endl;
  ListNode *m1=m.removeNthFromEnd(2);
  while(m1!= nullptr){
      cout << m1 -> val << endl;
      m1 = m1 -> next;
  }  
  return 0;
}
