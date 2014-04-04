package macbookpro;
import acm.program.*;
import java.util.*;
public class HashMapp extends ConsoleProgram {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* private variable decleration
	 * @param none */
	private Map<String, Integer> phonebook = new HashMap<String, Integer>();
	
	public void run() {
		setFont("Courier-24");
		
		println("Reading in phone number");
		readPhoneNumbers();
		
		println("Looking up phone numbers");
		lookUpNumbers();
		
		println("Displaying phone numbers");
		displayAllNumbers();
	}
	
	private void readPhoneNumbers() {
		while (true) {
			String name = readLine("Enter name: ");
			if (name.equals("")) break;
			int number = readInt("Phone number(as int): ");
			phonebook.put(name, number);
		}
	}
	
	private void lookUpNumbers() {
		while (true) {
			String name = readLine("Enter name to lookup: ");
			if (name.equals("")) break;
			Integer number = phonebook.get(name);
			if (number == null) {
				println(name + "not in phonebook");
			} else {
				println(number);
			}
		}
	}
	
	private void displayAllNumbers() {
		Iterator<String> it = phonebook.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			Integer number = phonebook.get(name);
			println(name + ":" + number);
		}
	}
}
