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


// Greedy Algorithm : Activity Selection Problem 

// Basically in this problem, we need to find out maximum number activities that a person can perform if starting and finishing time of each activity is provided. 
// Greedy approach: 
// Sort the activities according to their finishing time.
// Select the first activity from the sorted array and print it
// For the remaining activities , if the start time of this activity is greater then or equal to the finish time of previously selected activity then select thisactivity and print it .