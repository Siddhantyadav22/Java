//Print Number from 5 to 1


package Recursion;
/* 
public class Ques_1 {
    public static void printNumber(int n){
        if(n==0) return; //BASE Case
        System.out.println(n);
        printNumber(n-1);//recursion
    }
    public static void main(String[] args) {
        int n=5;
        printNumber(n);
    }
}
*/

//Print numbers from 1 to 5
/* 
public class Ques_1{
    public static void printNumber(int n){
        if(n==6) return;
        System.out.println(n);
        printNumber(n+1);
    }
    public static void main(String[] args){
        int n=1;
        printNumber(n);
    }
}
*/

//Print sum of first n natural numbers.
/*public class Ques_1{
    public static void printSum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);
        System.out.println(i);
    }
    public static void main(String[] args) {
        printSum(1, 5, 0);
    }
}*/

//Print Factorial of a number n;
/*
 * public class Ques_1{
    public static int calfactorial(int n){
        if(n==1 || n ==0){
            return 1;
        }
        int fact_nm1= calfactorial(n-1);
        int fact_n=n*fact_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        int n =5;
        int ans = calfactorial(n);
        System.out.println(ans);
    }
}
 */

 //print the fibonacci sequence till nth term
 /*
  * public class Ques_1{
    public static void printFibonacci(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        printFibonacci(b, c, n-1);
    }
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int n=7;
        printFibonacci(a, b, n-2);
    }
 }
  */

// print x^n(stack height = n)
/*
 * public class Ques_1{
    public static int calcPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPownm1= calcPower(x, n-1);
        int xPown = x*xPownm1;
        return xPown;
    }
    public static void main(String[] args) {
        int x = 2, n=5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
 */

//Print x^n(stack height = logn)
public class Ques_1{
    public static int calcPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2 ==0){
            return calcPower(x, n/2)*calcPower(x, n/2);    
        }
        else{
            return calcPower(x, n/2)*calcPower(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}