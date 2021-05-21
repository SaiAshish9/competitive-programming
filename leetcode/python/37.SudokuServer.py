class Main:

  def solveSudoku(self,board):
      self.solve(board,0,0)

  def solve(self,board,i,j):
    if i == len(board)- 1 and j == len(board[0]):
      return True
    if j == len(board[0]):
      i +=1
      j =0
    if board[i][j] == '.':
      for k in range(1,10):
        board[i][j] = chr(k)
        print(k)
        if self.valid(board,i,j) == True:
          tmp = self.solve(board,i,j+1)
          if tmp == True:
            return True
      board[i][j] = '.'
    else:
      return self.solve(board,i,j+1)
    return False

  def valid(self,board,x,y):
    check = 0
    for j in range(len(board[0])):
      if board[x][j] not in range(9):
        continue
      val = int(board[x][j])
      if (check & (1<<(val-1))) == (1<<(val-1)) :
        return False
      else:
        check = check | (1<<(val-1))
    check = 0
    for i in range(len(board)):
      if board[i][y] not in range(9):
        continue
      val = int(board[i][y])
      if ((check & (1<<(val-1)))==1<<(val-1)):
        return False
      else:
        check = check | (1<<(val-1))
    ib = int(x/3)
    jb = int(y/3)
    check = 0
    for i in range(ib*3,(ib+1)*3):
      for j in range(jb*3,(jb+1)*3):
        if board[i][j] not in range(9):
          continue
        val = int(board[i][j])
        if ((check & (1<<(val-1))) == 1<<(val-1)):
          return False
        else:
          check =  check | (1<<(val-1))
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
print(c)
m.solveSudoku(c)
print(c)