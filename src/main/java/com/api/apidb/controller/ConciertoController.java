package com.api.apidb.controller;

import com.api.apidb.model.Concierto;
import com.api.apidb.services.ConciertoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/conciertos")
public class ConciertoController {
    private final ConciertoService conciertoService;

    public ConciertoController(ConciertoService conciertoService) {
        this.conciertoService = conciertoService;
    }

    @GetMapping
    public List<Concierto> listarTodosLosConciertos() {
        return conciertoService.obtenerTodosLosConciertos();
    }

    @GetMapping("/{id}")
    public Concierto findById(@PathVariable Long id) {
        return conciertoService.obtenerConciertoPorId(id);
    }
}