var isValidSudoku = function(board){
    let helper = new Set()
    for(let i in board){
      helper.clear()
      for(let j in board){
        if(!process(helper,board[i][j])){
          return false
        }
      }
      console.log('\n')
    }
    for(let j in board){
      helper.clear()
      for(let i in board){
        if(!process(helper,board[i][j])){
          return false
        }
      }
    }
    for(let i=0;i<9;i+=3){
      for(let j=0;j<9;j+=3){
        helper.clear()
        for(let k=0;k<9;k+=3){
          if(!process(helper,board[parseInt(i+k/3)][parseInt(j+k%3)])){
            return false
          }
        }
      }
    }
    return true
  }
  
  
  var process = function(helper,c){
    if(c=='.'){
      return true
    }
    if(helper.has(c)){
      return false
    }
    helper.add(c)
    return true
  }
  
  console.log(isValidSudoku([
    ['5','3','.','.','7','.','7','.','.'],
    ['6','.','.','1','9','5','.','.','.'],
    ['.','9','8','.','.','.','.','6','.'],
    ['8','.','.','.','6','.','.','.','3'],
    ['4','.','.','8','.','3','.','.','1'],
    ['7','.','.','.','2','.','.','.','6'],
    ['.','6','.','.','.','.','2','8','.'],
    ['.','.','.','4','1','9','.','.','5'],
    ['.','.','.','.','8','.','.','7','9']
  ]))