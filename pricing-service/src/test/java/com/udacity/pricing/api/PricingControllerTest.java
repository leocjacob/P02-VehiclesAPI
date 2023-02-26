package com.udacity.pricing.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PricingControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void getPrice() throws Exception {
        mvc.perform(get("/services/price").param("vehicleId", "1"))
                .andExpect(status().isOk());
    }
}
