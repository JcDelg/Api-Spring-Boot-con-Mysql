package com.api.apidb.services;

import com.api.apidb.model.Concierto;
import com.api.apidb.repository.ConciertoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConciertoService {
    private final ConciertoRepository conciertoRepository;

    public ConciertoService(ConciertoRepository conciertoRepository) {
        this.conciertoRepository = conciertoRepository;
    }

    public List<Concierto> obtenerTodosLosConciertos() {
        return conciertoRepository.findAll();
    }

    public Concierto obtenerConciertoPorId(Long id) {
        return conciertoRepository.findById(id);
    }
}