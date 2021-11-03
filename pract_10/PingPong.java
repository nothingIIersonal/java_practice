public class PingPong extends Thread {
    @Override
    public void run() {
        if (getName() == "ping")
            System.out.println("Ping");
        else if (getName() == "pong")
            System.out.println("Pong");
    }

    public static void main(String[] args) {
        PingPong ping_thread = new PingPong();
        PingPong pong_thread = new PingPong();

        ping_thread.setName("ping");
        pong_thread.setName("pong");

        ping_thread.start();
        pong_thread.start();

        while (true) {
            ping_thread.run();
            pong_thread.run();
        }
    }
}
