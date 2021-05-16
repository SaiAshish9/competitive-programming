class Main:

  def isValidSudoku(self,board):
    helper = set()
    # helper = {'a'}

    for i in range(len(board)):
      helper.clear()
      for j in range(len(board)):
        print(board[i][j],end=" ")
        if not self.process(helper,board[i][j]):
          return False
      print("\n")
    
    for j in range(len(board)):
      helper.clear()
      for i in range(len(board)):
        if not self.process(helper,board[i][j]):
          return False
    
    for i in range(0,9,3):
      for j in range(0,9,3):
        helper.clear()
        for k in range(9):
          if not self.process(helper,board[int(i+k/3)][int(j+k%3)]):
            return False
    return True
  
  def process(self,helper,c):
    if c == '.':
      return True
    if c in helper:
      return False
    helper.add(c)
    return True

m = Main()
c  = [
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
print(m.isValidSudoku(c))
