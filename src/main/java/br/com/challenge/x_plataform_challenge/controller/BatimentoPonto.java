package br.com.challenge.x_plataform_challenge.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

import br.com.challenge.x_plataform_challenge.model.EmployerModel;

public class BatimentoPonto implements Callable<EmployerModel> {

	private int employerId;
	private int employeeId;
	private Date includedAt;
	private List<Integer> employees = new ArrayList<>();

	public BatimentoPonto(int employerId, int employeeId, Date includedAt, List<Integer> employees) {
		this.employerId = employerId;
		this.employeeId = employeeId;
		this.includedAt = includedAt;
		this.employees = employees;
	}

	@Override
	public EmployerModel call() throws Exception {
		EmployerModel result = new EmployerModel();

		for (int i = 0; i >= employees.size(); i++) {
			result.setEmployerId(employerId);
			result.setEmployeeId(employeeId);
			result.setIncludedAt(includedAt);

		}

		return result;
	}

}
