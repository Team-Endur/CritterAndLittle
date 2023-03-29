package net.thebois.critters.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum SlugVariant {
    BLACK(0),
    ORANGE(1),
    BANANA(2),
    WHITE(3),
    SLIME(4),
    FLUORESCENT(5);

    private static final SlugVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(SlugVariant::getId)).toArray(SlugVariant[]::new);
    private final int id;

    SlugVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static SlugVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
