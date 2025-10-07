public class Song {
    private String songName;
    private int lengthInSeconds;

    public Song(String name, int length){
        this.songName = name;
        this.lengthInSeconds = length;
    }

    public String name(){
        return this.songName;
    }

    public int length(){
        return this.lengthInSeconds;
    }
}
