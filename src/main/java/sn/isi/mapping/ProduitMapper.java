package sn.isi.mapping;

import sn.isi.dto.Produit;
import sn.isi.entities.ProduitEntity;

public interface ProduitMapper
{
    Produit toProduit(ProduitEntity produitEntity);
    ProduitEntity fromProduit(Produit produit);
}
