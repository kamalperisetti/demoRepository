package de.itdesign.incubating.rmg.controller;

import de.itdesign.incubating.rmg.model.*;
import de.itdesign.incubating.rmg.service.GameService;
import de.itdesign.incubating.rmg.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@Controller
public class ProjectManagerController {

    @Autowired
    ProjectService projectService;

    @Autowired
    GameService gameService;

    @MessageMapping("/sayhi")
    @SendTo("/topic/hello")
    public String sayHello(){
        return "HII GUYSSS";
    }

//    @MessageMapping("{playerId}")
//    @SendTo("/topic/projects")
    @GetMapping("games/{gameId}/projectPlans")
    public List<ProjectPlan> getProjectByPlayerId(@PathVariable("gameId") int gameId, @RequestParam("ownerId")int playerId) {
      return projectService.getProjectByPlayerId(gameId, playerId);
    }

    @PostMapping("/game/1/resources/resourcesId/return")
    public ResponseEntity<String> sendResourceCardToRM(@RequestBody ResourceCard resourceCard){
        return projectService.sendResourceCardToRM(resourceCard);
    }
}
