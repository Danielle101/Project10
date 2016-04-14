package project10;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		String choice = "y";
		ArrayList<Movie> myList = new ArrayList <>();
		System.out.println("Welcome to the movie list application!");
	
		while (choice.equalsIgnoreCase("y")) {
		for (int i=0; i <100; i++){
	myList.add(MovieIO.getMovie(i+1));
	}
		
Scanner userInput = new Scanner (System.in);

System.out.println("There are 100 movies in this list.");
System.out.println("");
System.out.println("What category are you interested in?");
String userGenre = userInput.nextLine();
for (int i=0; i<100; i++){
	if (myList.get(i).getCategory().equalsIgnoreCase(userGenre))
	{
		myList.get(i).printTitle();
		
		
}
	
}
System.out.println("");
System.out.println("Continue? (y/n):");
choice = userInput.nextLine();
System.out.println();

	}
	
	System.out.println("Bye!");
}
}