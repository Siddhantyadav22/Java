//Advance Pattern Question
/*
Butterfly Pattern
*                 *
**               **
***             ***
*******************
*******************
*******************
***             ***
**               **
*                 *
*/
//public class Pattern_problem_3 {
//    public static void main(String[] args) {
//        int n=5;
//        //uppr part
//        for(int i=1;i<=n;i++){
//            //1 part
//            for(int j=1;i<=i;j++){
//                System.out.print("*");
//            }
//            //spaces
//            int spaces=2*(n-i);
//            for(int j=1;j<=spaces;j++){
//                System.out.print(" ");
//            }
//            //2 part
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        //lower part
//        for(int i=n;i>=1; i--){
//            //1 part
//            for(int j=1;i<=i;j++){
//                System.out.print("*");
//            }
//            //spaces
//            int spaces=2*(n-i);
//            for(int j=1;j<=spaces;j++){
//                System.out.print(" ");
//            }
//            //2 part
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
// solid Rhombus
//    *****
//   *****
//  *****
// *****
//*****
public class Pattern_problem_3 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=5;k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}