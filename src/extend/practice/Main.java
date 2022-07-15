package extend.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int humanindex;
		int monstarindex;

		Brave brave = new Brave();
		Fighter fighter = new Fighter();
		Wizard wizard = new Wizard();

		Oak oak = new Oak();
		Slime slime = new Slime();
		Dragon dragon = new Dragon();
		
		//List<String> list = new ArrayList<>();
		List<Living> humanlist = new ArrayList<>();
		humanlist.add(brave);
		humanlist.add(fighter);
		humanlist.add(wizard);
		List<Living> monstarlist = new ArrayList<>();
		monstarlist.add(oak);
		monstarlist.add(slime);
		monstarlist.add(dragon);

        //while (humanlist.size() < 0 || monstarlist.size() < 0) {
        while (humanlist.size() > 0 || monstarlist.size() > 0) {

    		humanindex = new Random().nextInt(humanlist.size()); //listサイズ範囲からランダムに選択された整数
    		monstarindex = new Random().nextInt(monstarlist.size()); //listサイズ範囲からランダムに選択された整数

    		Living selecthuman = humanlist.get(humanindex); // 人間の攻撃キャラ、ランダムに選択された要素
    		Living selectmonstar = monstarlist.get(monstarindex); //モンスターの攻撃キャラ、ランダムに選択された要素
    		
    		//人間側の攻撃
    		selecthuman.attack(selectmonstar);
    		//モンスター側死亡判定
            if(selectmonstar.hp <= 0) {
        		System.out.println(selectmonstar.name + "は倒れた");
        		if(selectmonstar.name == "ドラゴン" ) {
                	monstarlist.remove(dragon); //魔物リストから削除
                    if(monstarlist.size() <= 0) {//魔物全滅判定
                		System.out.println("勇者たちは勝利した！");
                        break;
                    }
                	//残りがいれば魔物リストから再選択
            		monstarindex = new Random().nextInt(monstarlist.size());
            		selectmonstar = monstarlist.get(monstarindex);
        		}else if(selectmonstar.name == "スライム"){
                	monstarlist.remove(slime); //魔物リストから削除            	        			
                    if(monstarlist.size() <= 0) {//魔物全滅判定
                		System.out.println("勇者たちは勝利した！");
                        break;
                    }
                	//残りがいれば魔物リストから再選択
            		monstarindex = new Random().nextInt(monstarlist.size());
            		selectmonstar = monstarlist.get(monstarindex);
        		}else{
        			monstarlist.remove(oak); //魔物リストから削除            	
                    if(monstarlist.size() <= 0) {//魔物全滅判定
                		System.out.println("勇者たちは勝利した！");
                        break;
                    }
                	//残りがいれば魔物リストから再選択
            		monstarindex = new Random().nextInt(monstarlist.size());
            		selectmonstar = monstarlist.get(monstarindex);
            	}
        	}
    		//モンスター側の攻撃
    		selectmonstar.attack(selecthuman);
    		//人間側死亡判定
            if(selecthuman.hp <= 0) {
        		System.out.println(selecthuman.name + "は倒れた");
        		if(selecthuman.name == "勇者" ) {
                	humanlist.remove(brave); //人間リストから削除
                    if(humanlist.size() <= 0) {//人間全滅判定
                		System.out.println("魔物たちは勝利した！");
                        break;
                    }
                	//残りがいれば人間リストから再選択
            		humanindex = new Random().nextInt(humanlist.size());
            		selecthuman = humanlist.get(humanindex);
        		}else if(selecthuman.name == "魔法使い"){
        			humanlist.remove(wizard); //人間リストから削除            	        			
                    if(humanlist.size() <= 0) {//人間全滅判定
                		System.out.println("魔物たちは勝利した！");
                        break;
                    }
                	//残りがいれば人間リストから再選択
            		humanindex = new Random().nextInt(humanlist.size());
            		selecthuman = humanlist.get(humanindex);
        		}else{
        			humanlist.remove(fighter); //人間リストから削除
                    if(humanlist.size() <= 0) {//人間全滅判定
                		System.out.println("魔物たちは勝利した！");
                        break;
                    }
                	//残りがいれば人間リストから再選択
            		humanindex = new Random().nextInt(humanlist.size());
            		selecthuman = humanlist.get(humanindex);
            	}
            }
		}

	}
}
