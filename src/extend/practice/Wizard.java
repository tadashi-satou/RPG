package extend.practice;

public class Wizard extends Human {
	protected String msg = "";
	
	public Wizard() {
		super.name = "魔法使い";
		super.hp = 30;
		super.offensive = 30;
	}

	@Override
	void attack(Living target) {
		hp = target.hp;       //ヒットポイント
		int damage = offensive * Rand.get(10);
		this.msg = this.name + "が" + target.name + "に魔法で攻撃！"+ damage + "のダメージを与えた。";
		target.hp = target.hp - damage;

		System.out.println("人間のターン！");
		System.out.println(this.msg);
	}
}
