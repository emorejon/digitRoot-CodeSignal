import java.util.*;
import java.math.*;



public class HangMan {
	
	
	public static void main(String[] args) {
		
		/*Two dimensional array to draw the board*/
		char[][] setUp = new char[10][10];
		setUp[0][1]= '+';
		setUp[1][1]= '|';
		setUp[2][1]= '|';
		setUp[3][1]= '|';
		setUp[4][1]= '|';
		setUp[5][1]= '|';
		setUp[6][1]= '|';
		setUp[7][1]= '|';
		setUp[8][1]= '|';
		setUp[9][1]= '|';
		setUp[9][0]= '/';
		setUp[9][2]= '\\';
		setUp[0][2]= '-';
		setUp[0][3]= '-';
		setUp[0][4]= '-';
		setUp[0][5]= '-';
		setUp[0][6]= '-';
		setUp[0][7]= '+';
		setUp[0][8]= '-';
		setUp[0][9]= '-';
		setUp[1][7]= '|';
		
		
		int missCounter = 6; //this counts the amount of missed letters. Used mostly to activate the body parts.
		
		
		//String[] words = {"hello"};
		String currentWord = "hello";
		System.out.println("The word has " + currentWord.length() + " letters.");
		char[] guess = new char[currentWord.length()];
		for(int i = 0; i < guess.length; i++){
			guess[i]='_';
		}
		
		while(missCounter < 6){
			System.out.println("Enter a letter:");
			Scanner in = new Scanner(System.in);
			String currentLetter = in.nextLine();
		}
		
		for(int i = 0; i < currentWord.length(); i++){
			
		}
		
		for(int i = 0; i < 10; i++ ){
			for(int j = 0; j < 10; j++){
				System.out.print(setUp[i][j]);
			}
			System.out.println();
		}
		if(missCounter >= 6){
			System.out.println("GAME OVER");
		}
	}
}
