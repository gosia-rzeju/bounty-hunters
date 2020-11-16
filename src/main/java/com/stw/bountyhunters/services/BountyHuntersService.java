package com.stw.bountyhunters.services;

public interface BountyHuntersService extends CrudService {

    getByLogin(String login);

    getByName(String name);
}
