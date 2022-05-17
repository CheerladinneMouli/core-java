
public class CostliestChocoArray {

	public static void main(String[] args) {
	    ArrayofChoco kitkat=new ArrayofChoco("kitkat",150,10.00);
		ArrayofChoco dairymilk=new ArrayofChoco("dairymilk",120,150.00);
		ArrayofChoco aasha=new ArrayofChoco("aasha",20,1);
		ArrayofChoco milkybar=new ArrayofChoco("milkybar",100,10.00);
		ArrayofChoco snickers=new ArrayofChoco("snickers",120,20.00);
		ArrayofChoco lindberg=new ArrayofChoco("lindberg",200,300.00);
		ArrayofChoco fivestar=new ArrayofChoco("fivesatr",50,10.00);
		ArrayofChoco belgiumbardark=new ArrayofChoco("belgiumbardark",200,275.00);
		ArrayofChoco ch[]=new ArrayofChoco[8];
		int var=0;
		int choco=0;
		ch[0]=kitkat;
		ch[1]=dairymilk;
		ch[2]=aasha;
		ch[3]=milkybar;
		ch[4]=snickers;
		ch[5]=lindberg;
		ch[6]=fivestar;
		ch[7]=belgiumbardark;
		
		double maxcost=ch[0].cost;
		double minweight=ch[0].getWeight();
		for(int i=1;i<ch.length;i++)
		{
			if(ch[i].cost>maxcost) {
			  maxcost = ch[i].cost;
			  var=i;
			}
		}
	System.out.println("The costliest chocolate is "+ch[var].getChoclatename() +" and its cost   "+maxcost);
	for(int i=1;i<ch.length;i++)
	{
		if(ch[i].getWeight()<minweight)
		{
			minweight=ch[i].getWeight();
			choco=i;
		}
	}
	System.out.println("The chocolate with less weight is "+ch[choco].getChoclatename()+" and its weight  "+minweight);
	
	
	
	
}

}
		
				

