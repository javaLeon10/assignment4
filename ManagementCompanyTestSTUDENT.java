package JunitTesting;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	
	@Before
	public void setUp() throws Exception {
		//student create a management company
		
		//student add three properties, with plots, to mgmt co
		p1 = new Property ("House 1", "District 1", 4000, "John Smith",2,1,2,2);
		p2 = new Property ("House 2", "District 2", 4500, "Tim Smith",4,1,2,2);
		p3 = new Property ("House 3", "District 3", 5000, "Tom Smith",6,1,2,2);
		
		m= new ManagementCompany("Samson", "123456",10);
	 
		m.addProperty(p1);
		m.addProperty(p2);
		m.addProperty(p3);
	}

	@After
	public void tearDown() {
		//student set mgmt co to null  
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		fail("STUDENT test not implemented yet");
		//student should add property with 4 args & default plot (0,0,1,1)
		//student should add property with 8 args
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1	
	}
 
	@Test
	public void testMaxRentProp() {
		fail("STUDENT test not implemented yet");
		//student should test if maxRentProp contains the maximum rent of properties
		
	}

	@Test
	public void testTotalRent() {
		fail("STUDENT test not implemented yet");
		//student should test if totalRent returns the total rent of properties
	}

 }
