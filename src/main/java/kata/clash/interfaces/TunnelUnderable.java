package kata.clash.interfaces;

public interface TunnelUnderable {

    default int move(int seconds)
    {
        return seconds*5;
    }
}
