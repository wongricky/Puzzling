package puzzleJava;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.Random;

public class PuzzleJava {
	private int lengthOf(String x) { // Initialize function length of x
		return x.length();
	}
	
	// Print sum
	public ArrayList<Integer> getSum(int [] x){
		ArrayList<Integer> greaterThan10 = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 0; i < x.length; i ++) {
			sum += x[i];
			if ( x[i] > 10) {
				greaterThan10.add(x[i]);
			}
		}
		System.out.println("The sum of all the numbers are: " + sum);
		return greaterThan10;
	}
	
	
	// Random names
	public ArrayList<String> shuffleName(String [] namesArr){
		List<String> namesList = Arrays.asList(namesArr); // Convert Array to ArrayList for Collections.shuffle
		Collections.shuffle(namesList);
		System.out.println("Shuffled List: " + namesList);
		ArrayList<String> shortList = new ArrayList<String>();
		for(int i = 0; i < namesArr.length; i ++) {
			if (lengthOf(namesArr[i]) > 5) {
				shortList.add(namesArr[i]);
			}
		}
		return shortList;
	}
	
	
	// Alphabet
	public void shuffleAlpha(String [] alphabet) {
		List<String> shuffleAlpha = Arrays.asList(alphabet);
		Collections.shuffle(shuffleAlpha); 
		String[] arrAlpha = shuffleAlpha.toArray(new String[0]); // Convert ArrrayList to String to define index values
		System.out.println("The last letter is: " + arrAlpha[(alphabet.length -1)]);
		System.out.println("The first letter is: " + arrAlpha[0]);
		if (arrAlpha[0] == "a"|| arrAlpha[0] == "e"||arrAlpha[0] == "i"||arrAlpha[0] =="o"||arrAlpha[0] =="u") {
			System.out.println("You've got a vowel! ");
		}
		else if (arrAlpha[0] == "y") {
			System.out.println("This is sometimes a vowel...");
		}
	}
	
	
	// Random number 55 - 100
	public ArrayList<Integer> randNumber55(){
		Random ran = new Random();
		ArrayList<Integer> rand55To100 = new ArrayList<Integer>();
		for  (int i = 0; i < 10; i ++) {
			int randNum = 55 + ran.nextInt(45);
			rand55To100.add(randNum);
		}
		return rand55To100;
	}
	
	
	// Random number sort
	public ArrayList<Integer> randNumberSort() {
		Random ran = new Random();
		ArrayList<Integer> rand55To100 = new ArrayList<Integer>();
		for  (int i = 0; i < 10; i ++) {
			int randNum = 55 + ran.nextInt(45);
			rand55To100.add(randNum);
		}
		Collections.sort(rand55To100);
		Integer[] randNumList = rand55To100.toArray(new Integer[0]);   // Change ArrayList back to int []
		System.out.println("Minimum value is: " + randNumList[0]);
		System.out.println("Maximum value is: " + randNumList[randNumList.length - 1]);
		return rand55To100;
	}
	
	
	// Random String
	public void randomString() {
		Random ran = new Random();
		StringBuilder sb = new StringBuilder(); // StringBuilder to create string from list of char
		for (int i = 0; i < 5; i ++) {
			char randChar = (char)(ran.nextInt(26) + 'a'); 
			sb.append(randChar);
		}
		String newString = sb.toString();
		System.out.println(newString);
			
	}
	
	
	// Random String List
	public void randomStrList() {
		Random ran = new Random();
		ArrayList<String> stringList = new ArrayList<String>();
		for (int i = 0; i < 10; i ++) {
			StringBuilder sb = new StringBuilder(); // Resets StringBuilder
			for (int j = 0; j < 5; j ++) {
				char randChar = (char)(ran.nextInt(26) + 'a'); // Sets starting point for random # at 'a' ASCII
				sb.append((randChar)); // Append each character into new String
			}
			String newString = sb.toString(); // Takes appended characters and puts it in newString
			stringList.add(newString); // Put newString contents into new ArrayList<String>
		}
		System.out.println(stringList);
	}
	
	
	
	
}
