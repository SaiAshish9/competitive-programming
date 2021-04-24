var divide = function(dividend,divisor){
    let result=0;
    let flag=1;
    if(divisor==0){
      return Number.MAX_VALUE;
    }
    if(divisor==-1&&divisor==Number.MIN_VALUE){
      return Number.MAX_VALUE;
    }
    if((dividend<0 && divisor >0)||(dividend>0&& divisor<0)){
      flag = -1;
    }
    let ldd = Math.abs(dividend);
    let ldr = Math.abs(divisor);
    while(ldd>=ldr){
      let shift = 0;
      while(ldd>=ldr<<shift){
        shift++;
      }
      shift--;
      result+= 1<<shift;
      ldd -= ldr << shift;
      console.log(`result : ${result} , ldd : ${ldd} , shift : ${shift}`)
    }
    return result*flag
  }
  
  console.log(divide(10,3))