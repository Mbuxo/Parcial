package com.example.demo.Services;


import com.example.demo.Entities.Persona;
import com.example.demo.Repositories.BaseEntidadRepository;
import com.example.demo.Repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseEntidadServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private final PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseEntidadRepository<Persona, Long> baseEntidadRepository, PersonaRepository personaRepository) {
        super(baseEntidadRepository);
        this.personaRepository = personaRepository;
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try {
            //List<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            //List<Persona> personas = personaRepository.search1(filtro);
            List<Persona> personas = personaRepository.search(filtro);
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try {
            //Page<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);
            //Page<Persona> personas = personaRepository.search1(filtro, pageable);
            Page<Persona> personas = personaRepository.search(filtro, pageable);
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
