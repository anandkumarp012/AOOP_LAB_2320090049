package Com.Music_Streaming;

public class RadioStationMusicSource implements MusicSource{
	private String station;
	public RadioStationMusicSource(String station) {
        this.station = station;
    }
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Tuning in to radio station: " + station);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stopping radio station: " + station);
	}

}
