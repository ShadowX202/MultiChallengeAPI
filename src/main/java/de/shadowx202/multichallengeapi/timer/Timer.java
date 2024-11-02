package de.shadowx202.multichallengeapi.timer;

import org.bukkit.entity.Player;

public interface Timer {

    long getTime();
    void setTime(long time);
    long addTime(long time);
    long removeTime(long time);

    TimerState getState();
    boolean isState(TimerState state);

    void pause();
    void stop();
    void start();


    String toString();
}
