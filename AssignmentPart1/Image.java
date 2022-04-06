import java.util.Arrays;

/*
Student ID :        21313091
Name:               Conor Cusack
*/

public class Image {
    private int[][] pixels;
    private int width;
    private int height;

    public Image(int[][] pixels) {
        this. pixels = pixels;
        this.height = pixels.length;
        this.width = pixels[0].length;
    }

    public String toString(){
        return Arrays.deepToString(pixels);
    }

    public void flip( boolean horizontal ){
        if(horizontal){
            for(int i=0; i < height; i++){
                for(int u=0; u < width/2; u++){
                    int u_mirror = width - 1 - u; //this shows the mirrored opposite 
                    
                    int temp = pixels[i][u];        //this swaps them around
                    pixels[i][u] = pixels[i][u_mirror];
                    pixels[i][u_mirror] = temp;
                }
            }
        } else {
            for(int i=0; i < height/2; i++){
                int i_mirror = height - 1 - i;

                int[] temp = pixels[i];
                pixels[i] = pixels[i_mirror];
                pixels[i_mirror] = temp;
            }
        }
    }


    public void rotate( boolean clockwise ){
        int[][] pixels_new = new int[width][height]; //width and height are flipped around
        if(clockwise){
            for(int i=0; i < height; i++){
                for(int u=0; u < width; u++){
                    pixels_new[u][height-1-i] = pixels[i][u];
                }
            }
        } else {
            for(int i=0; i < height; i++){
                for(int u=0; u < width; u++){
                    pixels_new[width-1-u][i] = pixels[i][u];
                }
            }
        }

        this.pixels = pixels_new;
        int h_new = width;
        int w_new = height;
        this.height = h_new;
        this.width = w_new;
    }
}
 