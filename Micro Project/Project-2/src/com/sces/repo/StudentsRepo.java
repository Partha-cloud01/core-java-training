package com.sces.repo;

import java.util.List;

import com.sces.model.Students;

public interface StudentsRepo {
	
	public boolean doInsertStudents(Students student);
	public boolean doDeleteStudents(int id);
	public boolean doUpdateStudents(Students student);
	public Students doFindStudents(int id);
	public List<Students> doFindAllStudents();

}
