package ph.edu.dlsu;

public class Main {

    public static void main(String[] args) {

        String s1 = "Welcome to New York!";

        System.out.println("Lenth of String: " + s1.length());

        int pos = s1.indexOf("New York");
        System.out.println("Position of New York " + pos);

        String sub = s1.substring(11);
        System.out.println(sub);

        String s2 = "Welcome!        ";
        int len1 = s2.length();
        System.out.println(len1);

        String s3 = s2.trim();
        System.out.println(s3.length());
    }
}
