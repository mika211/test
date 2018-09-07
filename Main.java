

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Yatagarasu  iseki = new Yatagarasu("iseki");
		Yatagarasu  sakata = new Yatagarasu("sakata");

		Zombie  kanopi = new Zombie("yamagami");

		for(sakata.getHp() > 0){

			kanopi.attack(sakata);
		}
	}

}
