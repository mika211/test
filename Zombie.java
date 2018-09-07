public class Zombie extends Monster implements Human {
  private int hp;
  public int getHp() { return this.hp; }
  public void setHp(int hp) { this.hp = hp; }
  @Override
  public void run() {
    System.out.println("ゾンビは走った！");
  }
}