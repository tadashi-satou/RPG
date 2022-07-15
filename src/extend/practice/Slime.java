package extend.practice;

public class Slime extends Monster {
	String msg = "";
	String name = "スライム";
	int hp = 10;
	int offensive = 10;
	
	public Slime() {
		super.name = this.name;
		super.hp = this.hp;
		super.offensive = this.offensive;
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
