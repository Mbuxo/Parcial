package com.example.demo.Controller;

import com.example.demo.Entities.Autor;
import com.example.demo.Entities.BaseEntidad;
import com.example.demo.Services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseEntidadControllerImpl<Autor, AutorServiceImpl> {
}