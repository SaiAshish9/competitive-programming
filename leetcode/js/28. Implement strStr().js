function strStr(haystack,needle){
    if(needle.length==0){
      return 0
    }
    var kmp = [...Array(needle.length).keys()]
    computeKMP(needle,kmp)
    var i=0
    var j=0
    while(i<haystack.length){
      console.log(i+" "+haystack.length)
      if(j==-1){
        j=0;
        i+=1;
        continue;
      }
      if(haystack[i]==needle[j]){
        if(j==needle.length-1){
          return i - needle.length + 1
        }
        i+=1
        j+=1
      }else{
        j=kmp[j]
      }
    }
    return -1;
  }
  
  function computeKMP(s,kmp){
    let prefixEnd = -1
    let suffixEnd = 0
    kmp[0] = -1
    while(suffixEnd<s.length-1){
      if(prefixEnd==-1||s[prefixEnd]==s[suffixEnd]){
        kmp[suffixEnd+1]=prefixEnd+1
        prefixEnd+=1
        suffixEnd+=1
      }else{
        prefixEnd = kmp[prefixEnd]
      }
    }
  }
  
  console.log(strStr("hello","ll"))