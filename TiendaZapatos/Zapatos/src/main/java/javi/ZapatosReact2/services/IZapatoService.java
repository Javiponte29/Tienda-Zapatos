package javi.ZapatosReact2.services;

import java.util.List;

import javi.ZapatosReact2.models.Zapato;

public interface IZapatoService {
List<Zapato> getZapatos();
Zapato getZapatoById(Integer id);
}
