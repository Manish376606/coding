import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
            }

        }
        if(count>0){
            System.out.println("it is a  not prime number");
        }else{
            System.out.println("it is  a prime number");
        }
    }
    
}
