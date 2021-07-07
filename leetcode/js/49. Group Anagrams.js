function groupAnagrams(strs){
    let result = []
    let helper = {}
    for(let s of strs){
      let tmpChar = s.split("")
      tmpChar.sort()
      let tmp = tmpChar.join("")
      if(Object.keys(helper).includes(tmp)){
         result[helper[tmp]].push(s)
         continue;
      }
      let curr =[]
      curr.push(s)
      result.push(curr)
      helper[tmp] = result.length - 1 
    }
    return result
  }
  
  const dataSet = ["eat","tea","tan","ate","nat","bat"]
  
  console.log(groupAnagrams(dataSet))