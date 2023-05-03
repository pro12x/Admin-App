package sn.isi.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produit
{
    private int id;
    @NotNull(message = "La référence est obligatoire")
    private String ref;
    @NotNull(message = "Le nom du produit est obligatoire")
    private String nom;
    @NotNull(message = "La quantité est obligatoire")
    private double qtStock;
}
