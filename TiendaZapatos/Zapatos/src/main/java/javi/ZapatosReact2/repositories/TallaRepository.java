package javi.ZapatosReact2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javi.ZapatosReact2.models.Talla;

@Repository
public interface TallaRepository extends JpaRepository<Talla, Integer>{

}
