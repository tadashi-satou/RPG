package extend.practice;

public class Dragon extends Monster {
	String msg = "";
	String name = "ドラゴン";
	int hp = 100;
	int offensive = 10;
	
	public Dragon() {
		super.name = this.name;
		super.hp = this.hp;
		super.offensive = this.offensive;
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
