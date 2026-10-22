public class leetcode_709_toLowerCase {
    public String toLowerCase(String s) {
        StringBuilder word = new StringBuilder();
        for(int i =0; i< s.length();i++){
            char ch = s.charAt(i);
            word.append(Character.toLowerCase(ch));
        }
        return word.toString();
    }
}
