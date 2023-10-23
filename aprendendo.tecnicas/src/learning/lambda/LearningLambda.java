package learning.lambda;

import javax.swing.JButton;

public class LearningLambda {
	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			public void run() {
				System.out.println("Oi");
			}
		}).run();
		
		new Thread(() -> System.out.println("Oi")).run(); //função Lambda
		
		new JButton().addActionListener(e -> System.out.println("Oi"));
		
	}
}
