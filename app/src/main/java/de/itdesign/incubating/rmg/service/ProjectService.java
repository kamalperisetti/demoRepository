package de.itdesign.incubating.rmg.service;

import de.itdesign.incubating.rmg.model.Game;
import de.itdesign.incubating.rmg.model.ProjectPlan;
import de.itdesign.incubating.rmg.model.ResourceCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ProjectService  {
    @Autowired
    GameService gameService;

//    Game newGame = gameService.getGame();

    public List<ProjectPlan> getProjectByPlayerId(int gameId,  int playerId) {
        try{
            System.out.println(gameId);
            Collection<ProjectPlan> allProjects = gameService.getGame().getProjectPlans();
            return allProjects.stream().filter(projectplan -> {
                return Integer.parseInt(projectplan.getOwner().id()) == playerId;
            }).toList();
        }catch (Exception e){
            System.out.println("Error");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        }

    }

    public ResponseEntity<String>  sendResourceCardToRM(ResourceCard resourceCard){
        Game game = gameService.getGame();
        Collection<ResourceCard> AllResourceCards = new ArrayList<>();
        AllResourceCards.addAll(game.getCards());
        ResourceCard card = new ResourceCard(resourceCard.id(), resourceCard.homeBoardId(), resourceCard.time(), resourceCard.skill(), resourceCard.name());
        AllResourceCards.add(card);
        game.setCards(AllResourceCards);
        return ResponseEntity.ok("ResourceCard Successfully Send To Resource Manager");
    }

}
