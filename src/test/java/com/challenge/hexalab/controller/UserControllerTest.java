package com.challenge.hexalab.controller;

import com.challenge.hexalab.domain.model.User;
import com.challenge.hexalab.domain.repository.UserRepository;
import com.challenge.hexalab.domain.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import javax.transaction.Transactional;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@TestPropertySource("classpath:application-test.properties")
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired private UserRepository userRepository;

    @Autowired private UserServiceImpl userService;

    @Test
    @Transactional
    void showSaveAnUserWithBalanceIsZero() throws Exception {
        mockMvc
                .perform(post("/users").contentType(MediaType.APPLICATION_JSON)
                        .content("{\n" +
                                "    \"name\" : \"Teste 1\",\n" +
                                "    \"email\" : \"testa4aa56@teste.com\",\n" +
                                "    \"cpf_cnpj\" : \"1152243133\",\n" +
                                "    \"password\" : \"123senha\",\n" +
                                "    \"pin\" : \"222\",\n" +
                                "    \"balance\" : \"14233\",\n" +
                                "    \"phone\" : \"11998334810\"\n" +
                                "}"))
                .andExpect(status().isCreated());

        User userCreate = userService.list(0, 1).getContent().get(0);

        assertEquals("Teste 1", userCreate.getName());
        assertEquals("testa4aa56@teste.com", userCreate.getEmail());
        assertEquals("1152243133", userCreate.getCpfCnpj());
        assertEquals("123senha", userCreate.getPassword());
        assertEquals("222", userCreate.getPin());
        assertEquals(BigDecimal.ZERO, userCreate.getBalance());
        assertEquals("11998334810", userCreate.getPhone());
    }

}
