import java.util.ArrayList;
/*
Student ID: 21313091
Student Name: Conor Cusack
*/
public class PlayList {
	private String playlistName;		//the creation of a private playlist and name for it
	private ArrayList<Track> playlist;

	public PlayList() {
		this.playlistName = "My PlayList";
		this.playlist = new ArrayList<>();
	}
	public PlayList(String name) {		
		this.playlistName = name;
		this.playlist = new ArrayList<>();
	}
	public void setName(String name) {
		this.playlistName = name;
	}
	public String getName() {
		return playlistName;
	}
	public void add(String title, String artist) {
		add(title, artist, 0, 0);
	}
	public void add(String title, String artist, int year, int duration) {
		add(new Track(title, artist, year, duration));
	}
	public void add(Track track) {
		playlist.add(track);
	}
	public boolean remove(String title) {   //checks if the song searched is there to be removed
		boolean isFound = false;
		if (!playlist.isEmpty()) {				
			for (Track track : playlist) {
				if (title.toLowerCase().equals(track.getTitle().toLowerCase())) {
					isFound = true;
					playlist.remove(track);
					break;
				}
			}
		}
		return isFound;
	}
	public void showList() {			//shows list of songs in playlist, if none then the system message is sent out
		if (playlist.isEmpty()) System.out.println("No song's are currently inside this playlist :(");	
		else {
			System.out.println(playlistName);
			for (Track track : playlist) System.out.println(track);
		}
	}
	public void playAll(boolean random) {		//plays playlist at random
		if (!playlist.isEmpty()) {
			if (random) {
				ArrayList<Track> tempList = new ArrayList<>(playlist);
				for(int i=0; i<playlist.size(); i++) {
					int num = (int) (Math.random()*tempList.size());
					System.out.println(tempList.get(num));
					tempList.remove(num);
				}
			} else {
				for (Track track : playlist) System.out.println(track);
			}
		}
	}
	public void playOnly(String artist) { 		//only plays songs related to specified artist
		if (!playlist.isEmpty()) {
			for (Track track : playlist) {
				if (track.getArtist().toLowerCase().contains(artist.toLowerCase())) System.out.println(track);
			} 
		}
	}
	public void playOnly(int year) {		//only plays songs related to specified year
		if (!playlist.isEmpty()) {
			for (Track track : playlist) {
				if (year == track.getYear()) System.out.println(track);
			}
		}
	}
	public String toString() {
		String str = String.format("%s%n", playlistName);
		if (!playlist.isEmpty()) {				
			for (Track track : playlist) str += track + "\n";
		}
		return str.substring(0, str.length()-1);
	}
}
