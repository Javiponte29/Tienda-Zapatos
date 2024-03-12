package javi.ZapatosReact2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javi.ZapatosReact2.repositories.TallaColorRepository;

@Service
public class TallaColor implements ITallaColorService {

    @Autowired TallaColorRepository tcRepo;

    @Override
    public List<javi.ZapatosReact2.models.TallaColor> getTallaColor() {
        return tcRepo.findAll();
    }
}
