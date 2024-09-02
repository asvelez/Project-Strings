public class Main {
    public static void main(String[] args) {

        // Create two strings
        String str1 = "HeLlO";
        String str2 = "hello";

        // Compare strings (case-sensitive)
        boolean areEqual = str1.equals(str2);
        System.out.println("Are str1 and str2 equal (case-sensitive)? " + areEqual);

        // Compare strings (case-insensitive)
        boolean areEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("Are str1 and str2 equal (case-insensitive)? " + areEqualIgnoreCase);

        // Convert to lowercase
        String lowerStr1 = str1.toLowerCase();
        System.out.println("str1 in lowercase: " + lowerStr1);

        // Convert to uppercase
        String upperStr2 = str2.toUpperCase();
        System.out.println("str2 in uppercase: " + upperStr2);

        // Compare after converting to lowercase
        areEqual = lowerStr1.equals(str2.toLowerCase());
        System.out.println("Are str1 and str2 equal after converting to lowercase? " + areEqual);
    }
}
