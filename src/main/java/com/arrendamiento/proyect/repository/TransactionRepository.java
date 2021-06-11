package com.arrendamiento.proyect.repository;

import com.arrendamiento.proyect.domain.Reporte;
import com.arrendamiento.proyect.domain.Transaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;


/**
* @author Zathura Code Generator Version 9.0 http://zathuracode.org
* www.zathuracode.org
*
*/
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	
	@Query("SELECT a FROM Transaction a WHERE a.inmueble.idInmueble = :idInmueble")
    public List<Transaction> findByIdInmueble(@Param("idInmueble") Integer id);
}
