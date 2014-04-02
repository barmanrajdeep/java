package pack1;

public class Song {
	
	private String songName;
	private String band;
	private double price;
	
	public Song(String sname, String bname, double cp) {
		songName = sname;
		band = bname;
		price = cp;
	}
	
	public String getSongName(){
		return songName;
	}
	
	public String getBandName(){
		return band;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double cp){
		price = cp;
	}
	
	public String toString(){
		return songName + " by " + band + " costs" + " Rs. " + price;
	}
}
