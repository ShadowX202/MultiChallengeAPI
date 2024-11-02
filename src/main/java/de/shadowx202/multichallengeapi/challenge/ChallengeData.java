package de.shadowx202.multichallengeapi.challenge;

import de.shadowx202.multichallengeapi.timer.Timer;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.List;


public interface ChallengeData {
    Challenge getChallenge();

    ChallengeState getState();
    void setState(ChallengeState state);
    boolean isState(ChallengeState state);

    List<OfflinePlayer> getPlayers();
    void addPlayer(Player player);
    void removePlayer(Player player);

    Timer getTimer();

}
