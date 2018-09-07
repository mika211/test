public class Yatagarasu extends Monster implements Bird{

	public Yatagarasu(String name){
		super(name);
	}

	public Yatagarasu(){
		super("noname");
	}

	public void run(){
		 System.out.println("yatagarasuが走ったよ！");
	}

}
