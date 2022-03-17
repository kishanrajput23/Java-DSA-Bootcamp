class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int low = 0;
            int high = image.length-1;
            while(low<=high){
                if(image[i][low]==image[i][high])
                    image[i][low]=image[i][high] = 1-image[i][low];
                low++;
                high--;
            }
        }
        return image;
    }
}