/**
 * @author gongonkun
 */
public class Zombie extends Monster implements Human {
  private int hp;
  private String name;
  public int getName() { return this.name; }
  public void setName(String name) { this.name = name; }
  public int getHp() { return this.hp; }
  public void setHp(int hp) { this.hp = hp; }
  
  public Zombie() { this.Zombie("NoName"); }
  public Zombie(String name) {
    this.name = name;
  }
  @Override
  public void run() {
    System.out.println("ゾンビは走った！");
  }
}