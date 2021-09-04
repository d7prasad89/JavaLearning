package javaFundamentals;

import java.util.Arrays;

public class CrewMemberMain {

    public static void main(String[] args) {
        CrewMember bob = new CrewMember(FlightCrewJobEnum.COPILOT, "Bob");
        CrewMember john = new CrewMember(FlightCrewJobEnum.PILOT, "John");

        CrewMember boss = whoIsTheBoss(bob, john);
        System.out.println(boss.getJob().getTitle() + " " +boss.getName() +" is the boss");
        System.out.println(Arrays.toString(FlightCrewJobEnum.values()));
        Arrays.stream(FlightCrewJobEnum.values()).forEach(System.out::println);
    }

    private static CrewMember whoIsTheBoss(CrewMember bob, CrewMember john) {
        return bob.getJob().compareTo(john.getJob()) > 0 ? bob : john;
    }
}
