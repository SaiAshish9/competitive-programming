var solveSudoku= function(board){
    solve(board,0,0)
  }
  
  var solve = function(board,i,j){
      if(i===board.length-1 && j === board[0].length){
        return true
      }
      if(j===board[0].length){
        i++
        j=0
      }
      if(board[i][j]=='.'){
         for(let k=1;k<10;k++){
          board[i][j] = String(k)
          if(valid(board,i,j)){
            if(solve(board,i,j+1)){
              return true
            }
          }
         }
         board[i][j] = '.'
      }else{
        return solve(board,i,j+1)
      }
      return false
  }
  
  var valid = function(board,x,y){
      let check = 0
      for(let j=0;j<board[0].length;j++){
        if(board[x][j]=='.'){
          continue
        }
        // "9" == 9
        let val = parseInt(board[x][j])
        if(check & (1<<(val-1)) == (1<<(val-1))){
          return false
        }else{
          check = check | (1<<(val-1))
      }
      }
      check = 0
      for(let i=0;i<board.length;i++){
        if(board[i][y]=='.'){
          continue
        }
        let val = parseInt(board[i][y])
        if(check & (1<<(val-1)) == (1<<(val-1))){
          return false
        }else{
          check = check | (1<<(val-1))
      }
      }
      let ib = parseInt(x/3)
      let jb = parseInt(y/3)
      check = 0
      for(let i=ib*3;i<(ib+1)*3;i++){
        for(let j=jb*3;j<(jb+1)*3;j++){
        let val = parseInt(board[i][j])
        if(board[i][j]=='.'){
          continue
        }
        if(check & (1<<(val-1)) == (1<<(val-1))){
          return false
        }else{
          check = check | (1<<(val-1))
        }
        }
      }
      return true
  }
  
  let c  = [
    ['5','3','.','.','7','.','.','.','.'],
    ['6','.','.','1','9','5','.','.','.'],
    ['.','9','8','.','.','.','.','6','.'],
    ['8','.','.','.','6','.','.','.','3'],
    ['4','.','.','8','.','3','.','.','1'],
    ['7','.','.','.','2','.','.','.','6'],
    ['.','6','.','.','.','.','2','8','.'],
    ['.','.','.','4','1','9','.','.','5'],
    ['.','.','.','.','8','.','.','7','9']
  ]
  
  console.log("##############################")
  console.log(c)
  solveSudoku(c)
  console.log("##############################")
  console.log(c)
  console.log("##############################")