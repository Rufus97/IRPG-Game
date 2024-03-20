package Main.Utility;

import java.util.Collection;

public interface SummonerMove extends Moves {

    public Collection<Entity> summon();

    public int cooldown();

    public void cooldownDecrement();

    public void cooldownUsed();

    public void cooldownRestored();
}
