package Day7;

public class Demo {
    public static void main(String[] args) {
        // String name1 = "Pankaj";
        // System.out.println(name1);

        // String name2 = "Pankaj";
        // System.out.println(name2);

        // System.out.println(name1 == name2);

        // String collegeName1 = new String("MIT");
        // System.out.println(collegeName1);

        // String collegeName2 = new String("MIT");
        // System.out.println(collegeName2);

        // System.out.println(collegeName1.equals(collegeName2));

        // String fName = "Shizuka";

        // System.out.println(fName.hashCode());

        // fName = fName + "Kumari";

        // System.out.println(fName.hashCode());

        // String str1 = "Anas cutie";

        // System.out.println(str1.length());

        // System.out.println(str1.charAt(str1.length() - 1));

        // System.out.println(str1.toLowerCase());
        // System.out.println(str1.toUpperCase());

        // String str2 = "IronMan";

        // System.out.println(str2.contains("man"));

        // System.out.println(str2.startsWith("I"));

        // System.out.println(str2.endsWith("N"));

        // String str3 = "Shlok Pujari";

        // System.out.println(str3.substring(2, 5));

        // System.out.println(str3.replace("o", "a"));

        // String str = "Java/python/c++";

        // String arr[] = str.split("/");

        // for (String sub : arr) {
        // System.out.println(sub);
        // }

        String name = "Pankaj Oberoi";

        for (int i = 0; i < name.length(); i++) {
            name = name.toLowerCase();
            if (name.charAt(i) != 'a' &&
                    name.charAt(i) != 'e' &&
                    name.charAt(i) != 'i' &&
                    name.charAt(i) != 'o' &&
                    name.charAt(i) != 'u') {
                System.out.println(name.charAt(i));
            }

        }

    }
}
