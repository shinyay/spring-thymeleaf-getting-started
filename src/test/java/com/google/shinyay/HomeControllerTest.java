package com.google.shinyay;

import com.google.shinyay.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(classes = HomeController.class)
@AutoConfigureMockMvc
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void rootAccessShouldReturnSuccess() throws Exception {
        mockMvc.perform(get("/")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    void rootAccessShouldReturnHomeTemplate() throws Exception {
        mockMvc.perform(get("/")).andDo(print())
                .andExpect(view().name("home"));
    }

    @Test
    void postDataShouldDisplay() throws Exception {
        String postName = "Alice";
        mockMvc.perform(post("/").content(postName)).andDo(print())
                .andExpect(model().attribute("th_greet", "Hello, "+ postName));
    }
}
