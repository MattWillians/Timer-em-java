package timer;

public class GetTime {
    public static void main(String[] args) throws Exception {
        Time h = new Time();

        h.setHora(22);
        h.setMinuto(43);
        h.setSegundo(12);
        h.info();
    }
}
