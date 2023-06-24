import java.util.Scanner;

/*Character Pattern
A A A A
B B B B
C C C C
D D D D
* */
/*
Solid Pattern
*****
*****
*****
*****

Hollow Pattern
*****
*   *
*   *
*****

*/
public class Pattern_problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m=sc.nextInt();

//        for(int i=1;i<=n;i++){
//            char ch = (char)('A'+ i-1);
//            for(int j=1;j<=i;j++){
//                System.out.print(ch);
//            }
//            System.out.println();
//        }
        //outer loop
//        for(int i=1;i<=n;i++){
            //inner loop
  //          for(int j=1;j<=m;j++){
    //            System.out.print("*");
      //      }
        //    System.out.println();
//        for(int i=1;i<=n;i++){
//            for (int j=1;j<=m;j++){
//                if(i==1||j==1||i==n||j==m){
//                    System.out.print("*");
//                }else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
