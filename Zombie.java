/**
 * @author gongonkun
 */
public class Zombie extends Monster implements Human {
  private int hp;
  public int getHp() { return this.hp; }
  public void setHp(int hp) { this.hp = hp; }
  
  @Override
  public void run() {
    System.out.println("ゾンビは走った！");
  }
  
  @Override
  public void attack() {
    System.out.println("ゾンビは攻撃した！");
  }
  
  @Override
  public void dead() {
    System.out.println("ゾンビは倒れた！");
  }
}