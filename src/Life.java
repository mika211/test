abstract class Life {

	private String name;
	
	private int hp;
	
	public void dead(){
		System.out.println("("+ this.getName() + "は死んだ。)");
	
	} 
	
	public void receiveDamage(int damage){
		if(damage <= 0){
			System.out.println("攻撃は無効です。");
		}else{
			if(this.getHp() <= damage){
				this.setHp(0);
				this.dead();
			}else{
				System.out.println(this.getName() + "に" + damage + "のダメージ"); 
				this.setHp(this.getHp() - damage);
			}
		}
	}
	
	public Life(String name,int hp){
		this.name = name;
		this.hp = hp;
	}
	
	public Life(String name){
		this.name = name;
		this.hp = 15;
	}
	
	public Life(){
		this.name = "noname";
		this.hp = 15;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getHp(){
		return this.hp;
	}
	
	public void setHp(int hp){
		this.hp = hp;
	}
}



