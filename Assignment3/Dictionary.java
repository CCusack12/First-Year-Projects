//Student ID: 21313091
//Student Name: Conor Cusack


import java.io.*;
import java.util.*;

public class Dictionary {

    private ArrayList<String> words ;
    
    private int shortest;
    private int longest;
  
  
    public Dictionary(String filepath, int shortest, int longest) { //this is a constructor for the class
            
        this.words = new ArrayList<>();
        this.shortest =  shortest;          //sets to complete the double variables
        this.longest = longest;

        try{                                            //try-catch used to deal with the exceptions
            File file = new File(filepath);
            Scanner reader = new Scanner(file);

            while (reader.hasNext()) {                              
				String line = reader.nextLine().toUpperCase();
				if (!line.isBlank()) {                                //checks to see if line is blank so it deosnt have to go through it
					String[] wordsInLine = line.split(",");
					for (int i=0; i<wordsInLine.length; i++) {
						String word = wordsInLine[i];
						word = word.trim();
						if (!words.contains(word) && word.length() >= shortest && word.length() <= longest) {
							words.add(word);
						}
					}
				}
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Error Discovered :((");
		}
		Collections.sort(words);
	}
	public boolean add(String word) {           
		word = word.toUpperCase().trim();               //fixing to uppercase and removing any white spaces before or after
		int place;
		if ((place = Collections.binarySearch(words, word)) < 0 && word.length() >= shortest && word.length() <= longest && !word.isBlank()) {  //searches array list and return the index of where it was found and if it fails it will return the negative index -1
			words.add(Math.abs(place)-1, word);     //checks if it is less than 0, and the absolute value of the word
			return true;
		} else {
			return false;
		}
	}
	public String nextWord() {
		if (words.isEmpty()) {      //if words is empty returns blank stream else gets a random word from 0-... and returns that
			return "";
		}
		else {
			return words.get((int) (Math.random()*words.size()));
		}
	}
	public boolean inDictionary(String word) {     //makes sure word is actually in dictionary
		return words.contains(word.toUpperCase());
	}
	public String toString() {
		return words.toString();
	}

        }

    

  