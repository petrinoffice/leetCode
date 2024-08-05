package leet;

public class N151_Reverse_Words_in_String {
    public static void main(String[] args) {
        System.out.println(new N151_Reverse_Words_in_String().reverseWords("the sky is blue"));
        System.out.println(new N151_Reverse_Words_in_String().reverseWords("  hello world  "));
        System.out.println(new N151_Reverse_Words_in_String().reverseWords("a good   example"));
    }

    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder answer = new StringBuilder();

        for (int i = strings.length - 1; i >= 0; i--) {

            if (strings[i].isBlank()) {
                continue;
            }

            answer
                    .append(" ")
                    .append(strings[i]);
        }

        return answer.delete(0,1).toString();
    }
}
