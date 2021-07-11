class node{
    constructor(freq,symbol,left=null,right=null){
       this.freq = freq
       this.symbol = symbol
       this.left = left
       this.right= right
       this.huff = ''
    } 
 }
 
 function printNodes(node, val=''){
     const newVal = val + ""+ node.huff
     if(node.left)
         printNodes(node.left, newVal)
     if(node.right)
         printNodes(node.right, newVal)
     if(!node.left && !node.right)
         console.log(`${node.symbol} -> ${newVal}`)
 }
 
 const chars = ['a', 'b', 'c', 'd', 'e', 'f']
 
 const freq = [ 5, 9, 12, 13, 16, 45]
 
 let nodes = []
 
 for(let c in chars){
   nodes.push(new node(freq[c],chars[c]))
 }
 
 
 try{
 
 while(nodes.length > 1){
     nodes = nodes.sort((a,b)=>a.freq-b.freq)
     let left = nodes[0]
     let right = nodes[1]
     left.huff = 0
     right.huff = 1
     let newNode = new node(left.freq+right.freq, left.symbol+right.symbol, left, right)
     nodes = nodes.filter(x=>x.symbol!==left.symbol)
   nodes = nodes.filter(x=>x.symbol!==right.symbol)
     nodes.push(newNode)
 }
 printNodes(nodes[0])
 }catch(e){
 console.log(e)
 }
 