package extend.practice;

public class Dragon extends Monster {
	protected String msg = "";
	
	public Dragon() {
		super.name = "ドラゴン";
		super.hp = 100;
		super.offensive = 20;
	}

	@Override
	void attack(Living target) {
		hp = target.hp;       //ヒットポイント
		int damage = offensive * Rand.get(10);
		this.msg = this.name + "が" + target.name + "に炎で攻撃！"+ damage + "のダメージを与えた。";
		target.hp = target.hp - damage;

		System.out.println("モンスターのターン！");
		System.out.println(this.msg);
	}
}
