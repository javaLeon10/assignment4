package JunitTesting;

public class ManagementCompany extends java.lang.Object {

	private int MAX_PROPERTY = 5;
	private double mgmFeePer;
	private String name;
	//private Property [] properties;
	private String taxID;
	private int MGMT_WIDTH = 10;
	private int MGMT_DEPTH = 10;
	private Plot plot;
	
	Property [] properties = new Property[10];
	private int counter_properties = 0;
	
	public ManagementCompany() {
		Plot plot = new Plot(0,0,10,10);
		Property prop = new Property();
		properties[counter_properties] = prop;
	counter_properties++;			
	}
	
	public ManagementCompany (String name, String taxID, double mgmFee) {
		Plot plot = new Plot(0,0,10,10);
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		Property prop= new Property();
		properties[counter_properties] = prop;
		counter_properties++;
	}
	
	public ManagementCompany (String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
	
		Plot plot = new Plot(x,y,width,depth);
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		Property prop = new Property();
		properties[counter_properties] = prop;
	counter_properties++;
	}
	
	public ManagementCompany (ManagementCompany otherCompany) {
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFeePer = otherCompany.mgmFeePer;
		
		counter_properties++;
	}
	
	public int addProperty (Property prop) {
		properties[counter_properties++] = prop;
		//properties[counter_properties++] = prop;
		return counter_properties;
	}
	
	public int addProperty(String name,String city,double rent,String owner) {
		Property prop = new Property(name,city,rent,owner);
		properties[counter_properties++] = prop;
		return counter_properties;
	}
	
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		
		int retvalue = counter_properties;
		
		Property prop = new Property(name,city,rent,owner,x,y,width,depth);
		properties[counter_properties] = prop;
		Plot plt = new Plot(x,y,width,depth);
		
		for (int i=0; i < counter_properties; i++) {
			Plot pl1 = new Plot(properties[i].x,properties[i].y,properties[i].width,properties[i].depth);
	
			if (plt.encompasses(pl1) ) retvalue = -3;
			if (plt.overlaps(pl1)) retvalue = -4;
		}
		 
		if (prop == null) retvalue = -2;
		
		/* 
		 * return -1 if the array is full ,
-2 if the Property object is null
-3 if if management company does not encompass the property plot
-4 if property plot overlaps ANY of properties in array
otherwise return the index of the array where the property was added.
		*/
		//return counter_properties;
		
		
		if (counter_properties >= 5) {
			retvalue = -1;
		} 
		
		return retvalue;
		
	}
	
	public String 	displayPropertyAtIndex(int i) {
		return properties[i].toString();
	}
	
	public double maxRentProp() {
		
	double maxrent = 0.0;
		for (int i=0; i < 5; i++) {
		if (maxrent < properties[i].getRentAmount()) maxrent = properties[i].getRentAmount();
	}
	return maxrent;
	
}
	
	 public int maxRentPropertyIndex() {
		 double maxrent = 0.0;
		 int indmax = 0;
			for (int i=0; i < 5; i++) {
			if (maxrent < properties[i].getRentAmount()) { 
				maxrent = properties[i].getRentAmount();
				indmax = i;
			}
		}
			
		return indmax; 
	 }
	
	public double	totalRent() {
		 double sum1 = 0.0;
		 for (int i=0; i < 5; i++) {
				sum1 += properties[i].getRentAmount();
		 }
		 return sum1;
	 }
	 
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}
	
	public String getName() {
		return name;
	}
	
	public Plot getPlot() {
		return plot;
	}
	
	
	 public String toString( ) {
		 String Bigstring = "";
		 for (int i=0; i < 5; i++) {
				Bigstring += properties[i].toString() +"\n";
		 }	 
		return Bigstring; 
		 
	 }
	
	
	
}
