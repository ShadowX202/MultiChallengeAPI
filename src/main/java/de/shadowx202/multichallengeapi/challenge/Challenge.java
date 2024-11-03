package de.shadowx202.multichallengeapi.challenge;

import org.bukkit.entity.Player;

public interface Challenge {

    String getDisplayName();
    String getId();

    void start(ChallengeData challengeData);
    void stop(ChallengeData challengeData);
    void pause(ChallengeData challengeData);
    void resume(ChallengeData challengeData);

    void playerAdded(ChallengeData challengeData, Player player);
    void playerRemoved(ChallengeData challengeData, Player player);
}
