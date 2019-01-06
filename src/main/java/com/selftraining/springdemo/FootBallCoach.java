package com.selftraining.springdemo;

import com.selftraining.springdemo.service.MedicalService;

public class FootBallCoach implements Icoach {
	
	private MedicalService medicalService;
	
	

	public FootBallCoach(MedicalService medicalService) {
		
		this.medicalService = medicalService;
	}

	@Override
	public String getDailyWorkOut() {
	
		return "Train on Football shoot 30 min day";
	}

	@Override
	public String checkTraineeHealth() {

		return this.medicalService.checkTraineeReport();
	}

}
