package org.example;

import java.util.List;

class SubjectService {
	private List<String> subjects;
	
	public SubjectService(List<String> subjects) {
		this.subjects = subjects;
	}
	
	public void showSubjects() {
		int length = 3;
		for(int i = 0; i < length; i++) {
			System.out.println(subjects.get(i));
		}
	}
}

