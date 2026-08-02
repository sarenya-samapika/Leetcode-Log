public class leetcode_832_flip_and_invert {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] flip = new int[image.length][image[0].length];
        for(int i = 0; i < image.length ; i ++){
            for(int j = 0; j < image[i].length; j++){
                int revimage = image[i][image[i].length - 1 - j];
                flip[i][j] = 1 - revimage;
            }
        }
        return flip;
    }
}
