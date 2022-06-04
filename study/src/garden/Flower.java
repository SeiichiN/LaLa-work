package garden;

public class Flower {
	private String name;
	
	public Flower() {
		this.name = "花";
	}
	public Flower(String name) {
		this.name = name;
	}
	
	public void bloom() {
		System.out.println(this.name + "が咲いた。");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
