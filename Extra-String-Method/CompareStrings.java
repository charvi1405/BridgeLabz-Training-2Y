import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        
        int len1 = s1.length();
        int len2 = s2.length();
        int minLen = Math.min(len1, len2);
        
        int i = 0;
        while (i < minLen) {
            if (s1.charAt(i) < s2.charAt(i)) {
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
                return;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
                return;
            }
            i++;
        }
        
        if (len1 < len2) {
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
        } else if (len1 > len2) {
            System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are equal");
        }
    }
}
