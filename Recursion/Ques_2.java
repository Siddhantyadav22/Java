package Recursion;

//Tower of Hanoi
/* 
 * public class Ques_2 {
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println(" transfer desk "+ n +" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println(" transfer desk "+ n +" from "+src+" to "+dest);
        towerOfHanoi(n-1, helper, src , dest);
    }
    public static void main(String[] args) {
        int n=3;
        towerOfHanoi(n, "S", "H", "D");
    }    
}
*/

//Print a string in reverse
/*
 * public class Ques_2{

    public static void printReverse(String str,int index){
        if(index==0){
            System.out.print(str.charAt(index)+" ");
            return;
        }
        System.out.print(str.charAt(index)+" ");
        printReverse(str, index-1);
    }
    public static void main(String[] args) {
        String str= "abcd";
        printReverse(str, str.length()-1);
    }
}
 */

//Find the 1st & last occurance of an element in string
/*
 * 
public class Ques_2{
    public static int first =-1;
    public static int last =-1;

    public static void flOccurence(String str,int index,char element){
        if(index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChat = str.charAt(index);
        if(currChat == element){
            if(first == -1){
                first = index;
            }
            last = index;
        }
        flOccurence(str, index+1, element);
    }
     public static void main(String[] args) {
        String str ="abaacdaefaah";
        flOccurence(str, 0, 'a');
     }
}
 */

 //Check if an array is sorted Strictly increasing
 /*
  * public class Ques_2{
    public static boolean isSorted(int[] arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(idx >= arr[idx+1]){
            isSorted(arr,idx+1);
        }
        return isSorted(arr, idx+1);// }else{
        //     return false;
        // }
        // return false;    
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(isSorted(arr, 0));
    }
 }
  */

// Move all 'x' to the end of the string
/*
 * public class Ques_2{
    public static void moveall(String strr,int idx, int count,String newString){
        if(idx==strr.length()){
            for(int i=0;i<count;i++){
                newString +='x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = strr.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveall(strr, idx+1, count, newString);
        }
        else{
            newString += currChar;
            moveall(strr, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String strr = "axbcxxd";
        moveall(strr, 0, 0, "");
    }
}
 */

 //Remove the duplicates int a string
/*
 *  public class Ques_2{
    public static boolean[] map = new boolean[26];

    public static void removeDuplicate(String str,int idx , String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicate(str, idx+1, newString);
        }else{
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicate(str, 0,"");
    }
 }
 */

 //Print all the subsequences of a string
 public class Ques_2{
    public static void subsequences(String str,int idx,String newString){
        if(idx  == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
    
        subsequences(str, idx+1, newString+currChar); // to be

        subsequences(str, idx+1, newString); // to not be 
    }
    public static void main(String[] args) {
        String str ="abc";
        subsequences(str, 0, ""); 
    }
 }