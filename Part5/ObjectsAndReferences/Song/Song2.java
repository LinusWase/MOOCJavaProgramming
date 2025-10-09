
public class Song2 {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song2(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }

        if (!(compared instanceof Song2)){
            return false;
        }

        Song2 comparedSong = (Song2) compared;

        return this.name.equals(comparedSong.name) && this.artist == comparedSong.artist && this.durationInSeconds == comparedSong.durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
