public class Monster extends Life {

	private int power = 6;
	
	public Monster(String name, int hp, int power) {
		super(name, hp);
		setPower(power);
	}
	
	public Monster(String name) {
		super(name);
	}
	
	public Monster() {
		super();
	}

	public void attack(Life enemy) {
		System.out.println(String.format("%sの攻撃", super.getName()));
		enemy.recieveDamage(this.power);
	}
	
	private void setPower(int power) {
		if(power <= 0) {
			return;
		}
		this.power = power;
	}
	
}
