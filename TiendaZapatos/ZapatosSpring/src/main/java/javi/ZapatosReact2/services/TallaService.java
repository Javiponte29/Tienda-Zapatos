package javi.ZapatosReact2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javi.ZapatosReact2.models.Talla;
import javi.ZapatosReact2.repositories.TallaRepository;

@Service
public class TallaService implements ITallaService{

    @Autowired
    TallaRepository tRepo;

    @Override
    public List<Talla> getTallas() {
        return tRepo.findAll();
    }
}
