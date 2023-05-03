package sn.isi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.entities.AppRolesEntity;

public interface AppRolesRepository extends JpaRepository<AppRolesEntity, Integer>
{
    //
}
