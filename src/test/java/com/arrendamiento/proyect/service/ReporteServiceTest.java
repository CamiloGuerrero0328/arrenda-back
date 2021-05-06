package com.arrendamiento.proyect.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReporteServiceTest {
	private static final Logger log = LoggerFactory.getLogger(ReporteServiceTest.class);
	
	@Autowired
	private ReporteService reporteService;
	
	@Test
    @DisplayName("findAll")
    public void findAll() {
        assertNotNull(reporteService);
    }

    @Test
    @DisplayName("save")
    public void save() throws Exception {
        assertNotNull(reporteService);
    }

    @Test
    @DisplayName("delete")
    public void delete() throws Exception {
        assertNotNull(reporteService);
    }

    @Test
    @DisplayName("update")
    public void update() throws Exception {
        assertNotNull(reporteService);
    }

    @Test
    @DisplayName("findById")
    public void findById() throws Exception {
        assertNotNull(reporteService);
    }

    @Test
    @DisplayName("count")
    public void count() throws Exception {
        assertNotNull(reporteService);
    }
    
    @Test
    @DisplayName("deleteById")
    public void deleteById() throws Exception {
        assertNotNull(reporteService);
    }
    
    @Test
    @DisplayName("findByIdInmueble")
    public void findByIdInmueble() throws Exception {
        assertNotNull(reporteService);
    }

}
