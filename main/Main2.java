public class Main2 {
    public static void main(String[] args) {

        System.out.println(anagrams("abc", "aab"));
    }

    public static boolean anagrams(String first, String second) {
        char[] chars = first.toCharArray();
        char[] chars1 = second.toCharArray();
        boolean[] booleans = new boolean[chars.length];
        boolean[] booleans1 = new boolean[chars1.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars.length != chars1.length) {
                return false;
            }
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars1[j] && !booleans1[j]) {
                    booleans[i] = true;
                    booleans1[j] = true;
                }
            }

        }
        for (int j = 0; j < booleans.length; j++) {
            if (!booleans1[j] || !booleans[j]) {
                return false;
            }
        }
        return true;
    }
}
