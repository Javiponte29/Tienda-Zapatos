package javi.ZapatosReact2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javi.ZapatosReact2.models.TallaColor;

@Repository
public interface TallaColorRepository extends JpaRepository<TallaColor, Integer>{

}
