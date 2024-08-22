package Com.Music_Streaming;

public class LocalFileMusicSource implements MusicSource{
	private String filePath;
	public LocalFileMusicSource(String filePath) {
        this.filePath = filePath;
    }
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing music from local file: " + filePath);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stopping music from local file: " + filePath);
	}
	
}
