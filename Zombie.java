/**
 * @author gongonkun
 */
public class Zombie extends Monster implements Human {  
  public Zombie() { this.Zombie("NoName"); }
  public Zombie(String name) {
    super(name);
  }
  @Override
  public void run() {
    System.out.println("ゾンビは走った！");
  }
}