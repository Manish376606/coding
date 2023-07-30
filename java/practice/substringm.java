import java.util.*;
public class substringm {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String sub;
        System.out.println("enter the string");
        String str=sc.nextLine();
        System.out.println("enter strating index of substring");
        int n= sc.nextInt();
        System.out.println("enter the ending index of substring");
        int m= sc.nextInt();
        String str1 = str.substring(n,m);
        System.out.println(str1);
        for(int i=0;i<str.length();i++){
            for(int j=1;j<str.length()-i;j++){
                 sub =str.substring(i,i+j);
                 System.out.println(sub);
            } 
            
        }

    }
    
}
