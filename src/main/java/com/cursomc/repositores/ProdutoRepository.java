package com.cursomc.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cursomc.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Integer>   {

}
