import java.io.*;
import java.util.Arrays;

class Main{

  static PrintStream ps = System.out;

  static void printMaxActivities(int s[], int f[])
  {
    int i, j;
    ps.println("Following activities are selected ");
    i = 0;
    ps.print(" "+i);

    for (j = 1; j < f.length; j++)
    {
      if (s[j] >= f[i])
      {
          ps.print(" " + j);
          i = j;
      }
    }
    ps.println("");
  }

  public static void main(String ...st){
    int s[] =  {1, 3, 0, 5, 8, 5};
    int f[] =  {9, 4, 1, 7, 9, 9};
    Arrays.sort(f);
    printMaxActivities(s, f);
  }

}