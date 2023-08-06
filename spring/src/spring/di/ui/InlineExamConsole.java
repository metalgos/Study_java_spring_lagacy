package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console")
public class InlineExamConsole implements ExamConsle {

	@Autowired(required = true) //xml에 설정 없어도 사용가능
	//@Qualifier("exam2")
	private Exam exam;

	public InlineExamConsole() {
		System.out.println("constructor");

	}

	public InlineExamConsole(Exam exam, Exam exam1) {
		System.out.println("overloaded constructor");

		this.exam = exam;
	}

	@Override
	public void print() {
		if (exam == null)
			System.out.printf("total is %d, avg is %f\n", 0, 0.0);
		else
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}

	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam = exam;

	}

}
