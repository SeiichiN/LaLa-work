package garden;

public class Flower {
	private String fname;
	
	public Flower() {
		this.fname = "花";
	}
	public Flower(String name) {
		this.fname = name;
	}
	
	public void bloom() {
		System.out.println(this.fname + "が咲いた。");
	}
	public String getName() {
		return fname;
	}
	public void setName(String name) {
		this.fname = name;
	}
	
	public Leaf makeLeaf() {
		Leaf l = new Leaf("葉");
		return l;
	}

	class Leaf {
		private String name;
		public Leaf (String name) {
			this.name = name;
		}
		public String getName() {
			return this.name;
		}
	}
}

