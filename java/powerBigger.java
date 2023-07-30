import java.util.*;
public class powerBigger {
    public static int Bigger(int n,int m){

        int result =0, finalresult=0;
        if(m==1){
            return n;
        }else{
        result= Bigger(n,m/2);
        finalresult= result*result;
        if(m%2==0){
            return finalresult;
        }else{
           return n*finalresult;
        }
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the power");
        int m=sc.nextInt();
        int result = Bigger(n,m);
        System.out.println(result);
    }
}
