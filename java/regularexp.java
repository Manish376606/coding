import java.util.*;
import java.util.regex.*;

public class regularexp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        Pattern pattern =Pattern.compile("[a-z]+");
        Matcher macher = pattern.matcher(str1);
        while (macher.find()){
            System.out.println(str1.substring(macher.start(),macher.end()));
        }
    }
}
