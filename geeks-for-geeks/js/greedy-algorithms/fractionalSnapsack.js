class Item {
    constructor(value,weight){
      this.value = value
      this.weight = weight
    }
  }
  
  function fractionalKnapsack(W,arr,n){
  
  arr.sort((a,b) => (a.value,a.weight) - (b.value/b.weight))
  
  let curWeight = 0
  let finalvalue = 0.0
  
  for (let i = 0; i < n; i++) {
    if (curWeight + arr[i].weight <= W) {
      curWeight += arr[i].weight;
      finalvalue += arr[i].value;
    }
    else {
      let remain = W - curWeight;
      finalvalue += arr[i].value * (remain/ arr[i].weight);
      break;
    }
  }
  return finalvalue;
  }
  
  let W = 50; 
  let arr = []
  arr.push(new Item(60, 10 ), new Item(100, 20), new Item(120, 30))
   
  console.log(fractionalKnapsack(W, arr, arr.length))