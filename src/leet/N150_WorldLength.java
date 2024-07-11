package leet;

public class N150_WorldLength {
    public static void main(String[] args) {
        System.out.println(new N150_WorldLength().lengthOfLastWord("Hello World"));
        System.out.println(new N150_WorldLength().lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(new N150_WorldLength().lengthOfLastWord("a"));
        System.out.println(new N150_WorldLength().lengthOfLastWord("a "));
    }

    public int lengthOfLastWord(String s) {
        char[] array = s.toCharArray();

        int count=0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != ' ') {
                count++;
            }

            if(count != 0 && array[i] == ' ' || i == 0) {
                return count;
            }
        }

        return 0;
    }

//    public int lengthOfLastWord(String s) {
//        String[] array = s.trim().split(" ");
//        String word = array[array.length - 1];
//        return word.length();
//    }
}
