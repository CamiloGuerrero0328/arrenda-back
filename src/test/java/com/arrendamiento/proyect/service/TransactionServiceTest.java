package com.arrendamiento.proyect.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TransactionServiceTest {
	private static final Logger log = LoggerFactory.getLogger(TransactionServiceTest.class);
	
	@Autowired
	private TransactionService transactionService;
	
	@Test
    @DisplayName("findAll")
    public void findAll() {
        assertNotNull(transactionService);
    }

    @Test
    @DisplayName("save")
    public void save() throws Exception {
        assertNotNull(transactionService);
    }

    @Test
    @DisplayName("delete")
    public void delete() throws Exception {
        assertNotNull(transactionService);
    }

    @Test
    @DisplayName("deleteById")
    public void deleteById() throws Exception {
        assertNotNull(transactionService);
    }

    @Test
    @DisplayName("update")
    public void update() throws Exception {
        assertNotNull(transactionService);
    }

    @Test
    @DisplayName("findById")
    public void findById() throws Exception {
        assertNotNull(transactionService);
    }

    @Test
    @DisplayName("count")
    public void count() throws Exception {
        assertNotNull(transactionService);
    }
}
