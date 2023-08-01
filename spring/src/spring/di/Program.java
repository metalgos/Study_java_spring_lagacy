package spring.di;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsle;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {

		/*
		 * Exam exam = new NewlecExam(); ExamConsle console = new GridExamConsole();
		 * 
		 * console.setExam(exam);
		 */
		ApplicationContext context
		= new ClassPathXmlApplicationContext("spring/di/setting.xml");

	ExamConsle console = (ExamConsle) context.getBean("console");
		//ExamConsle console = context.getBean(ExamConsle.class);
		console.print();

	}

}
