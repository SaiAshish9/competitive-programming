```

void permutations(string &currstr,set<string> &strings,int start,int len){

if(start==len-1)
strings.insert(currstr)
return
} 

permutations(currstr,strings,start+1,len)
currstr.insert(start+1," ")
permutations(currstr,strings,start+2,len+1)
currstr.erase(start+1,1)
}
```