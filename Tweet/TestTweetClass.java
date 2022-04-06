// 21340641
// Laoise Conaty
public class TestTweetClass {
    public static void main(String[] args) {
        Tweet thetweet = new Tweet("Liam Murray is the coolest #squarehead @tortoise");
        System.out.println ("there are " + thetweet.getHashtagCount() + " hastags");
        System.out.println ("there is " + thetweet.getUserCount() + " user");
        System.out.println ("the default display width is " + thetweet.getDEFAULT_DISPLAY_WIDTH());
        System.out.println ("the maximum display width is " + thetweet.getMAXIMUM_DISPLAY_WIDTH());
        System.out.println ("posted at " + thetweet.getPostedAt());
        System.out.println ("posted by " + thetweet.getPostedBy());
        System.out.println ("the minimum display width is " + thetweet.getMINIMUM_DISPLAY_WIDTH());
        System.out.println ("the minimum header width is " + thetweet.getMINIMUM_HEADER_WIDTH());

        System.out.println (thetweet.postedAtTime());
        System.out.println (thetweet.timeInSeconds( 23, 52, 19));
        System.out.println (thetweet.timeInSeconds(89, 85, 12 ));
        System.out.println (thetweet.timeInSeconds());
        System.out.println (thetweet.activityIndicator());
        System.out.println (thetweet.containsWord("coolest"));
        System.out.println (thetweet.containsWord("cool"));

        thetweet.display(76, true);
        thetweet.display(67, false);

    }
}