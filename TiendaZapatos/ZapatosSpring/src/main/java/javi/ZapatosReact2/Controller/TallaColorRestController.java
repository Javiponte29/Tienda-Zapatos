package javi.ZapatosReact2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javi.ZapatosReact2.models.TallaColor;
import javi.ZapatosReact2.services.ITallaColorService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/stock")
@CrossOrigin
public class TallaColorRestController {

    @Autowired
    ITallaColorService tcSer;

    @GetMapping("/list")
    public List<TallaColor> mostrar() {
        return tcSer.getTallaColor();
    }
    
}
