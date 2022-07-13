package com.tech.basic2;

import com.tech.basic2.entty.Exam;
import com.tech.basic2.entty.newlecExam;
import com.tech.basic2.ui.ExamConsole;
import com.tech.basic2.ui.GridExamComsole;
import com.tech.basic2.ui.InlineExamconsole;

public class Program {
	public static void main(String[] args) {
		
		Exam exam = new newlecExam(); 
		//ExamConsole console = new InlineExamconsole(exam);
		ExamConsole console = new GridExamComsole(exam);
		console.print();
	}
}
