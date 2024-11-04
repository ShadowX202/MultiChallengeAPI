package de.shadowx202.multichallengeapi;

import de.shadowx202.multichallengeapi.challenge.Challenge;
import de.shadowx202.multichallengeapi.challenge.ChallengeData;
import org.bukkit.entity.Player;

import java.util.List;

public interface ChallengeManager {
    List<Challenge> getChallenges();
    List<ChallengeData> getActiveChallenges();

    boolean registerChallenge(Challenge challenge);
    boolean isRegistered(Challenge challenge);

    ChallengeData openChallenge(Challenge challenge, List<Player> players);
    ChallengeData closeChallenge(ChallengeData challengeData);

    List<ChallengeData> getActiveChallenges(Challenge challenge);
    ChallengeData getActiveChallenge(Player player);
}
