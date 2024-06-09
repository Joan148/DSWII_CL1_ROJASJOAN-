package com.rojasjoan.dsw.cl1.repository;

import com.rojasjoan.dsw.cl1.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository  extends JpaRepository<Medico, Integer> {

}
