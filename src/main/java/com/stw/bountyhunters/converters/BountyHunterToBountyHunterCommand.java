package com.stw.bountyhunters.converters;

import com.stw.bountyhunters.commands.BountyHunterCommand;
import com.stw.bountyhunters.model.BountyHunter;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BountyHunterToBountyHunterCommand implements Converter<BountyHunter, BountyHunterCommand> {

    @Override
    public BountyHunterCommand convert(BountyHunter source) {
        if (source == null) {
            return null;
        }

        final BountyHunterCommand command = new BountyHunterCommand();
        command.setId(source.getId());
        command.setName(source.getName());
        command.setPower(source.getPower());

        return command;
    }
}
