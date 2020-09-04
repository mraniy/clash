package kata.clash.interfaces;

public interface Walkable {

    default int move(int seconds)
    {
        return seconds*3;
    }
}
