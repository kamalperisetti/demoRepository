package de.itdesign.incubating.rmg.service;

import de.itdesign.incubating.rmg.model.Game;
import de.itdesign.incubating.rmg.model.ProjectPlan;
import de.itdesign.incubating.rmg.model.ResourceCard;
import de.itdesign.incubating.rmg.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Service
public class PorjectService implements GameRepository {
    @Autowired
    GameService gameService;

//    Game newGame = gameService.getGame();

    public List<ProjectPlan> getProjectByPlayerId(int playerId) {
        Collection<ProjectPlan> allProjects = gameService.getGame().getProjectPlans();
        return allProjects.stream().filter(projectplan -> {
            return Integer.parseInt(projectplan.getOwner().id()) == playerId;
        }).toList();
    }

    public String sendResourceCardToRM(ResourceCard resourceCard){
        Game game = gameService.getGame();
        Collection<ResourceCard> AllResourceCards = new ArrayList<>();
        for(ResourceCard card : game.getCards()){
            AllResourceCards.add(card);
        }
        System.out.println(AllResourceCards + "All");
        ResourceCard card = new ResourceCard(resourceCard.id(), resourceCard.homeBoardId(), resourceCard.time(), resourceCard.skill(), resourceCard.name());
        System.out.println(card);


        AllResourceCards.add(card);
        game.setCards(AllResourceCards);
        System.out.println(AllResourceCards + "Added");
        System.out.println(game.getCards()+ "JOJOJOHKGMJ");
        return "ResourceCard Successfully Send To Resource Manager";
    }

}
