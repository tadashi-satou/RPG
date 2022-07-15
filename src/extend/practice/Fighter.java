package extend.practice;

public class Fighter extends Human {
	String msg = "";
	String name = "戦士";
	int hp = 80;
	int offensive = 10;
	
	public Fighter() {
		super.name = this.name;
		super.hp = this.hp;
		super.offensive = this.offensive;
	}

	@Override
	void attack(Living target) {
		hp = target.hp;       //ヒットポイント
		int damage = offensive * Rand.get(10);
		this.msg = this.name + "が" + target.name + "に斧で攻撃！"+ damage + "のダメージを与えた。";
		target.hp = target.hp - damage;

		System.out.println("人間のターン！");
		System.out.println(this.msg);
	}
}
