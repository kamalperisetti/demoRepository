package de.itdesign.incubating.rmg;

import de.itdesign.incubating.rmg.model.ProjectPlan;
import de.itdesign.incubating.rmg.model.ResourceCard;
import de.itdesign.incubating.rmg.model.Skill;
import de.itdesign.incubating.rmg.service.PorjectService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
@SpringBootTest
@AutoConfigureMockMvc
public class TestProjectManagerController {

    private MockMvc mockMvc;

    @Mock
    private PorjectService projectService;

    @InjectMocks
    private TestProjectManagerController projectManagerController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(projectManagerController).build();
    }

//    @Test
//    void testGetProjectByPlayerId() throws Exception {
//        // Arrange: mock the service method's behavior
//        List<ProjectPlan> mockProjects = Arrays.asList(
//                new ProjectPlan(1, "Project Alpha"),
//                new ProjectPlan(2, "Project Beta")
//        );
//        when(projectService.getProjectByPlayerId(1)).thenReturn(mockProjects);
//
//        // Act and Assert: perform GET request and verify the response
//        mockMvc.perform(get("/get-project/1"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$[0].id").value(1))
//                .andExpect(jsonPath("$[0].name").value("Project Alpha"))
//                .andExpect(jsonPath("$[1].id").value(2))
//                .andExpect(jsonPath("$[1].name").value("Project Beta"));
//    }

    @Test
    void testSendResourceCardToRM() throws Exception {
        // Arrange: mock the service method's behavior
        ResourceCard newResourceCard = new ResourceCard("1", "B1", 0, Skill.HEART, "Kamal");
        when(projectService.sendResourceCardToRM(newResourceCard)).thenReturn("Resource card sent");

        // Act and Assert: perform POST request and verify the response
        mockMvc.perform(post("/resource-card-sending")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"id\":1,\"name\":\"Resource A\",\"quantity\":2}"))
                .andExpect(status().isOk())
                .andExpect(content().string("Resource card sent"));
    }
}
