public class leetcode_2114_maxWords {
    public int mostWordsFound(String[] sentences) {
        int max =0;
        for(int i = 0; i<sentences.length; i++){
            int words = 1;
            for (int j = 0; j<sentences[i].length(); j++){
                if(sentences[i].charAt(j) == ' '){
                    words++;
                }
            }
            if (words > max){
                max = words;
            }
        }
        return max;
    }
}
