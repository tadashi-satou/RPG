package extend.practice;

public class Fighter extends Human {
	protected String msg = "";
	
	public Fighter() {
		super.name = "戦士";
		super.hp = 80;
		super.offensive = 15;
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
