package quiz;

import java.util.Scanner;


public class App {
	public static void main(String [] args) {
		
		String q1 = "Posoi htan oi theoi tou Olympou?\n"     //oi erwthseis δωεγργ
				  + "(a)12\n(b)20\n(c)10\n";
				
		String q2 = "Poia htan h thea ths omorgias?\n"
				  + "(a)Athina\n(b)Hra\n(c)Afrodith\n";
		
		String q3 = "Ποιος ήταν ο φύλακας του κάτω κόσμου\n"
				  +"(a)Μηνόταυρος\n(b)Κέρβερος\n(c)Λερνέα Υδρα\n";
		
		String q4 = "Για πόσο διάστημα κυβέρνησαν οι Τριάκοντα τύρανοι στην Αθήνα\n"
				  + "(a)8 μήνες\n(b)2 χρόνια\n(c)4 χρόνια\n";
		
		String q5 = "Πότε έγινε η ναυμαχία της Σαλαμίνας\n"
				  + "(a)480 π.Χ\n(b)490 π.Χ\n(c)495 π.Χ\n";
		
		
		Question [] questions = {                        //arrey errwthsewn prompt,answer
				new Question(q1, "a"),
				new Question(q2, "c"), 
				new Question(q3, "b"),
				new Question(q4, "a"),
				new Question(q5, "c")
		};
		takeTest(questions);          // methodos taketest dexetai ta arrey apto questions
		                                 //  dimiourgei enan intiger to score meta ena scanner 
		                                 //kai to scanner gia na eisagei o xrhsths
		
		
	}
	static int x = 0 ;
	public static void takeTest(Question [] questions) {
		
			while (x == 0) { 
				x = 1;
		int score = 0;
		Scanner keyboardInput = new Scanner(System.in);
		
		for(int i = 0; i < questions.length; i++) {          //exei paei mesa apo olles tis erwthseis//
			System.out.println(questions[i].prompt);   // kanei loupa mesa apo olles tis erwthseis tou question
			String answer = keyboardInput.nextLine();		//kai gia kathe erwthsh ektupwnei ta prompt
			if(answer.equals(questions[i].answer)) { //kai pernei tis apanthseis pou evale o xrhsths sto answer
				score++;   //tsekarei an to answer einai idio me thn apanthsh ths erwthshs pou egine
			}				//metraei to score twn swstwn apantisewn
		}
		System.out.println("Το ποσοστό σου είναι " + score + "/" + questions.length);
		System.out.println("An pathseis a tha Συνεχίsεις στον επόμενο γυρο για ta " + score*100*2 + "eurw");
		System.out.println("An pathseis b stamatas kai Παίρνεις" + score*100*0.6 + "eurw");
		System.out.println("An pathseis c dιαλέγεις μια τελευταία ερώτηση για " + score*100 + "eurw");
		
		String answer = keyboardInput.nextLine();
		if (answer.equals("a")) {
			System.out.println("Συνεχίζεις στον επόμενο γυρο για" + score*100*2); 
			x = 0; }
			else if (answer.equals("b")) {
				System.out.println("stamatas kai Παίρνεις" + score*100*0.6);
			}
			else {
				 	System.out.println("H teleutaia erwthsh gia ta" + score*100 + "eurw einai\n  a b c?\n" );
				 	
				 	String answer1 = keyboardInput.nextLine();
				
				 	if (answer1.equals("a")) {
					System.out.println("lathos"); }
					else if (answer1.equals("b")) {
						System.out.println("lathos");
					}
					else {
						System.out.println("swsto, kerdises" + score*100 + "eurw" );
						
						}
				
				}
			}
  }
}
