package extend.practice;

public class Brave extends Human {
	protected String msg = "";

	public Brave() {
		super.name = "勇者";
		super.hp = 100;
		super.offensive = 20;
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
