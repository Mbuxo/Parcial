package com.example.demo.Repositories;

import com.example.demo.Entities.BaseEntidad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseEntidadRepository <E extends BaseEntidad, ID extends Serializable> extends JpaRepository<E, ID> {
}
