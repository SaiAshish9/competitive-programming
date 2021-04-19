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


ListNode* reverse(ListNode* pre,ListNode* next){
  ListNode* last;
  ListNode* curr;
  last = new ListNode(0);
  curr = new ListNode(0);
  last = pre->next;
  curr = last->next;
  while(curr!=next){
    last->next = curr->next;
    curr->next = pre->next;
    pre->next= curr;
    curr = last->next;
  }
  return last;
}

ListNode* reverseKGroup(ListNode* head,int k){
  if(head==nullptr||k==1){
    return head;
  }
  ListNode* fake;
  fake = new ListNode(0);
  ListNode* pre;
  pre = new ListNode(0);
  fake->next = head;
  pre = fake;
  int i=0;
  ListNode* p;
  p = new ListNode(0);
  p = head;
  while(p!=nullptr){
    i+=1;
    if(i%k==0){
    pre = reverse(pre,p->next);
    p = pre->next;
    }else{
    p = p->next;
    }
  }
  return fake->next;
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
  vector<int> list1(5);
  iota(list1.begin(),list1.end(),1);
  linebreak();
  ListNode* l1;
  l1 = insert(list1);
  display(l1);
  linebreak();
  ListNode* res = reverseKGroup(l1,2);
  display(res);
  linebreak();
  return 0;
}