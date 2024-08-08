package CTCI.chapter_one;

public class one_three {
    public static void main(String[] args) {
        URLify("My name is CJ Pallari");
    }

    public static void URLify(String s) {
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == ' ') {
                sb.replace(i, i + 1, "%20");
            }
        }
        s = sb.toString();
        System.out.println(s);
    }

}
