package com.projeto.backend.REPOSITORY;

import com.projeto.backend.MODEL.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,Long>{

}
