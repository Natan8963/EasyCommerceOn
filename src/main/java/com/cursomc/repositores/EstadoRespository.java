package com.cursomc.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cursomc.domain.Estado;

@Repository
public interface EstadoRespository extends JpaRepository<Estado, Integer> {

}
