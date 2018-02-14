package Lab1_1;

import java.util.Scanner;

public class InfoOf3 {
  public static void main(String[] arg) {
    int a, b, c;

    Scanner keyboard = new Scanner(System.in);
    System.out.print("first number? ");
    a = keyboard.nextInt();
    System.out.print("second number? ");
    b = keyboard.nextInt();
    System.out.print("third number? ");
    c = keyboard.nextInt();
    System.out.println("allAreEqual: " + allAreEqual(a,b,c));
    System.out.println("twoAreEqual: " + twoAreEqual(a,b,c));
    System.out.println("noneAreEqual: " + noneAreEqual(a,b,c));
    System.out.println("areAscending: " + areAscending(a,b,c));
    System.out.println("areDescending: " + areDescending(a,b,c));
    System.out.println("strictlyAscending: " + strictlyAscending(a,b,c));
    System.out.println("strictlyDescending: " + strictlyDescending(a,b,c));
  }

  private static boolean allAreEqual(int a, int b, int c) {
    return (a == b && b == c);
  }

  private static boolean twoAreEqual(int a, int b, int c) {
    return ( (a == b || a == c || b == c) && !(a == b && b == c) );
  }

  private static boolean noneAreEqual(int a, int b, int c) {
    return (a != b && b != c && a != c);
  }

  private static boolean areAscending(int a, int b, int c) {
    return (a <= b && b <= c);
  }

  private static boolean areDescending(int a, int b, int c) {
    return (a >= b && b >= c);
  }

  private static boolean strictlyAscending(int a, int b, int c) {
    return (a < b && b < c);
  }

  private static boolean strictlyDescending(int a, int b, int c) {
    return (a > b && b > c);
  }

}


//  Write a program that reads three numbers from the keyboard, and then prints out some information about the relationships between the numbers-- whether they are all equal, in ascending order, in descending order, and so on. To determine these relationships, write the following boolean-valued functions:
//
//    boolean allAreEqual(int a, int b, int c);
//    boolean twoAreEqual(int a, int b, int c); // false if all three are equal
//    boolean noneAreEqual(int a, int b, int c);
//    boolean areAscending(int a, int b, int c); // true if a <= b <= c
//    boolean areDescending(int a, int b, int c); // true if a >= b >= c
//    boolean strictlyAscending(int a, int b, int c); // true if a < b < c
//    boolean strictlyDescending(int a, int b, int c); // true if a > b > c
//    Try to "talk boolean"
//
//    The name of your class should be InfoOf3.
//
//    Here is a sample execution of the program.
//    User input is in bold. Your program should replicate the prompts and output:
//
//    first number? 1
//    second number? 2
//    third number? 3
//    allAreEqual: false
//    twoAreEqual: false
//    noneAreEqual: true
//    areAscending: true
//    areDescending: false
//    strictlyAscending: true
//    strictlyDescending: false