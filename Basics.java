Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.


Input:  2 Name y

code :
import java.util.*;
public class BasicSyntax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.nextLine();
        char c = sc.next().charAt(0);
        System.out.println(N);
        System.out.println(S);
        System.out.println(c);
    }
}

Prob 2: Write a program to check whether a triangle can be formed with the given values for the angles.

If sum of angles is equal to 180, then triangle can be formed, else it can't be formed.

Input: 45 45 45

code:
  import java.util.*;  
  public class Hello{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum = A+B+C
        if(sum == 180){
          System.out.print("Triangle Can Be formed");
        }
        else{
         System.out.print("Triangle cannot be formed");

        }
      }
  }

Prob 3: 

Given mark of student, Print the Grade

Grade A if mark is greater than or equal to 90

Grade B if mark is greater than or equal to 80

Grade C if mark if greater than or equal to 60

Grade D if mark if greaer than or equal to 35

Fail if mark is lesser than 35


Input: 95

Expected Output:

Grade A

code:


  import java.util.*;  
  public class Hello{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
       if(mark >= 90){
         System.out.print("Grade A");
       }
        else if(mark >= 80){
          System.out.print("Grade B");
        } 
        else if(mark >= 60){
            System.out.print("Grade C");
        }
        else if (mark >= 35){
            System.out.print("Grade D");
        }
        else{
             System.out.print("Fail");   
        }
      }
  }


Prob 4: Write a program using switch case which takes a value and prints the respective Size.
If size is 29 then its small

If size is 30 then its Medium

If size is 38 then its Large

If size is 42 then its XLarge

If size is not any of the above then Invalid.



Input: 29

Expected Output: 

Small

CODE:


  import java.util.*;  
  public class Hello{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        switch(size){
          case 29:
              System.out.print("Small");
          case 30:
              System.out.print("Medium");
          case 38:
              System.out.print("Large");
          case 42:
              System.out.print("XLarge");
          default:
              System.out.println("Invalid");
        }
      }
  }


  

