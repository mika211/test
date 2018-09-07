

public class Main {

	public static void main(String[] args) {
		Yatagarasu  iseki = new Yatagarasu("iseki");
		Yatagarasu  sakata = new Yatagarasu("sakata");

		Zombie  kanopi = new Zombie("yamagami");

		while(sakata.getHp() > 0){

			kanopi.attack(sakata);
		}
	}

}
