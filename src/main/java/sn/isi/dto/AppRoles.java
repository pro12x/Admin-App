package sn.isi.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppRoles
{
    private int id;
    @NotNull(message = "Le nom est obligatoire")
    private String nom;
}