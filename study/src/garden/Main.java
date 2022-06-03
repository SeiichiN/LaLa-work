package garden;

public class Main {

	public static void main(String[] args) {
		Flower f = new Flower("あじさい");
		f.bloom();
		
		Rose r = new Rose("バラ");
		r.smell();
		r.bloom();
	}

}
