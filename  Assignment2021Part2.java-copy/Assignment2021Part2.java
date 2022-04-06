// Name : Conor Cusack
// Student ID : 21313091
public class Assignment2021Part2 {
    public static void main(String[]args) {
        final long 
        MILLISECONDS_IN_A_DAY = 24*60*60*1000,
        SECONDS_IN_AN_HOUR = 60*60;
        long secondsSinceMidnight =0; 
        long hour=0, minute=0, second=0;
        secondsSinceMidnight = (System.currentTimeMillis()% MILLISECONDS_IN_A_DAY)/1000;
        hour=((secondsSinceMidnight/SECONDS_IN_AN_HOUR)+1)%24;
        minute=(secondsSinceMidnight%SECONDS_IN_AN_HOUR)/60;
        second=secondsSinceMidnight%60;
        
        String tweet = "";
        int Hashtagnumber=0;
        int Accountnumber=0;
        int randomSelection = (int) (Math.random() * 8);
        if(randomSelection == 0) {
            tweet = "Simplicity is a great virtue but it requires hard work to achieve it " +
            "and education to appreciate it.";
        } else if(randomSelection == 1) {
            tweet = "The question of whether #MachinesCanThink is " +
            "is about as relevant as the question of whether #SubmarinesCanSwim.";
        } else if(randomSelection == 2) {
            tweet = "@CS4141Students @CS6371Students " +
            "The art of programming is the art of organizing complexity, " +
            "of mastering multitude and avoiding its bastard chaos as " +
            "effectively as possible." ;
        } else if(randomSelection == 3) {  
            tweet = "The competent programmer is fully aware of the strictly limited " +
            "size of his own #skull; therefore he approaches the programming " +
            "task in full #humility, and among other things he avoids clever " +
            "tricks like the plague. @SmartProgrammers" ;
        } else if(randomSelection == 4) {
            tweet = "In 1957 I married and Dutch marriage rites require you to state " +
            "your profession and I stated that I was a #programmer. But the " +
            "municipal authorities of the town of @Amsterdam did not accept it " +
            "on the grounds that there was no such profession." ;
        } else if(randomSelection == 5) {
            tweet = "How do we convince @people that in programming #simplicity and #clarity " +
            "— in short: what mathematicians call \"elegance\" — are not a dispensable " +
            "luxury, but a crucial matter that decides between success and failure?" ; 
        } else if(randomSelection == 6) {           
            tweet = "Automatic computers have now been with us for a quarter of a century. "+

            "They have had a great impact on our @society in their capacity of #tools, " +

            "but in that capacity their influence will be but a ripple on the surface " +

            "of our culture, compared with the much more profound influence they will " +

            "have in their capacity of #intellectual #challenge without precedent in the " +

            "cultural history of @mankind." ;           

        } else if(randomSelection == 7) {  

            tweet = "A picture may be worth a thousand words, but a formula is worth a thousand " +

            "pictures.";
        }
        for(int i=0;i<tweet.length();i++){
            char ch = tweet.charAt(i);
            if (ch =='#')
                Hashtagnumber+=1; 
            if (ch =='@')
                Accountnumber+=1; 
        }
        // I used some of the code from part one for this. 
        System.out.println("******************************"); 
        System.out.println("Tweet Analysis");
        System.out.println("==============");
        System.out.printf("Posted at %02d:%02d:%02d\n",hour,minute,second);
        System.out.println("Posted by @" + System.getProperty("user.name") +
            "\nTweet Text (unformatted) : "+ tweet + 
            "\n\nTweet text as a series of up to 30 character segments \n\n");

        int tweetWidth = 30;
        
        for (int i = 0; i < tweet.length(); i = i + tweetWidth) {
            String tweetsplit = tweet.substring(i, Math.min(i + tweetWidth, tweet.length()));
            System.out.println(tweetsplit);
        }

        System.out.printf( "\n%02d Account's\n%02d Hashtag's\n" ,Accountnumber,Hashtagnumber);
        System.out.println("******************************"); 

    }
}
