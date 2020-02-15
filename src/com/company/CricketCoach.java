package com.company;

public class CricketCoach implements ICoach {

    private HappyFortuneService fortuneService;
    private  String emailAddress;
    private String team;


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCose: inside setter method email*************");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCose: inside setter method Team***********");
        this.team = team;
    }

    public CricketCoach() {
        System.out.println("inside  of no-arg constructor");
    }
    //setter method

    public void setFortuneService(HappyFortuneService fortuneService) {
        System.out.println("inside  of setter method");

        this.fortuneService = fortuneService;
    }

//    public CricketCoach(HappyFortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }


    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 min ";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
