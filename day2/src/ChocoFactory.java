
public class ChocoFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Choclate munch = new Choclate("munch",20.00,150,"cover");
		Choclate kitkat=new Choclate("kitkat",10.00,120,"coverbox");
		Choclate dairymilk=new Choclate("dairymilk",150.00,120,"rapper");
		Choclate aasha=new Choclate("aasha",1.00,20,"cover");
		Choclate milkybar=new Choclate("milkybar",10.00,100,"cover");
		Choclate snickers=new Choclate("snickers",20.00,120,"rapper");
		Choclate lindberg=new Choclate("lindberg",300.00,200,"paperbox");
		Choclate fivestar=new Choclate("fivesatr",10.00,50,"fivestar");
		Choclate belgiumbardark=new Choclate("belgiumbardark",275.00,200,"paperbox");
		Choclate kopiko=new Choclate("kopiko",1.00,10,"cover");

	System.out.println(munch);
	System.out.println(kitkat);
	System.out.println(dairymilk);
	System.out.println(aasha);
	System.out.println(milkybar);
	System.out.println(snickers);
	System.out.println(lindberg);
	System.out.println(fivestar);
	
	if(munch instanceof Choclate && fivestar instanceof Choclate)
	{
		boolean m=munch==fivestar;
		System.out.println(m);
	}
	Choclate c=munch;
	boolean m=c==munch;
	System.out.println(m);
	
	System.out.println(munch.hashCode());
	System.out.println(c.hashCode());
	
	}
}
