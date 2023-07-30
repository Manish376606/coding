import java.util.*;
class staircase{
    public static int fct(int a){
        int result =0;
     if(a<=1){
        return a;
     }else{
        result = fct(a-1)+fct(a-2);

     }
      return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your number ");
        int a= sc.nextInt();
       
        int result =fct(a+1);
        System.out.println(result);
        
    }
} 