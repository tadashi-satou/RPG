package extend.practice;

public class Brave extends Human {
	String msg = "";
	String name = "勇者";
	int hp = 100;
	int offensive = 3;

	public Brave() {
		super.name = this.name;
		super.hp = this.hp;
		super.offensive = this.offensive;
	}

	@Override
	void attack(Living target) {
		hp = target.hp;    //ヒットポイント
		int damage = this.offensive * Rand.get(9);
		this.msg = this.name + "が" + target.name + "に剣で攻撃！"+ damage + "のダメージを与えた。";
		target.hp = target.hp - damage;

		System.out.println("人間のターン！");
		System.out.println(this.msg);
	}
}
