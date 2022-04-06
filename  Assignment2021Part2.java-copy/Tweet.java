
/**
 * Write a description of class Tweet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tweet
{
    private String postedBy;
    private String tweetText;
    private int hashtagCount;
    private int usernameCount;
    private long postedAt;

    private final int DEFAULT_DISPLAY_WIDTH = 30;
    private final int MINIMUM_DISPLAY_WIDTH = 1;
    private final int MAXIMUM_DISPLAY_WIDTH = 80;
    private final int MINIMUM_HEADER_WIDTH = 10;


    public Tweet(String text) {

        this.postedBy = "@" + System.getProperty("user.name");
        this.tweetText = text;
        this.hashtagCount = count('#');
        this.usernameCount = count('@');
        this.postedAt = System.currentTimeMillis();
    }


    public String getTweetText() {
        return this.tweetText;
    }

    public int getHashtagCount() {
        return this.hashtagCount;
    }

    public int getUserCount() {
        return this.usernameCount;
    }

    public String getPostedBy() {
        return this.postedBy;
    }

    public long getPostedAt() {
        return this.postedAt;
    }

    public int getDEFAULT_DISPLAY_WIDTH() {
        return this.DEFAULT_DISPLAY_WIDTH;
    }

    public int getMINIMUM_DISPLAY_WIDTH() {
        return this.MINIMUM_DISPLAY_WIDTH;
    }

    public int getMAXIMUM_DISPLAY_WIDTH() {
        return this.MAXIMUM_DISPLAY_WIDTH;
    }

    public int getMINIMUM_HEADER_WIDTH() {
        return this.MINIMUM_HEADER_WIDTH;
    }


    private int count(char symbol) {

        String tweetWithout = tweetText.replaceAll(String.valueOf(symbol), "");
        int counter = tweetText.length() - tweetWithout.length();
        return counter;


    }

    public String postedAtTime() {
        long secondsPerHour = 3600L;
        long msPerDay = 86400000L;
        long msSinceMidnight = 0L;
        long secSinceMidnight = 0L;
        long hour = 0L;
        long second = 0L;
        long minute = 0L;
        msSinceMidnight = System.currentTimeMillis() % msPerDay;
        secSinceMidnight = msSinceMidnight / 1000L;
        hour = secSinceMidnight / secondsPerHour;
        minute = secSinceMidnight % secondsPerHour / 60L;
        second = secSinceMidnight % 60L;

        String time = String.format("%02d:%02d:%02d", hour, minute, second);
        return time;
    }


    public int timeInSeconds() {
        return (int) (this.postedAt / 1000);
        //int times =
    }

    public int timeInSeconds(int hour, int minute, int second) {
        int time = (hour * 60 * 60) + (minute * 60) + second;
        if (hour > 23 || hour < 0) {
            return -1;
        } else if (minute < 0 || minute > 59) {
            return -1;
        } else if (second < 0 || second > 59) {
            return -1;
        } else {
            return time;
        }


    }

    public char activityIndicator() {
        long secondsPerHour = 3600L;
        long msPerDay = 86400000L;
        long msSinceMidnight = 0L;
        long secSinceMidnight = 0L;
        long hour = 0L;

        msSinceMidnight = System.currentTimeMillis() % msPerDay;
        secSinceMidnight = msSinceMidnight / 1000L;
        hour = secSinceMidnight / secondsPerHour;
        char activity = 'N';
        if (hour >= 17 && hour < 22) {
            activity = 'E';
        }
        if (hour >= 12 && hour < 17) {
            activity = 'A';
        }
        if (hour >= 6 && hour < 12) {
            activity = 'M';
        }
        return activity;


    }

    public boolean containsWord(String aWord) {

        String[] words = this.tweetText.split(" ");


        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(aWord)) {

                return true;
            }
        }

        return false;
    }

    public void display(int width, boolean includeHeader) {
        if (includeHeader == true) {

            int header = width;
            if (width < MINIMUM_DISPLAY_WIDTH) {
                width = MINIMUM_DISPLAY_WIDTH;
            }
            if (width > MAXIMUM_DISPLAY_WIDTH) {
                width = MAXIMUM_DISPLAY_WIDTH;
            }
            if (width < MINIMUM_HEADER_WIDTH) {
                header = MINIMUM_HEADER_WIDTH;
            }

            for (int i = 1; i <= MAXIMUM_DISPLAY_WIDTH && i <= width / 10; i++) {
                System.out.printf("         %d", i);
            }
            System.out.println();
            String line = "1234567890";
            for (int i = 1; i <= 8 && i <= width / 10; i++) {
                System.out.printf("%s", line);
            }
            System.out.println(line.substring(0, width % 10));
            line = "==========";
            for (int i = 1; i <= 8 && i <= width / 10; i++) {
                System.out.printf("%s", line);
            }
            System.out.println(line.substring(0, width % 10));
        }

        if (tweetText.length() != 0) {
         int countlines = tweetText.length()/width;
         if (tweetText.length()/width != 0){
             countlines ++;
         }
         if (tweetText.length()/width == 0){
             countlines = 1;
         }
            int line = 0;
         int vari = 0;
         while (vari < countlines){
            if (line + width <= tweetText.length()) {
                System.out.printf("%s%n", tweetText.substring(line, line + width));
                line += width;
            } else {
                System.out.printf("%s%n", tweetText.substring(line, tweetText.length()));
            }
            countlines --;

            }
        }
    }
}