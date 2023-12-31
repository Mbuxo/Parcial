package com.example.demo.Repositories;

import com.example.demo.Entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseEntidadRepository<Persona, Long> {

    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);
    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);

    boolean existsByDni(int dni);
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List<Persona> search(String filtro);
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    Page<Persona> search(String filtro, Pageable pageable);

    @Query(value = "SELECT * FROM Persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%", nativeQuery = true)
    List<Persona> search1(String filtro);

    @Query(value = "SELECT * FROM Persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro% ", countQuery = "SELECT count() FROM persona", nativeQuery = true)
    Page<Persona> search1(String filtro, Pageable pageable);

}
