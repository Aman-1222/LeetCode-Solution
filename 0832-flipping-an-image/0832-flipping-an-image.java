class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length/2;j++){
                int temp=image[i][j];
                image[i][j]=image[i][image.length-1-j];
                image[i][image.length-1-j]=temp;
                image[i][j]=image[i][j]^1;
                image[i][image.length-1-j]=image[i][image.length-1-j]^1;
            }
            if(image[0].length%2!=0)
                image[i][image.length/2]=image[i][image.length/2]^1;
        }
        return image;
    }
}