package de.itdesign.incubating.rmg.service;

import de.itdesign.incubating.rmg.model.*;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class GameService {

    Player projectManager = new Player("1", Role.PM, "Gowtham", List.of(1, 2));
    Player projectManager1 = new Player("3", Role.PM, "Hari", List.of(1, 2));

    Player resourceManger = new Player("2", Role.RM, "Bharath", List.of(1, 2));
    ResourceCard newResourceCard = new ResourceCard("1", "B1", 0, Skill.HEART, "Kamal");
    Demand newDemand = new Demand(0, Skill.HEART);
    Request newRequest = new Request("1", "P1", newDemand);
    ResourceBoard newResourceBoard = new ResourceBoard("1", "Board1", resourceManger, List.of(newResourceCard));
    Project newProject = new Project("P1", "Tender of Financial Institution X (external)", 3, 5,
            List.of(new Demand(0, Skill.HEART),
                    new Demand(0, Skill.HEART),
                    new Demand(1, Skill.HEART),
                    new Demand(1, Skill.DIAMOND),
                    new Demand(1, Skill.SPADE),
                    new Demand(2, Skill.HEART),
                    new Demand(2, Skill.DIAMOND),
                    new Demand(2, Skill.SPADE),
                    new Demand(2, Skill.SPADE)));

    Collection<ProjectPlan> newProjectPlan =List.of(
            new ProjectPlan("1",projectManager, newProject, 2,List.of(newResourceCard)),
            new ProjectPlan("2",projectManager, newProject, 2,List.of(newResourceCard)),
            new ProjectPlan("3",projectManager1, newProject, 2,List.of(newResourceCard)));


    public Game getGame(){
        return new Game("1", List.of(projectManager, projectManager1), newProjectPlan, List.of(newResourceBoard), List.of(newRequest), Round.CALL);
    }


//    PM Start


//    PM End



//    RM Start


//    RM End

}
