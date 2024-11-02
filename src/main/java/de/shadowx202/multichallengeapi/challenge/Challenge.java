package de.shadowx202.multichallengeapi.challenge;

public interface Challenge {
    String getDisplayName();
    String getId();

    void start();
    void stop();
    void pause();
    void resume();
}
