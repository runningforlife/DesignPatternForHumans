package behavioral.templatemethod;

public abstract class Builder {
	
	//Template method
	public void build() {
		this.test();
		this.lint();
		this.assemble();
		this.deploy();
	}
	
	public abstract void test();
	
	public abstract void lint();
	
	public abstract void assemble();
	
	public abstract void deploy();
}
