package sn.isi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class AppUserEntity implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true, nullable = false, length = 200)
    private String nom;
    @Column(unique = true, nullable = false, length = 200)
    private String prenom;
    @Column(unique = true, nullable = false, length = 50)
    private String email;
    @Column(unique = true, nullable = false, length = 100)
    private String password;
    private int etat;

    @ManyToMany
    private List<AppRolesEntity> appRolesEntities;

    @OneToMany(mappedBy = "appUserEntity")
    private List<ProduitEntity> produitEntities;
}
