package sn.isi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser
{
    private int id;
    @NotNull(message = "Le nom est obligatoire")
    private String nom;
    @NotNull(message = "Le prénom est obligatoire")
    private String prenom;
    @Email
    @NotNull(message = "L'email est obligatoire")
    private String email;
    @NotNull(message = "Le mot de passe est obligatoire")
    private String password;
    @NotNull(message = "L'état est obligatoire")
    private int etat;
}
