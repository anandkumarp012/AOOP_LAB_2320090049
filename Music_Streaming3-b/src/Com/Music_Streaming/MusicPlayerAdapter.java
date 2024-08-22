package Com.Music_Streaming;

public class MusicPlayerAdapter implements MusicSource{
	private MusicSource musicSource;
	public MusicPlayerAdapter(MusicSource musicSource) {
        this.musicSource = musicSource;
    }
	@Override
	public void play() {
		// TODO Auto-generated method stub
		musicSource.play();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		musicSource.stop();
	}

}
