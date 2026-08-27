package com.homework.CheckpointFour;

public enum PaymentsChoice {
    CARD(true),
    CASH(false),
    SBP(true);

    private final boolean isOnline;

    PaymentsChoice(boolean isOnline) {
        this.isOnline = isOnline;
    }

    public boolean isOnline() {
        return isOnline;
    }
}
