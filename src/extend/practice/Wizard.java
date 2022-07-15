package extend.practice;

public class Wizard extends Human {
	String msg = "";
	String name = "魔法使い";
	int hp = 100;
	int offensive = 30;
	
	public Wizard() {
		super.name = this.name;
		super.hp = this.hp;
		super.offensive = this.offensive;
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
