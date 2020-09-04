package kata.clash.interfaces;

public interface Flyiable {

    default int move(int seconds)
    {
        return seconds*8;
    }
}
