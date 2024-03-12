package javi.ZapatosReact2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javi.ZapatosReact2.models.Zapato;
import javi.ZapatosReact2.repositories.ZapatoRepository;

@Service
public class ZapatoService implements IZapatoService{

    @Autowired
    ZapatoRepository zRepo;

    @Override
    public List<Zapato> getZapatos() {
        return zRepo.findAll();
    }

    @Override
    public Zapato getZapatoById(Integer id) {
        Optional<Zapato> op = zRepo.findById(id);
        if (op.isPresent()) {
            return op.get();
        } return null;
    }

}
