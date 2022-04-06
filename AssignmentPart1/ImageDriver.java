/*
 Student ID:        21313091
 Name:              Conor Cusack  
 */
public class ImageDriver {
    public static void main(String[] args) {
        int[][] image1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        Image picture = new Image(image1);
        System.out.println(picture.toString());
        System.out.println(picture); // This uses the toString method

        picture.rotate(true);
        picture.rotate(true);
        picture.rotate(true);
        System.out.println(picture);

        picture.rotate(false);
        System.out.println(picture);

        picture.flip(false);
        System.out.println(picture);

        picture.flip(true);
        System.out.println(picture);
    }
}

