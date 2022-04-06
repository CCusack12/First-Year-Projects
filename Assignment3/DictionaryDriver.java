//Student ID: 21313091
//Student Name: Conor Cusack

public class DictionaryDriver {
	public static void main(String[] args) { //pulls words from files and send out inclusive to set numbers
        Dictionary dict = new Dictionary("./WordFileLarge.csv", 0, 20);
		System.out.println(dict);
		System.out.printf("Next word in dicyionary: %s\n", dict.nextWord());
		System.out.printf("Putting In 'DaftPunk': %B\n", dict.add("DaftPunk"));
		System.out.printf("Putting In 'CS4222': %B\n", dict.add("CS4222"));
		System.out.printf("Putting In '': %B\n", dict.add(""));
        System.out.printf("Checking for '': %b\n", dict.inDictionary(""));
		System.out.printf("Checking for 'CS4222': %b\n", dict.inDictionary("CS4222"));
        System.out.println(dict);
	}
}