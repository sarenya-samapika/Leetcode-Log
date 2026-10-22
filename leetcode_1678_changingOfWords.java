public class leetcode_1678_changingOfWords {
    public String interpret(String command) {
        StringBuilder word = new StringBuilder();
        for(int i =0; i < command.length(); i++){
            if(command.charAt(i)=='G'){
                word.append('G');
            }
            else if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    word.append('o');
                    i++;
                }
                else{
                    word.append("al");
                    i+=3;
                }
            }
        }
        return word.toString();
    }
}
