import java.util.*;
public class balancedFruit{
    public static int balancedFruit(int a,int m,int rs){
        if(a>m) return rs-(a-m);
        else if(a<m) return rs+(m-a);
        else return rs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter m: ");
        int m=sc.nextInt();
        System.out.print("Enter rs: ");
        int rs=sc.nextInt();

        System.out.println("Output : "+balancedFruit(a,m,rs));
        return ;
    }    
}