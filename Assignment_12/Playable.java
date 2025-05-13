interface Playable {
    void play();
    void pause();
    void stop();
}

class MP3Player implements Playable {
    public void play() {
        System.out.println("MP3 Player is playing music.");
    }
    public void pause() {
        System.out.println("MP3 Player is paused.");
    }
    public void stop() {
        System.out.println("MP3 Player has stopped playing.");
    }
}

class CDPlayer implements Playable {
    public void play() {
        System.out.println("CD Player is playing music.");
    }
    public void pause() {
        System.out.println("CD Player is paused.");
    }
    public void stop() {
        System.out.println("CD Player has stopped playing.");
    }
}

class StreamingPlayer implements Playable {
    public void play() {
        System.out.println("Streaming Player is streaming music.");
    }
    public void pause() {
        System.out.println("Streaming Player is paused.");
    }
    public void stop() {
        System.out.println("Streaming Player has stopped streaming.");
    }
}

class Q2 {
    public static void controlPlayer(Playable player) {
        player.play();
        player.pause();
        player.stop();
    }

    public static void main(String[] args) {
        System.out.println("Controlling MP3 Player:");
        Playable p1 = new MP3Player();
        controlPlayer(p1);

        System.out.println("\nControlling CD Player:");
        Playable p2 = new CDPlayer();
        controlPlayer(p2);

        System.out.println("\nControlling Streaming Player:");
        Playable p3 = new StreamingPlayer();
        controlPlayer(p3);
    }
}
