package development;

import java.util.Scanner;

public class QuestionService {
	
	Question[] questions = new Question[5];
	String[] selection = new String[5];
	
	public QuestionService() {
		questions[0] = new Question(1, "Size of int ", "1", "2", "4","8", "4"); 
		questions[1] = new Question(2, "Size of double ", "1", "2", "4","8", "8");
		questions[2] = new Question(3, "Size of char ", "1", "2", "4","8", "1");
		questions[3] = new Question(4, "Size of long ", "1", "2", "4","8", "4");
		questions[4] = new Question(5, "Size of boolean ", "1", "2", "4","8", "2");
		
	}

	public void displayQuestions() {
		int i =0;
		int score = 0;
		for(Question q : questions) {
			System.out.println("Question no. "+ q.getId());
			System.out.println(q.getQuestion());
			System.out.println(q.getOpt1());
			System.out.println(q.getOpt2());
			System.out.println(q.getOpt3());
			System.out.println(q.getOpt4());
			
			Scanner sc = new Scanner(System.in);
			selection[i] = sc.nextLine();
			if(selection[i].equals(q.getAnswer())) {
				System.out.println("Your Answer is correct");
				score++;
			}
			else {
				System.out.println("Your anser is wrong");
			}
			i++;
		}
		System.out.println();
		System.out.println("Your total score:"+ score);
		System.out.println("Your Answers");
		for(String answer : selection ) {
			System.out.println(answer);
		}
		
	}
}
