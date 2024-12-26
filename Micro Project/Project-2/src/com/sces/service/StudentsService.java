package com.sces.service;

import com.sces.model.Students;
/**  
 * @author Partha Sarathi Nanda
 * My StudentsService Interface
 */
public interface StudentsService {
	
	public String insertStudentsValidation(Students student);
	public String deleteStudentsValidation(int sid);
	public String updateStudentsValidation(Students student);
	public String findStudentsValidation(int id);
	public String findAllStudentsValidation();

}
