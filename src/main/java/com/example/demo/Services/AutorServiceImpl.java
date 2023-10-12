package com.example.demo.Services;

import com.example.demo.Entities.Autor;
import com.example.demo.Repositories.AutorRepository;
import com.example.demo.Repositories.BaseEntidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AutorServiceImpl extends BaseEntidadServiceImpl<Autor,Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseEntidadRepository<Autor, Long> baseEntidadRepository) {
        super(baseEntidadRepository);
    }

}
