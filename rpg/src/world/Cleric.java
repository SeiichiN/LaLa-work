package world;

import java.util.Random;

public class Cleric {
	private String name;
	private int hp = 50;
	public static final int HP_MAX = 50;
	private int mp = 10;
	public static final int MP_MAX = 10;

	public void selfAid() {
		this.mp = this.mp - 5;
		this.hp = HP_MAX;
		System.out.println("聖職者は「セルフエイド」という魔法を使った。");
		System.out.println("HPが最大値(50)まで回復した。");
		System.out.println("mpを5使った。");
	}
	
	/**
	 * 聖職者は祈ることで自分のMPを回復できる。
	 * 回復量は祈る秒数+ランダム(3未満)
	 * ただし、最大MPを超えることはない。
	 * @param sec int 祈る秒数
	 * @return int 回復量
	 */
	public int pray(int sec) {
		int hosei = new Random().nextInt(3);
		int kaihuku = sec + hosei;
		if (this.mp + kaihuku > MP_MAX) { 
			kaihuku = MP_MAX - this.mp;
		}
		this.mp = this.mp + kaihuku;
		System.out.println("聖職者は" + sec + "秒祈った");
		System.out.println("MPが" + kaihuku + "回復した。");
		return kaihuku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public static int getHpMax() {
		return HP_MAX;
	}

}
