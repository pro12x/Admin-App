package sn.isi.services.interfaces;

import sn.isi.entities.AppRolesEntity;

import java.util.List;

public interface IAppRoles
{
    AppRolesEntity addRole(AppRolesEntity appRolesEntity);
    AppRolesEntity updateRole(int id, AppRolesEntity appRolesEntity);
    void deleteRole(int id);
    List<AppRolesEntity> getAllRoles();
    AppRolesEntity getRole(int id);
}
