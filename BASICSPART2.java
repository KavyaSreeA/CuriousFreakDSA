Prob 1:

Write a program which takes two values x and y. Prints x for y number of times.

Input:

2 

3

Expected Output

2

2

2

CODE:
import java.util.*;

public class PrintX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt(); 
        int y = sc.nextInt();
        
        for(int i = 0 ; i < y ; i++){
               System.out.print(x);   
        }
    }
}


Write a program to take x and print multiples of x till 1000.

Input:

100

Expected Output:

100

200

300

400

500

600

700

800

900

1000

CODE:
    
import java.util.*;

public class PrintX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt(); 
        
        for(int i = 0 ; i <= 1000 ; i+=x){
               System.out.println(i);   
        }
    }
}

Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.

Input

Nandy

Raja

5

Expected output:

NandyRaja

NandyRaja

NandyRaja

NandyRaja

NandyRaja

Explanation - Nandy is the firstName, Raja is the lastName and n is 5, so the expected output has NandyRaja printed 5 times.

  code:

  import java.util.*;

public class PrintX_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          String S1 = sc.nextLine();
          String S2 = sc.nextLine();
          int n = sc.nextInt();
          for(int i = 0 ; i < n ; i++){
                  system.out.println(S1+S2);
          }
    }
}



