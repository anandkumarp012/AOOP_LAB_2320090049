package Com.Music_Streaming;

public class OnlineStreamingMusicSource implements MusicSource{
	private String url;
	public OnlineStreamingMusicSource(String url) {
        this.url = url;
    }
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Streaming music from online service: " + url);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stopping streaming from online service: " + url);
	}

}
