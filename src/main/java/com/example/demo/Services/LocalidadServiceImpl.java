package com.example.demo.Services;

import com.example.demo.Entities.Localidad;
import com.example.demo.Repositories.BaseEntidadRepository;
import com.example.demo.Repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocalidadServiceImpl extends BaseEntidadServiceImpl<Localidad,Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseEntidadRepository<Localidad, Long> baseEntidadRepository){
        super(baseEntidadRepository);
    }
}
