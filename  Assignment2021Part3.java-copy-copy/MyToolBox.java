
/**
 * Assignment part 3
 * Conor Cusack
 * 21313091
 */
public class MyToolBox{
    public static String  timeOfDay(){

        final long MILLISECONDS_IN_A_DAY = 24 * 60 * 60 * 1000; 
        final long SECONDS_IN_AN_HOUR = 60 * 60;

        long secondsSinceMidnight = 0;
        long hour = 0, minute = 0, second = 0;

        int numberOfUser = 0, numberOfHash = 0;

        //This calculates the time
        secondsSinceMidnight = (System.currentTimeMillis() % MILLISECONDS_IN_A_DAY)/1000;

        hour = secondsSinceMidnight / SECONDS_IN_AN_HOUR;
        minute = (secondsSinceMidnight % SECONDS_IN_AN_HOUR) / 60;
        second = secondsSinceMidnight % 60;

        String time;

        time = String.format("%02d:%02d:%02d" ,hour, minute, second);

        return time;

    }

    public static void tweetHeader(int width){
        if(width <= 0){
            width = 0;
        }
        else if(width < 10){
            width = 10;
        }
        else if(width > 80){
            width = 80;
        }

        //Prints out the 10's based on the width's 10's unit
        for(int i = 1; i <= (width / 10); i = i + 1){
            System.out.printf("%10d", i);

        }
        
        System.out.println();
        
        for(int i = 1; i <= width ; i++){
            System.out.print( i % 10 );
            
        }
        
        System.out.println();
        
        System.out.println( "=".repeat(width) );

    }
    
    public static void displayTweet(String tweetText, int width){
      if(tweetText.length() > 0){
        
        if(width <= 10){
            width = 10;
        }
        else if (width > 80){
            width = 80;
        }
        
        tweetHeader(width);
        
        //Prints out the length of the tweet
        for (int i = 0; i < tweetText.length(); i = i + width) {
            String tweetsplit = tweetText.substring(i, Math.min(i + width, tweetText.length()));
            System.out.println(tweetsplit);
        }
 
        }
        
    
    }
    
    public static int countOf(String tweetText, char symbol){
        int numberOfChar = -1;
        
        //If the symbol isnt # or @ then it returns -1 else it will return the number of #'s or @'s
        if (symbol != '#' && symbol != '@'){
        return -1;
        }
        else{
            numberOfChar = tweetText.length() - tweetText.replace(Character.toString( symbol ), "").length();
        }
        
        return numberOfChar;
     }
    
    public static void analyse(String tweet, int width){
        displayTweet(tweet, width);
        
        String hash = "Hashtags";
        String user = "Usernames";
        //counts the number of #'s and @'s
        int numHash = countOf(tweet, '#');
        int numUser = countOf(tweet, '@');
        
        if(numHash == 1){hash = "Hashtag";}
        if(numUser == 1){user = "Username";}
        
        System.out.printf("\n%02d %s\n", numHash, hash);
        System.out.printf("\n%02d %s\n", numUser, user);
        
    }
}
    

