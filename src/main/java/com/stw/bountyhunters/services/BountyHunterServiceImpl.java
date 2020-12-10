package com.stw.bountyhunters.services;

import com.stw.bountyhunters.commands.BountyHunterCommand;
import com.stw.bountyhunters.converters.BountyHunterCommandToBountyHunter;
import com.stw.bountyhunters.converters.BountyHunterToBountyHunterCommand;
import com.stw.bountyhunters.model.BountyHunter;
import com.stw.bountyhunters.repositories.BountyHunterRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
public class BountyHunterServiceImpl implements BountyHuntersService {

    private final BountyHunterRepository bountyHunterRepository;
    private final BountyHunterToBountyHunterCommand bountyHunterToBountyHunterCommand;
    private final BountyHunterCommandToBountyHunter bountyHunterCommandToBountyHunter;

    public BountyHunterServiceImpl(BountyHunterRepository bountyHunterRepository, BountyHunterToBountyHunterCommand bountyHunterToBountyHunterCommand, BountyHunterCommandToBountyHunter bountyHunterCommandToBountyHunter) {
        this.bountyHunterRepository = bountyHunterRepository;
        this.bountyHunterToBountyHunterCommand = bountyHunterToBountyHunterCommand;
        this.bountyHunterCommandToBountyHunter = bountyHunterCommandToBountyHunter;
    }

    @Override
    public BountyHunter getByLogin(String login) {

        return bountyHunterRepository.findByLogin(login).orElse(null);
    }

    @Override
    public Set<BountyHunter> findAll() {
        Set<BountyHunter> hunters= new HashSet<>();
        bountyHunterRepository.findAll().forEach(hunters::add);
        return hunters;
    }

    @Override
    public BountyHunter findById(Long aLong) {
        return bountyHunterRepository.findById(aLong).orElse(null);
    }

    @Override
    public BountyHunter save(BountyHunter object) {
        return bountyHunterRepository.save(object);
    }

    @Override
    public void delete(BountyHunter object) {
        bountyHunterRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
    bountyHunterRepository.deleteById(aLong);
    }

    @Override
    public BountyHunter getByName(String name) {
        return bountyHunterRepository.findByName(name).orElse(null);
    }

    @Override
    @Transactional
    public BountyHunterCommand saveBountyHunterCommand(BountyHunterCommand command) {
        BountyHunter detachedHunter = bountyHunterCommandToBountyHunter.convert(command);

        BountyHunter savedHunter = bountyHunterRepository.save(detachedHunter);

        return bountyHunterToBountyHunterCommand.convert(savedHunter);
    }


}
