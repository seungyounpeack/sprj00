package com.tech.basic2.ui;

import com.tech.basic2.entty.Exam;

public class InlineExamconsole implements ExamConsole {

	private Exam exam;
	
	public InlineExamconsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.printf("total is %d,avg is %f\n",exam.total(),exam.avg());
	}

}
