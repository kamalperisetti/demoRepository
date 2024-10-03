package de.itdesign.incubating.rmg.model;



import java.util.Collection;
import java.util.List;
//import java.util.Set;

public class Game {
    String id;
    Collection<Player> players;
    Collection<ResourceCard> cards;
    Collection<Project> projects;
    Collection<ProjectPlan> projectPlans;
    Collection<ResourceBoard> resourceBoards;
    Collection<Request> requests;
    Round currentRound;


    public Game(String id, Collection<Player> players,  Collection<ProjectPlan> projectPlans,
    Collection<ResourceBoard> resourceBoards,
    Collection<Request> requests,
    Round currentRound) {
        this.id = id;
        this.players = players;
        this.projectPlans = projectPlans;
        this.resourceBoards = resourceBoards;
        this.requests = requests;
        this.currentRound = currentRound;
        this.cards = List.of(
                new ResourceCard("RC00", "B1", 2, Skill.HEART, "Anna"),
                new ResourceCard("RC01", "B1", 2, Skill.HEART, "Alex"),
                new ResourceCard("RC02", "B2", 2, Skill.HEART, "Ben"),
                new ResourceCard("RC03", "B2", 2, Skill.HEART, "Barb"),
                new ResourceCard("RC04", "B2", 2, Skill.HEART, "Belma"),
                new ResourceCard("RC05", "B1", 3, Skill.HEART, "Anna"),
                new ResourceCard("RC06", "B1", 3, Skill.HEART, "Alice"),
                new ResourceCard("RC07", "B1", 3, Skill.HEART, "Arian"),
                new ResourceCard("RC08", "B2", 3, Skill.HEART, "Bob"),
                new ResourceCard("RC09", "B2", 3, Skill.HEART, "Barb"),
                new ResourceCard("RC10", "B1", 4, Skill.HEART, "Anna"),
                new ResourceCard("RC11", "B1", 4, Skill.HEART, "Alice"),
                new ResourceCard("RC12", "B1", 4, Skill.HEART, "Arian"),
                new ResourceCard("RC13", "B2", 4, Skill.HEART, "Bob"),
                new ResourceCard("RC14", "B2", 4, Skill.HEART, "Bonnie"),
                new ResourceCard("RC15", "B2", 4, Skill.HEART, "Belma"),
                new ResourceCard("RC16", "B2", 4, Skill.HEART, "Bryan"),
                new ResourceCard("RC17", "B1", 5, Skill.HEART, "Aylin"),
                new ResourceCard("RC18", "B1", 5, Skill.HEART, "Alex"),
                new ResourceCard("RC19", "B2", 5, Skill.HEART, "Ben"),
                new ResourceCard("RC20", "B2", 5, Skill.HEART, "Barn"),
                new ResourceCard("RC21", "B1", 6, Skill.HEART, "Aylin"),
                new ResourceCard("RC22", "B1", 6, Skill.HEART, "Alex"),
                new ResourceCard("RC23", "B2", 6, Skill.HEART, "Ben"),
                new ResourceCard("RC24", "B2", 6, Skill.HEART, "Belma"),
                new ResourceCard("RC25", "B1", 7, Skill.HEART, "Anna"),
                new ResourceCard("RC26", "B1", 7, Skill.HEART, "Alice"),
                new ResourceCard("RC27", "B2", 7, Skill.HEART, "Bryan"),
                new ResourceCard("RC28", "B2", 8, Skill.HEART, "Ben"),
                new ResourceCard("RC29", "B1", 2, Skill.DIAMOND, "Can"),
                new ResourceCard("RC30", "B1", 2, Skill.DIAMOND, "Cloe"),
                new ResourceCard("RC31", "B1", 2, Skill.DIAMOND, "Cheryl"),
                new ResourceCard("RC32", "B1", 3, Skill.DIAMOND, "Cedric"),
                new ResourceCard("RC33", "B1", 3, Skill.DIAMOND, "Cloe"),
                new ResourceCard("RC34", "B1", 3, Skill.DIAMOND, "Cheryl"),
                new ResourceCard("RC35", "B1", 3, Skill.DIAMOND, "Casper"),
                new ResourceCard("RC36", "B1", 3, Skill.DIAMOND, "Carmen"),
                new ResourceCard("RC37", "B1", 3, Skill.DIAMOND, "Charles"),
                new ResourceCard("RC38", "B1", 4, Skill.DIAMOND, "Cedric"),
                new ResourceCard("RC39", "B1", 4, Skill.DIAMOND, "Cloe"),
                new ResourceCard("RC40", "B1", 4, Skill.DIAMOND, "Cheryl"),
                new ResourceCard("RC41", "B1", 5, Skill.DIAMOND, "Cedric"),
                new ResourceCard("RC42", "B1", 5, Skill.DIAMOND, "Christian"),
                new ResourceCard("RC43", "B1", 5, Skill.DIAMOND, "Cheryl"),
                new ResourceCard("RC44", "B1", 6, Skill.DIAMOND, "Can"),
                new ResourceCard("RC45", "B1", 6, Skill.DIAMOND, "Christian"),
                new ResourceCard("RC46", "B1", 6, Skill.DIAMOND, "Chara"),
                new ResourceCard("RC47", "B1", 7, Skill.DIAMOND, "Can"),
                new ResourceCard("RC48", "B1", 7, Skill.DIAMOND, "Cloe"),
                new ResourceCard("RC49", "B1", 7, Skill.DIAMOND, "Chara"),
                new ResourceCard("RC50", "B1", 8, Skill.DIAMOND, "Can"),
                new ResourceCard("RC51", "B1", 8, Skill.DIAMOND, "Cloe"),
                new ResourceCard("RC52", "B2", 2, Skill.SPADE, "Dominik"),
                new ResourceCard("RC53", "B2", 2, Skill.SPADE, "Daniela"),
                new ResourceCard("RC54", "B2", 2, Skill.SPADE, "Deniz"),
                new ResourceCard("RC55", "B2", 3, Skill.SPADE, "Dominik"),
                new ResourceCard("RC56", "B2", 3, Skill.SPADE, "Daniela"),
                new ResourceCard("RC57", "B2", 3, Skill.SPADE, "Deniz"),
                new ResourceCard("RC58", "B2", 3, Skill.SPADE, "Dilara"),
                new ResourceCard("RC59", "B2", 4, Skill.SPADE, "Deepak"),
                new ResourceCard("RC60", "B2", 4, Skill.SPADE, "Doris"),
                new ResourceCard("RC61", "B2", 5, Skill.SPADE, "Deepak"),
                new ResourceCard("RC62", "B2", 6, Skill.SPADE, "Dominik"),
                new ResourceCard("RC63", "B2", 6, Skill.SPADE, "Doris"),
                new ResourceCard("RC64", "B2", 6, Skill.SPADE, "Deniz"),
                new ResourceCard("RC65", "B2", 7, Skill.SPADE, "Dilara"),
                new ResourceCard("RC66", "B2", 7, Skill.SPADE, "Daniela"));

        this.projects = List.of(
                new Project("P1", "Tender of Financial Institution X (external)", 3, 5,
                        List.of(new Demand(0, Skill.HEART),
                                new Demand(0, Skill.HEART),
                                new Demand(1, Skill.HEART),
                                new Demand(1, Skill.DIAMOND),
                                new Demand(1, Skill.SPADE),
                                new Demand(2, Skill.HEART),
                                new Demand(2, Skill.DIAMOND),
                                new Demand(2, Skill.SPADE),
                                new Demand(2, Skill.SPADE))),
                new Project("P2", "Website Launch (external)", 2, 4,
                        List.of(new Demand(0, Skill.HEART),
                                new Demand(0, Skill.DIAMOND),
                                new Demand(0, Skill.SPADE),
                                new Demand(1, Skill.HEART),
                                new Demand(1, Skill.HEART),
                                new Demand(1, Skill.DIAMOND),
                                new Demand(1, Skill.DIAMOND),
                                new Demand(1, Skill.SPADE),
                                new Demand(2, Skill.HEART),
                                new Demand(2, Skill.DIAMOND),
                                new Demand(2, Skill.SPADE))),
                new Project("P3", "Company Trip (internal)", 6, 8,
                        List.of(new Demand(0, Skill.HEART),
                                new Demand(0, Skill.DIAMOND),
                                new Demand(0, Skill.DIAMOND),
                                new Demand(1, Skill.HEART),
                                new Demand(1, Skill.HEART),
                                new Demand(1, Skill.DIAMOND),
                                new Demand(1, Skill.DIAMOND),
                                new Demand(1, Skill.SPADE),
                                new Demand(2, Skill.HEART),
                                new Demand(2, Skill.DIAMOND),
                                new Demand(2, Skill.DIAMOND),
                                new Demand(2, Skill.SPADE),
                                new Demand(2, Skill.SPADE)))

        );}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Collection<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Collection<Player> players) {
        this.players = players;
    }

    public Collection<ResourceCard> getCards() {
        return cards;
    }

    public void setCards(Collection<ResourceCard> cards) {
        this.cards = cards;
    }

    public Collection<Project> getProjects() {
        return projects;
    }

    public void setProjects(Collection<Project> projects) {
        this.projects = projects;
    }

    public Collection<ProjectPlan> getProjectPlans() {
        return projectPlans;
    }

    public void setProjectPlans(Collection<ProjectPlan> projectPlans) {
        this.projectPlans = projectPlans;
    }

    public Collection<ResourceBoard> getResourceBoards() {
        return resourceBoards;
    }

    public void setResourceBoards(Collection<ResourceBoard> resourceBoards) {
        this.resourceBoards = resourceBoards;
    }

    public Collection<Request> getRequests() {
        return requests;
    }

    public void setRequests(Collection<Request> requests) {
        this.requests = requests;
    }

    public Round getCurrentRound() {
        return currentRound;
    }

    public void setCurrentRound(Round currentRound) {
        this.currentRound = currentRound;
    }
}