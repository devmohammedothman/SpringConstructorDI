package com.selftraining.springdemo;

import com.selftraining.springdemo.service.MedicalService;

public class TennisCoach implements Icoach {
	
	private MedicalService medicalService;
	
	public TennisCoach()
	{
		System.out.println("Initialize tennis coach");
	}

	@Override
	public String getDailyWorkOut() {
		
		return "Train your ABS 15 min / daily";
	}

	@Override
	public String checkTraineeHealth() {
		
		return this.getMedicalService().checkTraineeReport();
	}

	public MedicalService getMedicalService() {
		return medicalService;
	}

	public void setMedicalService(MedicalService medicalService) {
		System.out.println("injecting medical service");
		this.medicalService = medicalService;
	}

}
