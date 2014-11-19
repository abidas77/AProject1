package HW2;


public class Instruments {

	private String type, instrument, song;
	private boolean tuned, playing;
	
	public Instruments()
	{
		type = "woodwind";
		instrument = "clarinet";
		tuned = false;
		playing = false;
	}
	
	public Instruments(String type, String instrument, boolean tuned, boolean playing)
	{
		this.type = type;
		this.instrument = instrument;
		this.tuned = tuned;
		this.playing = playing;
	}
	
	public boolean isPlaying()
	{
		return playing;
	}
	
	public boolean isTuned()
	{
		return tuned;
	}
	
	public void tune()
	{
		tuned = true;
	}
	
	public void play()
	{
		playing = true;
	}
	
	public void chooseSong(String song)
	{
		this.song = song;
	}
}
