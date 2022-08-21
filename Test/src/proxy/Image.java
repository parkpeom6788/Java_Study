package proxy;

public interface Image {
	public void displayImage();
}

class RealImage implements Image {
	
	private String filename;
	
	public RealImage(String filename) {
		this.filename = filename;
		loadImageFromDisk();
	}
	public void loadImageFromDisk() {
		System.out.println("Loading "  + filename);
	}
	@Override
	public void displayImage() {
		System.out.println("DisPlaying " + filename);
	}
	
}
