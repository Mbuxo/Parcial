package com.example.demo.Controller;

import com.example.demo.Entities.Localidad;
import com.example.demo.Services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseEntidadControllerImpl<Localidad, LocalidadServiceImpl> {
}
