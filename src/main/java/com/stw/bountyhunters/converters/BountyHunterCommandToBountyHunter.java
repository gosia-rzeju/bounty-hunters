package com.stw.bountyhunters.converters;

import com.stw.bountyhunters.commands.BountyHunterCommand;
import com.stw.bountyhunters.model.BountyHunter;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class BountyHunterCommandToBountyHunter implements Converter<BountyHunterCommand, BountyHunter> {

    @Synchronized
    @Nullable
    @Override
    public BountyHunter convert(BountyHunterCommand source) {
        if (source == null) {
            return null;
        }

        final BountyHunter hunter = new BountyHunter();
        hunter.setId(source.getId());
        hunter.setName(source.getName());
        hunter.setPower(source.getPower());

        return hunter;
    }
}
