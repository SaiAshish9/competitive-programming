function printMaxActivities(s,f){

    let i,j;
    console.log("Following activities are selected ")
    i=0;
    console.log(" "+i)
  
    for (j = 1; j < f.length; j++)
    {
      if (s[j] >= f[i])
      {
            console.log(" " + j);
            i = j;
      }
    }
  }
  
  const s = [1,3,0,5,8,5]
  const f = [9,4,1,7,9,9]
  
  f.sort()
  
  printMaxActivities(s,f)