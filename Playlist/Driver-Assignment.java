/*
Student ID: 21313091
Student Name: Conor Cusack
*/

public class PlayListDriver {
	public static void main(String[] args) {
		PlayList myPlaylist = new PlayList();
		myPlaylist.add("Morning Glory", "Oasis");  //allows us to add songs to playlist
		PlayList favSongs = new PlayList("Liked");  //allows us to name playlists
		favSongs.add("Take it easy", "Eagles");
		Track SC = new Track("Thunderstruck", "ACDC", 2019, 203); //allows to add tracks
		favSongs.add(SC);
		System.out.printf("%s%s%s%n", "=".repeat(29), "Processing.", "=".repeat(30)); //proccesses the song being added to playlist
		System.out.println(myPlaylist);
		favSongs.showList();
		System.out.printf("%s%s%s%n", "=".repeat(32), "Printing.", "=".repeat(33)); //this allows us to remove specific songs from playlist
		System.out.printf("%s%s%s%n", "=".repeat(20), "Removing 'Roxanne''Who are you''Doin time'", "=".repeat(21));
		System.out.println(myPlaylist.remove("Roxanne"));
		System.out.println(myPlaylist.remove("Who are you"));
		System.out.println(myPlaylist.remove("Doin time"));
		System.out.println(myPlaylist);
		System.out.println("=".repeat(33)+"Playing only year 2014."+"=".repeat(34));   //only [lays songs from specified time period
		favSongs.playOnly(2014);
		System.out.println("=".repeat(33)+"Check if remove worked."+"=".repeat(34)); //checks if the song has been removed
		System.out.println("=".repeat(35)+"Play at random."+"=".repeat(36));		//plays a song from the playlist at random
		favSongs.playAll(true);
		System.out.println("=".repeat(34)+"Playing in order."+"=".repeat(35));		//plays the songs from the playlist in order from start
		favSongs.playAll(false);
		System.out.println("=".repeat(36)+"Playing only 'Foo Fighters'"+"=".repeat(37));   //only plays songs related to sepcified naming
		favSongs.playOnly("Foo Fighters");
	}
}