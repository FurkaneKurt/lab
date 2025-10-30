public class DoublyLinkedPlaylist {

    class Song {
        String title;
        Song next;
        Song prev;

        public Song(String title) {
            this.title = title;
            this.next = null;
            this.prev = null;
        }
    }

    Song head;
    Song tail;
    Song current;

    public DoublyLinkedPlaylist() {
        this.head = null;
        this.tail = null;
        this.current = null;
    }

    public void addSong(String title) {
        Song newSong = new Song(title);

        if (head == null) {
            head = tail = current =newSong;
            return;
    }

    public void nextSong() {
        if (current != null && current.next != null) {
            current = current.next;

            return;
        }

        if (current.next != null) {
            current = current.next;
            System.out.println("NS: Now Playing: " + current.title);
        } else {
            System.out.println("[End of playlist]");
        }
    }

    public void previousSong() {
        if (current == null) {
            System.out.println("Error: Playlist is empty.");
            return;
        }

        if (current.prev != null) {
            current = current.prev;
            System.out.println("PS: Now Playing: " + current.title);
        } else {
            System.out.println("[Start of playlist]");
        }
    }

    public void displayCurrent() {
        if (current != null) {
            System.out.println("Currently playing: " + current.title);
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    public static void main(String[] args) {
        DoublyLinkedPlaylist myPlaylist = new DoublyLinkedPlaylist();

        System.out.println("--- Adding Songs ---");
        myPlaylist.addSong("Song X");
        myPlaylist.addSong("Song Y");
        myPlaylist.addSong("Song Z");

        System.out.println("\n--- Playback Test ---");
        myPlaylist.displayCurrent();

        myPlaylist.nextSong();
        myPlaylist.nextSong();
        myPlaylist.nextSong();

        myPlaylist.previousSong();
        myPlaylist.previousSong();
        myPlaylist.previousSong();
    }
}
