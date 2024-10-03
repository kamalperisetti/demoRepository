package de.itdesign.incubating.rmg.controller;

import de.itdesign.incubating.rmg.model.*;
import de.itdesign.incubating.rmg.service.GameService;
import de.itdesign.incubating.rmg.service.PorjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
//@Controller
public class ProjectManagerController {



//    Player resourceManger = new Player("2", Role.RM, "Bharath", List.of(1, 2));

    @Autowired
    PorjectService projectService;
   // @MessageMapping("game/{gameId}/owner?{ownerId}")
   // @SendTo("/topic/projects")
   @GetMapping("/get-project/{id}")
    public List<ProjectPlan> getProjectByPlayerId(@PathVariable("id") int id) {
        return projectService.getProjectByPlayerId(id);
    }

    @PostMapping("/resource-card-sending")
    public String sendResourceCardToRM(@RequestBody ResourceCard resourceCard){
        return projectService.sendResourceCardToRM(resourceCard);
    }
}
