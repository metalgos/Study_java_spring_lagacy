package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsle {
	
	private Exam exam;
public InlineExamConsole() {
	
}
	public InlineExamConsole(Exam exam) {
		
		this.exam = exam;
	}

	@Override
	public void print() {
System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}
	
	@Autowired
	@Qualifier("exam2") //xml에서  id가 exam1으로 설정된것을 주입
	public void setExam(Exam exam) {
		this.exam = exam;
		
	}

}
