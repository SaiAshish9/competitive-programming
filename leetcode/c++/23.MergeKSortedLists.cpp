#include<iostream>
#include<bits/stdc++.h>
#include<vector>
#include<queue>

using namespace std;

struct ListNode {
   int val = 0;
   ListNode *next;
   ListNode() : val(0), next(nullptr) {}
   ListNode(int x) : val(x), next(nullptr) {}
   ListNode(int x, ListNode *next) : val(x), next(next) {}
};

struct compare {
    bool operator()(
        struct ListNode* a, struct ListNode* b)
    {
        return a->val > b->val;
    }
};

ListNode* mergekLists(vector<ListNode*> lists){
  priority_queue<ListNode*,vector<ListNode*>,compare> q;  
  // greater<int>> q;
  for(int i=0;i<lists.size();i++){
    if(lists[i]!=nullptr){
      q.push(lists[i]);
    }
  } 
  ListNode* fakeHead;
  ListNode* p;
  p = fakeHead;
  while(!q.empty()){
    ListNode* n;
    n= q.top();
    q.pop();
    if(n->next!=nullptr){
      q.push(n->next);
    }
    n->next = nullptr;
    p->next = n;
    p=n;
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
  vector<int> list1{1,4,5};
  vector<int> list2{1,3,4};
  linebreak();
  ListNode* l1;
  l1 = insert(list1);
  ListNode* l2;
  l2 = insert(list2);
  lists.push_back(l1);
  lists.push_back(l2);
  display(l1);
  linebreak();
  display(l2);
  linebreak();
  ListNode* res;
  res = mergekLists(lists);
  display(res);
  linebreak();
  return 0;
}