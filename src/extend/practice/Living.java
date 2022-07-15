package extend.practice;

public abstract class Living {
	  protected String name; //キャラクターの名前
	  protected int hp;       //ヒットポイント
	  protected int offensive; //攻撃力

	  abstract void attack(Living target); //ターゲットに攻撃するメソッド

}
