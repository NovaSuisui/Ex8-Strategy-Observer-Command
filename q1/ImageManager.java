public class ImageManager {
    private Strategy renderer;
    public void setRenderer(Strategy renderer) {
		this.renderer = renderer;
	}
	public void show() {
		this.renderer.showImage();
	}
}

