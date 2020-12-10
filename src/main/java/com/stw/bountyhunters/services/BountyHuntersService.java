package com.stw.bountyhunters.services;

import com.stw.bountyhunters.commands.BountyHunterCommand;
import com.stw.bountyhunters.model.BountyHunter;

import java.util.Optional;

public interface BountyHuntersService extends CrudService<BountyHunter, Long> {

    BountyHunter getByLogin(String login);

    BountyHunter getByName(String name);

    BountyHunterCommand saveBountyHunterCommand(BountyHunterCommand command);
}
