package quiz;

import java.util.Scanner;

public class App {
	public static void main(String [] args) {
		
		String q1 = "Posoi htan oi theoi tou Olympou������a?\n"     //oi erwthseis ������
				  + "(a)12\n(b)20\n(c)10\n";
				
		String q2 = "Poia htan h thea ths omorgias?\n"
				  + "(a)Athina\n(b)Hra\n(c)Afrodith\n";
		
		String q3 = "����� ���� � ������� ��� ���� ������\n"
				  +"(a)����������\n(b)��������\n(c)������ ����\n";
		
		String q4 = "��� ���� �������� ���������� �� ��������� ������� ���� �����\n"
				  + "(a)8 �����\n(b)2 ������\n(c)4 ������\n";
		
		String q5 = "���� ����� � �������� ��� ���������\n"
				  + "(a)480 �.�\n(b)490 �.�\n(c)495 �.�\n";
		
		
		Question [] questions = {                        //arrey errwthsewn prompt,answer
				new Question(q1, "a"),
				new Question(q2, "c"), 
				new Question(q3, "a"),
				new Question(q4, "a"),
				new Question(q5, "a")
		};
		takeTest(questions);          // methodos taketest dexetai ta arrey apto questions
		                                 //  dimiourgei enan intiger to score meta ena scanner 
		                                 //kai to scanner gia na eisagei o xrhsths
		
		
	}
	public static void takeTest(Question [] questions) {
		int score = 0;
		Scanner keyboardInput = new Scanner(System.in);
		
		for(int i = 0; i < questions.length; i++) {          //exei paei mesa apo olles tis erwthseis//
			System.out.println(questions[i].prompt);   // kanei loupa mesa apo olles tis erwthseis tou question
			String answer = keyboardInput.nextLine();		//kai gia kathe erwthsh ektupwnei ta prompt
			if(answer.equals(questions[i].answer)) { //kai pernei tis apanthseis pou evale o xrhsths sto answer
				score++;   //tsekarei an to answer einai idio me thn apanthsh ths erwthshs pou egine
			}				//metraei to score twn swstwn apantisewn
		}
		System.out.println("�� ������� ��� ����� " + score + "/" + questions.length);
	}
}
