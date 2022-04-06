
/**
 * Assignment part 3
 * Conor Cusack
 * 21313091
 */
public class TestMyToolBox{
    public static void main(String[] args){
    
        System.out.println("Posted at " + MyToolBox.timeOfDay());
        System.out.printf("The Tweet was tweeted at %s\n" , MyToolBox.timeOfDay());
        MyToolBox.analyse("Some text that you pretend to be #Twitter #Post @Dermo", 20);
        
    }
    
}
