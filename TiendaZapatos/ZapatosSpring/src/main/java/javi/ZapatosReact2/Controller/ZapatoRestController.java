package javi.ZapatosReact2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javi.ZapatosReact2.models.Talla;
import javi.ZapatosReact2.models.Zapato;
import javi.ZapatosReact2.services.ITallaService;
import javi.ZapatosReact2.services.IZapatoService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin
@RestController
@RequestMapping("/zapato")
public class ZapatoRestController {

    @Autowired
    IZapatoService zSer;

    @Autowired
    ITallaService tSer;

    @GetMapping("/list")
    public List<Zapato> mostrar() {
        return zSer.getZapatos();
    }
    

    @GetMapping("/{id}")
    public Zapato mostrarZapato(@PathVariable Integer id) {
        return zSer.getZapatoById(id);
    }
    

    @GetMapping("/tallas")
    public List<Talla> mostrarTallas() {
        return tSer.getTallas();
    }
    
}
