package iphone.music.model;

public class Music {
	
	private String name;
    private String artist;

    public Music(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return name + " - " + artist;
    }
    
}
