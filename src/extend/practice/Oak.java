package extend.practice;

public class Oak extends Monster {
	String msg = "";
	String name = "オーク";
	int hp = 80;
	int offensive = 10;
	
	public Oak() {
		super.name = this.name;
		super.hp = this.hp;
		super.offensive = this.offensive;
	}

	@Override
	void attack(Living target) {
		hp = target.hp;       //ヒットポイント
		int damage = offensive * Rand.get(10);
		this.msg = this.name + "が" + target.name + "に槍で攻撃！"+ damage + "のダメージを与えた。";
		target.hp = target.hp - damage;

		System.out.println("モンスターのターン！");
		System.out.println(this.msg);
	}
}
