import java.util.Scanner;

public class Count_specific_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the m:");
        int m=scanner.nextInt();
        System.out.println("Enter the n:");
        int n=scanner.nextInt();
        int result=countSpecificNumber(m,n);
        System.out.println(result);
        scanner.close();
    }

    public static int countSpecificNumber(int m,int n){
        if(m>n) return -1;
        int count=0;
        for(int i=m;i<n;i++){
            if(hasOnlyDigits(i,"149")) count++;
        }
        return count;
    }

    /**
     * @param num
     * @param s
     * @return
     */
    static boolean hasOnlyDigits(int num,String s){
        String numStr=Integer.toString(num);
        for(char c:numStr.toCharArray()){
            if(s.indexOf(c)==-1) return false;
        }
        return true;
    }

}