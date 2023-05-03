package sn.isi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.entities.ProduitEntity;

public interface ProduitRepository extends JpaRepository<ProduitEntity, Integer>
{
    //
}