import java.util.*;
import java.lang.Math;  
class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int digits =0,r=0,result=0;
        while(temp>0){
            temp=temp/10;
            digits++;
        }
        System.out.println(digits);
        temp=n;
        System.out.println(temp);
       while(temp>0){
        r=temp%10;
        result+=Math.pow(r,digits);
        temp= temp/10;
       }
       System.out.println(result);
       if(n==result){
        System.out.println("it is armstrong number");
       }
       else{
        System.out.println("its not a Armstrong nuber");
       }
    }

}