package kata.clash.interfaces;

public interface Runnable {

    default int move(int seconds)
    {
        return seconds*6;
    }
}
