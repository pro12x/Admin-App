package sn.isi.services.interfaces;

import sn.isi.entities.AppUserEntity;

import java.util.List;

public interface IAppUser
{
    AppUserEntity addUser(AppUserEntity appUserEntity);
    AppUserEntity updateUser(int id, AppUserEntity appUserEntity);
    void deleteUser(int id);
    List<AppUserEntity> getAllUsers();
    AppUserEntity getUser(int id);
    AppUserEntity getUserByEmail(String email);
}
