package com.stw.bountyhunters.services;

import com.stw.bountyhunters.model.BountyHunter;

public interface BountyHuntersService extends CrudService<BountyHunter, Long> {

    BountyHunter getByLogin(String login);

    BountyHunter getByName(String name);
}
