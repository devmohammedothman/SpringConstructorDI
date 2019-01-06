package com.selftraining.springdemo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.selftraining.springdemo.service.MedicalService;

public class MedicalServiceImpl implements MedicalService {
	
	private List<String> traineeReportList = new ArrayList<>();
	
	{
		traineeReportList.add("Trainee No 1 Needs XRAY");
		traineeReportList.add("Trainee No 2 Needs Lab");
		traineeReportList.add("Trainee No 3 Needs DNA");
		traineeReportList.add("Trainee No 4 Needs BBC");
	}

	@Override
	public String checkTraineeReport() {
		
		Random r = new Random();
		
		return traineeReportList.get(r.nextInt(4));
	}

}
