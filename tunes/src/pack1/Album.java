package pack1;
import java.util.*;

public class Album {
	
	private String albumName;
	private String bandName;
	private ArrayList<Song> songs = new ArrayList<Song>();
	
	public Album(String aName, String bName){
		albumName = aName;
		bandName = bName;
	}
	
	public String getAlbum(){
		return albumName;
	}
	
	public String getBandName(){
		return bandName;
	}
	
	public void addSong(Song sName){
		songs.add(sName);
	}
	
	public Iterator<Song> getSongs() {
		return songs.iterator();
	}
	
	public String toString() {
		return albumName + " by " + bandName;
	}
} 