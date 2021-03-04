package com.onarandombox.MultiverseCore.commandtools.flags;

public abstract class OptionalCommandFlag<T> extends CommandFlag<T> {

    public OptionalCommandFlag(String name, String identifier, Class<T> type) {
        super(name, identifier, type, ValueRequirement.OPTIONAL);
    }
}
