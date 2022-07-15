package extend.practice;

public class Oak extends Monster {
	protected String msg = "";
	
	public Oak() {
		super.name = "オーク";
		super.hp = 80;
		super.offensive = 10;
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
