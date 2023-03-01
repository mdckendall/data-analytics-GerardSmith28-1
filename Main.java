import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);

    while (fileScanner.hasNext()){
      arrayList.add(fileScanner.nextLine());
    }
    
    Scanner userInput = new Scanner(System.in); 
      
    int UI = 0;
    while (UI !=5){
    System.out.println("Press 1 to learn about salary.");
    System.out.println("Press 2 to learn about the job.");
    System.out.println("Press 3 to learn about demand.");
    System.out.println("Press 4 to view current students.");
    System.out.println("Press 5 to quit.");

    UI = userInput.nextInt();
    if(UI == 1){
      System.out.println("98,345 average salary in South Florida!");
    }
    else if(UI == 2){
      System.out.println("US News - 100 Best Jobs!");
    }
    else if(UI == 3){
      System.out.println("Top 10 Forbes In-Demand Jobs!");
    }
      else if(UI == 4){
        System.out.println("Current Students:");
        for (String s : arrayList){
          System.out.println(s);
        }
      }
      
    }
	}
}