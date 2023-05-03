package sn.isi.services.interfaces;

import sn.isi.entities.ProduitEntity;

import java.util.List;

public interface IProduit
{
    ProduitEntity addProduit(ProduitEntity produitEntity);
    ProduitEntity updateProduit(int id, ProduitEntity produitEntity);
    void deleteProduit(int id);
    List<ProduitEntity> getAllProduits();
    ProduitEntity getProduit(int id);
}
