package br.com.challenge.x_plataform_challenge.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployerModel {

	private int employerId;
	private int employeeId;
	private Date includedAt;
	private List<Integer> employees = new ArrayList<>();

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Date getIncludedAt() {
		return includedAt;
	}

	public void setIncludedAt(Date includedAt) {
		this.includedAt = includedAt;
	}

	public List<Integer> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Integer> employees) {
		this.employees = employees;
	}

}
