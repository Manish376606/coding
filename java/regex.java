import java.util.*;
import java.util.regex.*;
class regex{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
       String s1 = sc.nextLine();
       
      Pattern pattern = Pattern.compile(s1);
      String s2 = sc.next();
    Matcher macher =pattern.matcher(s2);
    if(macher.matches()){
        System.out.println("yes");
    }else{
        System.out.println("no");
    }
    }
}