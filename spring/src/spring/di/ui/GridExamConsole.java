package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsle {
private Exam exam;

public GridExamConsole(Exam exam) {
		
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.println("");
		System.out.println("totla");

	}

}
