import java.util.*;
class fab{
    public static int fab(int a){
        int result =0;
     if(a<=1){
        return a;
     }else{
        result = fab(a-1)+fab(a-2);

     }
      return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your number ");
        int a= sc.nextInt();
       
        int result =fab(a);
        System.out.println(result);
        
    }
} 

