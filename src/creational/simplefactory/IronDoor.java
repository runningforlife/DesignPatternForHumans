package creational.simplefactory;

public class IronDoor implements Door {
	private float mWidth;
	private float mHeight;
	
	public IronDoor(float w, float h) {
		mWidth = w;
		mHeight = h;
	}

	@Override
	public float getWidth() {
		return mWidth;
	}

	@Override
	public float getHeight() {
		return mHeight;
	}

}
