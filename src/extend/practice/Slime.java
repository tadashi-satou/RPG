package extend.practice;

public class Slime extends Monster {
	protected String msg = "";
	
	public Slime() {
		super.name = "スライム";
		super.hp = 10;
		super.offensive = 10;
	}

	@Override
	void attack(Living target) {
		hp = target.hp;       //ヒットポイント
		int damage = offensive * Rand.get(10);
		this.msg = this.name + "が" + target.name + "に体当たりで攻撃！"+ damage + "のダメージを与えた。";
		target.hp = target.hp - damage;

		System.out.println("モンスターのターン！");
		System.out.println(this.msg);

	}
}
