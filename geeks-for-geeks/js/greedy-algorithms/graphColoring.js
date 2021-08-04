function addEdge(adj,v,w){
    adj[v] = [...adj[v],w]
    adj[w] = [...adj[w],v]
    // don't use adj[v].push(w)
    return adj
  }
  
  function graphColoring(adj,V){
     let result = Array(V).fill(-1)
     result[0] = 0
     let available = Array(V).fill(false)
     
     for(let u=1;u<V;u++){
       
       for(let i of adj[u]){
         if(result[i] != -1){
             available[result[i]] = true
         }
       }
  
       let cr=0
  
       while(cr < V){
          if(available[cr] === false)
          break;
          cr+=1
       }
  
       result[u] = cr
  
       for(let i of adj[u]){
         if(result[i] !== -1){
           available[result[i]] = false
         }
       }
  
     }
     
    for(let u=0;u<V;u++){
      console.log("Vertex :" + u + " ---> Color :" + result[u])
    }
  
  }
  
  var g1 = Array(5).fill([])
  g1 = addEdge(g1,0,1)
  g1 = addEdge(g1,0,2)
  g1 = addEdge(g1,1,2)
  g1 = addEdge(g1,1,3)
  g1 = addEdge(g1,2,3)
  g1 = addEdge(g1,3,4)
  graphColoring(g1,5)
  
  console.log("####################")
  
  let g2 = Array(5).fill([])
  g2 = addEdge(g2,0,1)
  g2 = addEdge(g2,0,2)
  g2 = addEdge(g2,1,2)
  g2 = addEdge(g2,1,4)
  g2 = addEdge(g2,2,4)
  g2 = addEdge(g2,4,3)
  
  graphColoring(g2,5)