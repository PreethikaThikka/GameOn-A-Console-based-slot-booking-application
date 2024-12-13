import java.util.*;
import java.time.LocalDate;
interface Ground 
{
	static final String def = "\u001b[0;1m";
    static final String blink = "\u001b[5m";
    static final String red =  "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
   	static final String purpe = "\u001b[35;1m";
   	static final String skblue = "\u001b[36;1m";
    static final String bgred =  "\u001b[101;1m";
    static final String bggreen = "\u001b[102;1m";
    static final String bgyellow = "\u001b[103;1m";
    static final String bgblue = "\u001b[104;1m";
    static final String bgpurpe = "\u001b[105;1m";
    static final String bgskblue = "\u001b[106;1m";
	void selectNearestLocation();
	void showAvailableGrounds();
    void showGroundDetailsKphb(int groundChoice);
	void showGroundDetailsMiyapur(int groundChoice); 
	void showGroundDetailsHitechcity(int groundChoice);
	void showGroundDetailsDilshuknagar(int groundChoice);
}
class Badminton implements Ground 
{
    Scanner sc = new Scanner(System.in);
	Slot slot=new Slot();
	static Badminton bt=new Badminton();
	static int selectlocation;
	public void selectNearestLocation()
	{
		System.out.println(red);
		System.out.println("Select Your Nearest Location");
		System.out.println(skblue);
		System.out.println("1. Kphb");
		System.out.println("2. Miyapur");
		System.out.println("3. Hi-Tech city");
		System.out.println("4. Dilshuknagar");
		System.out.println(def);
		while(true) 
		{
      			System.out.println("Select your Location:");
			selectlocation=sc.nextInt();
                       	if(selectlocation>=1&&selectlocation<=4)
			{
				showAvailableGrounds();
                		break;
	            	} 
			else 
			{
               	System.out.println("Invalid Location choice. Please enter a number between 1 & 4");
			}
        }
	}
	public void showAvailableGrounds() 
	{
		int groundChoice = 0;
		switch(selectlocation)
		{
			case 1:
				System.out.println(yellow);
				System.out.println("----------------------------------------------");
				System.out.println(def);
				System.out.println("    Available Badminton Grounds at Kphb:");
        			System.out.println("    1. Raj Grounds");
				System.out.println("    2. Laxmi Sports Academy");
				System.out.println(yellow);
				System.out.println("----------------------------------------------");
        			while(true) 
				{
							System.out.println(def);
            				System.out.println("Select your preferred ground:");
            				groundChoice = sc.nextInt();
                       			if(groundChoice>=1 & groundChoice<=2)
					{
						showGroundDetailsKphb(groundChoice);
                				break;
	            			} 
					else 
					{
						System.out.println(def);
                				System.out.println("Invalid ground choice.");
					}
            			}
				break;
			case 2:
				System.out.println(yellow);
				System.out.println("------------------------------------------------");
				System.out.println(def);
				System.out.println("    Available Badminton Grounds at Miyapur:");
				System.out.println("    1. Shiva Sports");
				System.out.println("    2. HIFI Sports Ground");
				System.out.println(yellow);
				System.out.println("------------------------------------------------");
				System.out.println(def);
				while(true) 
				{
            				System.out.println("Select your preferred ground:");
            				groundChoice = sc.nextInt();
                       			if(groundChoice>=1 && groundChoice<=2) 
					{
						showGroundDetailsMiyapur(groundChoice);
                				break;
	            			} 
					else 
					{
                				System.out.println("Invalid ground choice.");
					}
            			}

				break;
			case 3:
				System.out.println(yellow);
				System.out.println("------------------------------------------------"+def);
				System.out.println("   Available Badminton Grounds at Hi-Tech city:");
				System.out.println("   1. Hari Sports Ground");
				System.out.println("   2. Rajadhani Sports");
				System.out.println(yellow+"------------------------------------------------"+def);
				System.out.println();
				while(true) 
				{
            				System.out.println("Select your preferred ground:");
            				groundChoice=sc.nextInt();
                       			if(groundChoice>=1 && groundChoice <= 2)
					{
						showGroundDetailsHitechcity(groundChoice);
                				break;
	            			} 
					else 
					{
                				System.out.println("Invalid ground choice.");
					}
            			}

				break;
			case 4:
				System.out.println(yellow);
				System.out.println("------------------------------------------------");
				System.out.println(def);
				System.out.println("   Available Badminton Grounds at Dilshuknagar:");
				System.out.println("   1. Vishnu Playground");
				System.out.println("   2. Maya Sports Ground");
				System.out.println(yellow);
				System.out.println("------------------------------------------------");
				System.out.println(def);
				while(true) 
				{
            				System.out.println("Select your preferred ground:");
            				groundChoice = sc.nextInt();
                       			if (groundChoice >= 1 && groundChoice <= 2)
					{
						showGroundDetailsDilshuknagar(groundChoice);
                				break;
	            			} 
					else 
					{
                				System.out.println("Invalid ground choice.");
					}
            			}
				break;
		}
    	}
    	public void showGroundDetailsKphb(int groundChoice) 
	{
        	switch(groundChoice) 
		{
            		case 1:
					{
						System.out.println(yellow);
						
						System.out.println("------------------------------------------------");
						System.out.println(def);
						//System.out.println(red);
                		System.out.println(yellow+"-"+red+"  * * * Welcome to Raj Badminton Academy * * *"+yellow+"-");
                		System.out.println(yellow+"-       Location: CMS Jain College, KPHB       -");
                		System.out.println("-          Court Size: 13.4m x 6.1m            -");
                		System.out.println("- Facilities: Parking,Drinking Water, First Aid-");
						System.out.println("-          Cost per hour : Rs. 500             -");
						System.out.println(yellow);
						
						System.out.println("------------------------------------------------");
						System.out.println(def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
                		else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								bt.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							bt.showAvailableGrounds();
						}
						break;
					}
					case 2:
					{
						System.out.println(yellow);
						System.out.println("---------------------------------------------------");
						//System.out.println(red);
						System.out.println(yellow+"-"+red+"   * * * Welcome to Laxmi Sports Academy * * *   "+yellow+"-");
                		System.out.println("- Location: Beside Hanuman Temple, Road No.2, KPHB-");
                		System.out.println("-          Court Size: 13.4m x 6.1m               -");
                		System.out.println("-  Facilities: Parking, Drinking Water, First Aid -");
						System.out.println("-          Cost per hour : Rs. 500                -");
						System.out.println(yellow);
						
						System.out.println("---------------------------------------------------");
						System.out.println(def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
                		else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								bt.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							bt.showAvailableGrounds();
						}
						break;
					}
		}
	}
	public void showGroundDetailsMiyapur(int groundChoice) 
	{
        	switch(groundChoice) 
		{
            		case 1:
					{
						System.out.println(yellow);
						System.out.println("------------------------------------------------");
                		System.out.println(yellow+"-"+red+"      * * * Welcome to Shiva Sports * * *     "+yellow+"-");
                		System.out.println("-     Location: Near Metro Station, Miyapur    -");
                		System.out.println("-           Court Size: 13.4m x 6.1m           -");
                		System.out.println("-   Facilities: Parking, Restrooms, Cafeteria  -");
						System.out.println("-           Cost per hour : Rs. 500            -");
						System.out.println(yellow);
						System.out.println("------------------------------------------------");
						System.out.println(def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
                		else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								bt.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							bt.showAvailableGrounds();
						}
						break;
					}
					case 2:
					{
						System.out.println(yellow+"------------------------------------------------");
						System.out.println(yellow+"-"+red+"   * * * Welcome to HIFI Sports Ground* * *   "+yellow+"-");
                		System.out.println("-  Location: Beside Chaitanya College, Miyapur -");
                		System.out.println("-          Court Size: 13.4m x 6.1m            -");
                		System.out.println("- Facilities: Parking,Drinking Water, First Aid-");
						System.out.println("-          Cost per hour : Rs. 500             -");
						System.out.println("------------------------------------------------");
						System.out.println(def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
                		else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								bt.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							bt.showAvailableGrounds();
						}
						break;
					}
		}
	}
	public void showGroundDetailsHitechcity(int groundChoice) 
	{
        	switch(groundChoice) 
		{
            		case 1:
					{
						System.out.println(yellow+"------------------------------------------------");
                		System.out.println("-"+red+"   * * * Welcome to Hari Sports Ground * * *  "+yellow+"-");
                		System.out.println("-          Location: Beside AMB Mall           -");
                		System.out.println("-   Facilities: Parking, Restrooms, First Aid  -");
						System.out.println("-           Cost per hour : Rs. 500            -");
						System.out.println("------------------------------------------------");
						System.out.println(def);
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
						else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								bt.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							bt.showAvailableGrounds();
						}
						break;
					}
					case 2:
					{
						System.out.println(yellow+"------------------------------------------------");
                		System.out.println("-"+red+"    * * * Welcome to Rajadhani Sports * * *   "+yellow+"-");
                		System.out.println("-       Location: 400mts from Cyber Towers     -");
                		System.out.println("-  Facilities: Parking, Restrooms, First Aid   -");
						System.out.println("-           Cost per hour : Rs. 500            -");
						System.out.println("------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
						else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								bt.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							bt.showAvailableGrounds();
						}
						break;
					}
                	
		}
	}
	public void showGroundDetailsDilshuknagar(int groundChoice) 
	{
        	switch(groundChoice) 
		{
            		case 1:
					{
						System.out.println(yellow+"------------------------------------------------");
                		System.out.println("-"+red+"   * * * Welcome to Vishnu Playground * * *   "+yellow+"-");
                		System.out.println("-     Location: Vishnu Colony, Dilshuknagar    -");
                		System.out.println("-   Facilities: Parking, Restrooms, First Aid  -");
						System.out.println("-           Cost per hour : Rs. 500            -");
						System.out.println("------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
						else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								bt.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							bt.showAvailableGrounds();
						}
						break;
					}
					case 2:
					{
						System.out.println(yellow+"--------------------------------------------------");
                		System.out.println("-"+red+"    * * * Welcome to Maya Sports Ground * * *   "+yellow+"-");
                		System.out.println("- Location: Beside Manish Textiles , Dilshuknagar-");
                		System.out.println("-    Facilities: Parking, Restrooms, First Aid   -");
						System.out.println("-           Cost per hour : Rs. 500              -");
						System.out.println("--------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
						else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								bt.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							bt.showAvailableGrounds();
						}
						break;
					}
                	
       		}
    	}
}
class Cricket implements Ground 
{
    	Scanner sc = new Scanner(System.in);
		Slot slot=new Slot();
		static Cricket ck=new Cricket();
	static int selectlocation;
	public void selectNearestLocation()	
	{
		System.out.println(red+"Select Your Nearest Location");
		System.out.println(skblue+"1. Kphb");
		System.out.println("2. Miyapur");
		System.out.println("3. Hi-Tech city");
		System.out.println("4. Dilshuknagar");
		System.out.println(def);
		while(true) 
		{
      			System.out.println("Select your Location:");
			selectlocation=sc.nextInt();
               if(selectlocation>=1&&selectlocation<=4)
			{
				showAvailableGrounds();
                		break;
	            	} 
			else 
			{
               			System.out.println("Invalid Location choice. Please enter a number between 1 & 4");
			}
            	}
	}
	public void showAvailableGrounds() 
	{
		int groundChoice = 0;
		switch(selectlocation)
		{
			case 1:
					System.out.println(yellow+"------------------------------------------------"+def);
					System.out.println("     Available Cricket Grounds at Kphb:");
        			System.out.println("     1. Raj Grounds");
					System.out.println("     2.Laxmi Sports Academy");
					System.out.println(yellow+"------------------------------------------------"+def);
        			while(true) 
				{
            				System.out.println("Select your preferred ground:");
            				groundChoice = sc.nextInt();
                       			if(groundChoice>=1 && groundChoice<=2)
					{
						showGroundDetailsKphb(groundChoice);
                				break;
	            			} 
					else 
					{
                				System.out.println("Invalid ground choice.");
					}
            			}
				break;
			case 2:
				System.out.println(yellow+"------------------------------------------------"+def);
				System.out.println("    Available Cricket Grounds at Miyapur:");
				System.out.println("    1. Shiva Sports");
				System.out.println("    2. HIFI Sports");
				System.out.println(yellow+"------------------------------------------------"+def);
				while(true) 
				{
            				System.out.println("Select your preferred ground:");
            				groundChoice = sc.nextInt();
                       			if(groundChoice>=1 && groundChoice<=2)
					{
						showGroundDetailsMiyapur(groundChoice);
                				break;
	            			} 
					else 
					{
                				System.out.println("Invalid ground choice.");
					}
            			}

				break;
			case 3:
				System.out.println(yellow+"------------------------------------------------"+def);
				System.out.println("    Available Cricket Grounds at Hi-Tech city:");
				System.out.println("    1. Hari Sports Ground");
				System.out.println("    2. Rajadhani Sports");
				System.out.println(yellow+"------------------------------------------------"+def);
				while(true) 
				{
            				System.out.println("Select your preferred ground:");
            				groundChoice=sc.nextInt();
                       			if(groundChoice>=1 && groundChoice <=2)
					{
						showGroundDetailsHitechcity(groundChoice);
                				break;
	            			} 
					else 
					{
                				System.out.println("Invalid ground choice.");
					}
            			}

				break;
			case 4:
				System.out.println(yellow+"------------------------------------------------"+def);
				System.out.println("   Available Cricket Grounds at Dilshuknagar:");
				System.out.println("   1. Vishnu Playground");
				System.out.println("   2. Maya Sports Ground");
				System.out.println(yellow+"------------------------------------------------"+def);
				while(true) 
				{
            				System.out.println("Select your preferred ground:");
            				groundChoice = sc.nextInt();
                       			if (groundChoice >= 1 && groundChoice <= 2)
					{
						showGroundDetailsDilshuknagar(groundChoice);
                				break;
	            			} 
					else 
					{
                				System.out.println("Invalid ground choice.");
					}
            			}
				break;
		}
    	}
    	public void showGroundDetailsKphb(int groundChoice) 
	{
        	switch(groundChoice) 
		{
            		case 1:
					{
						System.out.println(yellow+"------------------------------------------------");
                		System.out.println("-"+red+" * * * Welcome to Raj Badminton Academy * * * "+yellow+"-");
                		System.out.println("-       Location: CMS Jain College, KPHB       -");
                		System.out.println("-          Court Size: 13.4m x 6.1m            -");
                		System.out.println("- Facilities: Parking,Drinking Water, First Aid-");
						System.out.println("-          Cost per hour : Rs. 500             -");
						System.out.println("------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
                		else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								ck.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							ck.showAvailableGrounds();
						}
						break;
					}
					case 2:
					{
						System.out.println(yellow+"----------------------------------------------------");
						System.out.println("-"+red+"    * * * Welcome to Laxmi Sports Academy * * *   "+yellow+"-");
                		System.out.println("- Location: Beside Hanuman Temple, Road No.2, KPHB -");
                		System.out.println("-            Court Size: 13.4m x 6.1m              -");
                		System.out.println("-   Facilities: Parking,Drinking Water, First Aid  -");
						System.out.println("-            Cost per hour : Rs. 500               -");
						System.out.println("----------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
                		else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								ck.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							ck.showAvailableGrounds();
						}
						break;
					}
		}
	}
	public void showGroundDetailsMiyapur(int groundChoice) 
	{
        switch(groundChoice) 
		{
            	case 1:
					{
						System.out.println(yellow+"------------------------------------------------");
                		System.out.println("-"+red+"     * * * Welcome to Shiva Sports * * *      "+yellow+"-");
                		System.out.println("-     Location: Near Metro Station, Miyapur    -");
                		System.out.println("-           Court Size: 13.4m x 6.1m           -");
                		System.out.println("-   Facilities: Parking, Restrooms, Cafeteria  -");
						System.out.println("-           Cost per hour : Rs. 500            -");
						System.out.println("------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
                		else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								ck.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							ck.showAvailableGrounds();
						}
						break;
					}
					case 2:
					{
						System.out.println(yellow+"------------------------------------------------");
						System.out.println("-"+red+"   * * * Welcome to HIFI Sports Ground* * *   "+yellow+"-");
                		System.out.println("-  Location: Beside Chaitanya College, Miyapur -");
                		System.out.println("-           Court Size: 13.4m x 6.1m           -");
                		System.out.println("- Facilities: Parking,Drinking Water, First Aid-");
						System.out.println("-           Cost per hour : Rs. 500            -");
						System.out.println("------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
                		else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								ck.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							ck.showAvailableGrounds();
						}
						break;
					}
		}
	}
	public void showGroundDetailsHitechcity(int groundChoice) 
	{
        	switch(groundChoice) 
		{
            	case 1:
					{
						System.out.println(yellow+"------------------------------------------------");
                		System.out.println("-"+red+"   * * * Welcome to Hari Sports Ground * * *  "+yellow+"-");
                		System.out.println("-           Location: Beside AMB Mall          -");
                		System.out.println("-  Facilities: Parking, Restrooms, First Aid   -");
						System.out.println("-           Cost per hour : Rs. 500            -");
						System.out.println("------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
						else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								ck.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							ck.showAvailableGrounds();
						}
						break;
					}
					case 2:
					{
						System.out.println(yellow+"------------------------------------------------");
                		System.out.println("-"+red+"   * * * Welcome to Rajadhani Sports * * *    "+yellow+"-");
                		System.out.println("-       Location: 400mts from Cyber Towers     -");
                		System.out.println("-   Facilities: Parking, Restrooms, First Aid  -");
						System.out.println("-          Cost per hour : Rs. 500             -");
						System.out.println("------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
						else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								ck.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							ck.showAvailableGrounds();
						}
						break;
					}
		}
	}
	public void showGroundDetailsDilshuknagar(int groundChoice) 
	{
        	switch(groundChoice) 
		{
            		case 1:
					{
						System.out.println(yellow+"------------------------------------------------");
                		System.out.println("-"+red+"   * * * Welcome to Vishnu Playground * * *   "+yellow+"-");
                		System.out.println("-     Location: Vishnu Colony, Dilshuknagar    -");
                		System.out.println("-  Facilities: Parking, Restrooms, First Aid   -");
						System.out.println("-          Cost per hour : Rs. 500             -");
						System.out.println("------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
						else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								ck.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							ck.showAvailableGrounds();
						}
						break;
					}
					case 2:
					{
						System.out.println(yellow+"---------------------------------------------------");
                		System.out.println("-"+red+"    * * * Welcome to Maya Sports Ground * * *    "+yellow+"-");
                		System.out.println("- Location: Beside Manish Textiles , Dilshuknagar -");
                		System.out.println("-    Facilities: Parking, Restrooms, First Aid    -");
						System.out.println("-            Cost per hour : Rs. 500              -");
						System.out.println("---------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
						else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								ck.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							ck.showAvailableGrounds();
						}
						break;
					}
                	
       	}
    }
}
class Volleyball implements Ground 
{
    	Scanner sc = new Scanner(System.in);
		Slot slot=new Slot();
		static Volleyball vb=new Volleyball();
	static int selectlocation;
	public void selectNearestLocation()
	{
		
		System.out.println(red+"Select Your Nearest Location");
		System.out.println(skblue+"1. Kphb");
		System.out.println("2. Miyapur");
		System.out.println("3. Hi-Tech city");
		System.out.println("4. Dilshuknagar");
		System.out.println(def);
		while(true) 
		{
      			System.out.println("Select your Location:");
			selectlocation=sc.nextInt();
                       	if(selectlocation>=1&&selectlocation<=4)
			{
				showAvailableGrounds();
                		break;
	            	} 
			else 
			{
               			System.out.println("Invalid Location choice. Please enter a number between 1 & 4");
			}
            	}
	}
	public void showAvailableGrounds() 
	{
		int groundChoice = 0;
		switch(selectlocation)
		{
			case 1:
					System.out.println(yellow+"------------------------------------------------"+def);
					System.out.println("     Available VolleyBall Grounds at Kphb:");
        			System.out.println("     1. Raj Grounds");
					System.out.println("     2. laxmi Sports Academy");
					System.out.println(yellow+"------------------------------------------------"+def);
        			while(true) 
				{
            				System.out.println("Select your preferred ground:");
            				groundChoice = sc.nextInt();
                       			if(groundChoice>=1 && groundChoice<=2)
					{
						showGroundDetailsKphb(groundChoice);
                				break;
	            			} 
					else 
					{
                				System.out.println("Invalid ground choice.");
					}
            			}
				break;
			case 2:
				System.out.println(yellow+"------------------------------------------------"+def);
				System.out.println("    Available VolleyBall Grounds at Miyapur:");
				System.out.println("    1. Shiva Sports");
				System.out.println("    2. HIFI Sports Ground");
				System.out.println(yellow+"------------------------------------------------"+def);
				while(true) 
				{
            				System.out.println("Select your preferred ground:");
            				groundChoice = sc.nextInt();
                       			if(groundChoice>=1 && groundChoice<=2)
					{
						showGroundDetailsMiyapur(groundChoice);
                				break;
	            			} 
					else 
					{
                				System.out.println("Invalid ground choice.");
					}
            			}

				break;
			case 3:
				System.out.println(yellow+"------------------------------------------------"+def);
				System.out.println("  Available VolleyBall Grounds at Hi-Tech city:");
				System.out.println("  1. Hari Sports Ground");
				System.out.println("  2. rajadhani Sports");
				System.out.println(yellow+"------------------------------------------------"+def);
				while(true) 
				{
            				System.out.println("Select your preferred ground:");
            				groundChoice=sc.nextInt();
                       			if(groundChoice>=1 && groundChoice <= 2)
					{
						showGroundDetailsHitechcity(groundChoice);
                				break;
	            			} 
					else 
					{
                				System.out.println("Invalid ground choice. Please enter number 1.");
					}
            			}

				break;
			case 4:
				System.out.println(yellow+"------------------------------------------------"+def);
				System.out.println("  Available VolleyBall Grounds at Dilshuknagar: ");
				System.out.println("  1. Vishnu Playground");
				System.out.println("  2. Maya Sports Ground");
				System.out.println(yellow+"------------------------------------------------"+def);
				while(true) 
				{
            				System.out.println("Select your preferred ground:");
            				groundChoice = sc.nextInt();
                       			if (groundChoice >= 1 && groundChoice <= 2)
					{
						showGroundDetailsDilshuknagar(groundChoice);
                				break;
	            			} 
					else 
					{
                				System.out.println("Invalid ground choice.");
					}
            			}
				break;
		}
    	}
    	public void showGroundDetailsKphb(int groundChoice) 
	{
        	switch(groundChoice) 
		{
            	case 1:
					{
						System.out.println(yellow+"------------------------------------------------");
                		System.out.println("-"+red+" * * * Welcome to Raj Badminton Academy * * * "+yellow+"-");
                		System.out.println("-       Location: CMS Jain College, KPHB       -");
                		System.out.println("-           Court Size: 13.4m x 6.1m           -");
                		System.out.println("-       Facilities: Parking, First Aid         -");
						System.out.println("-           Cost per hour : Rs. 500            -");
						System.out.println("------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
                		else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								vb.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							vb.showAvailableGrounds();
						}
						break;
					}
					case 2:
					{
						System.out.println(yellow+"----------------------------------------------------");
						System.out.println("-"+red+"    * * * Welcome to Laxmi Sports Academy * * *   "+yellow+"-");
                		System.out.println("- Location: Beside Hanuman Temple, Road No.2, KPHB -");
                		System.out.println("-            Court Size: 13.4m x 6.1m              -");
                		System.out.println("-    Facilities: Parking, Cafeteria, First Aid     -");
						System.out.println("-            Cost per hour : Rs. 500               -");
						System.out.println("----------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
                		else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								vb.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							vb.showAvailableGrounds();
						}
						break;
					}
		}
	}
	public void showGroundDetailsMiyapur(int groundChoice) 
	{
        	switch(groundChoice) 
		{
				case 1:
					{
						System.out.println(yellow+"------------------------------------------------");
						System.out.println("-"+red+"      * * * Welcome to Shiva Sports * * *     "+yellow+"-");
                		System.out.println("-     Location: Near Metro Station, Miyapur    -");
                		System.out.println("-        Court Size: 13.4m x 6.1m              -");
                		System.out.println("-   Facilities: Parking, Restrooms, Cafeteria  -");
						System.out.println("-         Cost per hour : Rs. 500              -");
						System.out.println("------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
                		else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								vb.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							vb.showAvailableGrounds();
						}
						break;
					}
					case 2:
					{
						System.out.println(yellow+"------------------------------------------------");
						System.out.println("-"+red+"   * * * Welcome to HIFI Sports Ground* * *   "+yellow+"-");
                		System.out.println("-  Location: Beside Chaitanya College, Miyapur -");
                		System.out.println("-           Court Size: 13.4m x 6.1m           -");
                		System.out.println("-         Facilities: Parking, First Aid       -");
						System.out.println("-           Cost per hour : Rs. 500            -");
						System.out.println(yellow+"------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
                		else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								vb.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							vb.showAvailableGrounds();
						}
						break;
					}
		}
	}
	public void showGroundDetailsHitechcity(int groundChoice) 
	{
        	switch(groundChoice) 
		{
            	case 1:
					{
						System.out.println(yellow+"------------------------------------------------");
                		System.out.println("-"+red+"   * * * Welcome to Hari Sports Ground * * *  "+yellow+"-");
                		System.out.println("-          Location: Beside AMB Mall           -");
                		System.out.println("-   Facilities: Parking, Restrooms, First Aid  -");
						System.out.println("-          Cost per hour : Rs. 500             -");
						System.out.println(yellow+"------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
						else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								vb.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							vb.showAvailableGrounds();
						}
						break;
					}
					case 2:
					{
						System.out.println(yellow+"------------------------------------------------");
                		System.out.println("-"+red+"    * * * Welcome to Rajadhani Sports * * *   "+yellow+"-");
                		System.out.println("-      Location: 400mts from Cyber Towers      -");
                		System.out.println("-   Facilities: Parking, Restrooms, First Aid  -");
						System.out.println("-           Cost per hour : Rs. 500            -");
						System.out.println(yellow+"------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
						else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								vb.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							vb.showAvailableGrounds();
						}
						break;
					}
		}
	}
	public void showGroundDetailsDilshuknagar(int groundChoice) 
	{
        	switch(groundChoice) 
		{
            	case 1:
					{
						System.out.println(yellow+"------------------------------------------------");
                		System.out.println("-"+red+"   * * * Welcome to Hari Sports Ground * * *  "+yellow+"-");
                		System.out.println("-           Location: Beside AMB Mall          -");
                		System.out.println("-   Facilities: Parking, Restrooms, First Aid  -");
						System.out.println("-           Cost per hour : Rs. 500            -");
						System.out.println(yellow+"------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
						else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								vb.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							vb.showAvailableGrounds();
						}
						break;
					}
					case 2:
					{
						System.out.println(yellow+"------------------------------------------------");
                		System.out.println("-"+red+"   * * * Welcome to Rajadhani Sports * * *    "+yellow+"-");
                		System.out.println("-      Location: 400mts from Cyber Towers      -");
                		System.out.println("-   Facilities: Parking, Restrooms, First Aid  -");
						System.out.println("-          Cost per hour : Rs. 500             -");
						System.out.println(yellow+"------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
						else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								vb.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							vb.showAvailableGrounds();
						}
						break;
					}
                	
		}
	}
}
class Football implements Ground 
{
    Scanner sc = new Scanner(System.in);
	Slot slot=new Slot();
	static Football fb=new Football();
	static int selectlocation;
	public void selectNearestLocation()
	{
		System.out.println(red+"Select Your Nearest Location");
		System.out.println(skblue+"1. Kphb");
		System.out.println("2. Miyapur");
		System.out.println("3. Hi-Tech city");
		System.out.println("4. Dilshuknagar"+def);
		System.out.println();
		
		while(true) 
		{
      			System.out.println("Select your preferred ground:");
			selectlocation=sc.nextInt();
                       	if(selectlocation>=1&&selectlocation<=4)
			{
				showAvailableGrounds();
                		break;
	            	} 
			else 
			{
               			System.out.println("Invalid Location choice. Please enter a number between 1 & 4");
			}
            	}
	}
	public void showAvailableGrounds() 
	{
		int groundChoice = 0;
		switch(selectlocation)
		{
			case 1:
					System.out.println(yellow+"------------------------------------------------"+def);
					System.out.println("-      Available Football Grounds at Kphb:     -");
        			System.out.println("-      1. Raj Grounds                          -");
					System.out.println("-      2. Laxmi Sports Academy                 -");
					System.out.println(yellow+"------------------------------------------------"+def);
        			while(true) 
				{
            				System.out.println("Select your preferred ground:");
            				groundChoice = sc.nextInt();
                       			if(groundChoice>=1 && groundChoice<=2)
					{
						showGroundDetailsKphb(groundChoice);
                				break;
	            			} 
					else 
					{
                				System.out.println("Invalid ground choice.");
					}
            			}
				break;
			case 2:
			{
				System.out.println(yellow+"------------------------------------------------"+def);
				System.out.println("-     Available Football Grounds at Miyapur:   -");
				System.out.println("-     1. Shiva Sports                          -");
				System.out.println("-     2. HIFI Sports Ground                    -");
				System.out.println(yellow+"------------------------------------------------"+def);
				while(true) 
				{
            				System.out.println("Select your preferred ground:");
            				groundChoice = sc.nextInt();
                       			if(groundChoice>=1 && groundChoice<=2)
					{
						showGroundDetailsMiyapur(groundChoice);
                				break;
	            			} 
					else 
					{
                				System.out.println("Invalid ground choice. Please enter number 1.");
					}
            			}

				break;
			}
			case 3:
				System.out.println(yellow+"------------------------------------------------"+def);
				System.out.println("	Available Football Grounds at Hi-Tech city:");
				System.out.println("	1. Hari Sports Ground");
				System.out.println("	2. Rajadhani Sports Ground");
				System.out.println(yellow+"------------------------------------------------"+def);
				while(true) 
				{
            				System.out.println("Select your preferred ground:");
            				groundChoice=sc.nextInt();
                       			if(groundChoice>=1 && groundChoice <= 2)
					{
						showGroundDetailsHitechcity(groundChoice);
                				break;
	            			} 
					else 
					{
                				System.out.println("Invalid ground choice. Please enter number 1.");
					}
            			}

				break;
			case 4:
				System.out.println(yellow+"------------------------------------------------"+def);
				System.out.println("	Available Football Grounds at Dilshuknagar:");
				System.out.println("	1. Vishnu Playground");
				System.out.println("	2. Maya Sports Ground"); 
				System.out.println(yellow+"------------------------------------------------"+def);
				while(true) 
				{
            				System.out.println("Select your preferred ground:");
            				groundChoice = sc.nextInt();
                       			if (groundChoice >= 1 && groundChoice <= 2)
					{
						showGroundDetailsDilshuknagar(groundChoice);
                				break;
	            			} 
					else 
					{
                				System.out.println("Invalid ground choice. Please enter number 1.");
					}
            			}
				break;
		}
    }
    public void showGroundDetailsKphb(int groundChoice) 
	{
        	switch(groundChoice) 
		{
            	case 1:
					{
						System.out.println(yellow+"------------------------------------------------");
                		System.out.println("-"+red+" * * * Welcome to Raj Badminton Academy * * * "+yellow+"-");
                		System.out.println("-       Location: CMS Jain College, KPHB       -");
                		System.out.println("-           Court Size: 13.4m x 6.1m           -");
                		System.out.println("-   Facilities: Parking, Restrooms, First Aid  -");
						System.out.println("-          Cost per hour : Rs. 500             -");
						System.out.println("------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
						else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								fb.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							fb.showAvailableGrounds();
						}
						break;
					}
					case 2:
					{
						System.out.println(yellow+"----------------------------------------------------");
						System.out.println("-"+red+"    * * * Welcome to Laxmi Sports Academy * * *   "+yellow+"-");
                		System.out.println("- Location: Beside Hanuman Temple, Road No.2, KPHB -");
                		System.out.println("-           Court Size: 13.4m x 6.1m               -");
                		System.out.println("-    Facilities: Parking, Restrooms, First Aid     -");
						System.out.println("-           Cost per hour : Rs. 500                -");
						System.out.println("----------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
                		else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								fb.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							fb.showAvailableGrounds();
						}
						break;
					}
		}
	}
	public void showGroundDetailsMiyapur(int groundChoice) 
	{
        switch(groundChoice) 
		{
            	case 1:
					{
						System.out.println(yellow+"------------------------------------------------");
                		System.out.println("-"+red+"     * * * Welcome to Shiva Sports * * *      "+yellow+"-");
                		System.out.println("-    Location: Near Metro Station, Miyapur     -");
                		System.out.println("-          Court Size: 13.4m x 6.1m            -");
                		System.out.println("-  Facilities: Parking, Restrooms, Cafeteria   -");
						System.out.println("-          Cost per hour : Rs. 500             -");
						System.out.println("------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
                		else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								fb.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							fb.showAvailableGrounds();
						}
						break;
					}
					case 2:
					{
						System.out.println(yellow+"------------------------------------------------");
						System.out.println("-"+red+"   * * * Welcome to HIFI Sports Ground* * *   "+yellow+"-");
                		System.out.println("- Location: Beside Chaitanya College, Miyapur  -");
                		System.out.println("-        Court Size: 13.4m x 6.1m              -");
                		System.out.println("-  Facilities: Parking, Restrooms, First Aid   -");
						System.out.println("-          Cost per hour : Rs. 500             -");
						System.out.println("------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
                		else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								fb.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							fb.showAvailableGrounds();
						}
						break;
					}
		}
	}
	public void showGroundDetailsHitechcity(int groundChoice) 
	{
        switch(groundChoice) 
		{
            	case 1:
					{
						System.out.println(yellow+"------------------------------------------------");
                		System.out.println("-"+red+"   * * * Welcome to Hari Sports Ground * * *  "+yellow+"-");
                		System.out.println("-         Location: Beside AMB Mall            -");
                		System.out.println("-   Facilities: Parking, Restrooms, First Aid  -");
						System.out.println("-          Cost per hour : Rs. 500             -");
						System.out.println("------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
						else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								fb.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							fb.showAvailableGrounds();
						}
						break;
					}
					case 2:
					{
						System.out.println(yellow+"------------------------------------------------");
                		System.out.println("-"+red+"    * * * Welcome to Rajadhani Sports * * *   "+yellow+"-");
                		System.out.println("-      Location: 400mts from Cyber Towers      -");
                		System.out.println("-   Facilities: Parking, Restrooms, First Aid  -");
						System.out.println("-         Cost per hour : Rs. 500              -");
						System.out.println("------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
						else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								fb.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							fb.showAvailableGrounds();
						}
					}
                	break;
		}
	}
	public void showGroundDetailsDilshuknagar(int groundChoice) 
	{
        	switch(groundChoice) 
			{
            		case 1:
					{
						System.out.println(yellow+"------------------------------------------------");
                		System.out.println("-"+red+"   * * * Welcome to Hari Sports Ground * * *  "+yellow+"-");
                		System.out.println("-          Location: Beside AMB Mall           -");
                		System.out.println("-  Facilities: Parking, Restrooms, First Aid   -");
						System.out.println("-          Cost per hour : Rs. 500             -");
						System.out.println("------------------------------------------------"+def);
						System.out.println();
						System.out.println("Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
						else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								fb.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							fb.showAvailableGrounds();
						}
						break;
					}
					case 2:
					{
						System.out.println(yellow+"------------------------------------------------");
                		System.out.println("-"+red+"    * * * Welcome to Rajadhani Sports * * *   "+yellow+"-");
                		System.out.println("-      Location: 400mts from Cyber Towers      -");
                		System.out.println("-   Facilities: Parking, Restrooms, First Aid  -");
						System.out.println("-          Cost per hour : Rs. 500             -");
						System.out.println("------------------------------------------------");
						System.out.println();
						System.out.println(def+"Do you want to continue to book slot: ");
						System.out.println(" y / n ");
						char c=sc.next().charAt(0);
						if(c=='y')
						{
							slot.slotSelection();
						}
						else if(c=='n')
						{
							System.out.println("Do you want to ");
							System.out.println("1. Go Back");
							System.out.println("2. Exit");
							int z=sc.nextInt();
							if(z==1)
							{
								fb.selectNearestLocation();
							}
							else if(z==2)
							{
								break;
							}
							break;
						}
						else
						{
							System.out.println("Invalid Choice.");
							fb.showAvailableGrounds();
						}
						break;
					}
                	
			}
	}
}
class Slot 
{
		static final String def = "\u001b[0;1m";
    	static final String blink = "\u001b[5m";
    	static final String red =  "\u001b[31;1m";
    	static final String green = "\u001b[32;1m";
    	static final String yellow = "\u001b[33;1m";
    	static final String blue = "\u001b[34;1m";
		static final String purple = "\u001b[35;1m";
    	static final String skblue = "\u001b[36;1m";
    	static final String bgred =  "\u001b[101;1m";
    	static final String bggreen = "\u001b[102;1m";
    	static final String bgyellow = "\u001b[103;1m";
    	static final String bgblue = "\u001b[104;1m";
    	static final String bgpurpe = "\u001b[105;1m";
    	static final String bgskblue = "\u001b[106;1m";
    	static Scanner sc = new Scanner(System.in);
    	static Slot slot = new Slot();
    	static Payment payment = new Payment();
    	static boolean[] slotsBooked = new boolean[12];
    	static List<String> selectedSlots = new ArrayList<>();
		static int totalCost = 0;
    	public void slotSelection() 
	{
        	System.out.println("Available slots: ");
		System.out.println();
        	for (int i = 0; i < 12; i++) 
		{
            		if (!slotsBooked[i]) 
			{
                		System.out.println("     "+yellow+ (i + 1) + ". " + getSlotTime(i));
            		}
        	}
       		System.out.println();
        	System.out.println(yellow+"Select your slot "+def);
        	int x = sc.nextInt();
        	if (x < 1 || x > 12 || slotsBooked[x - 1]) 
		{
            		System.out.println("Invalid or already booked slot. Please select an available slot.");
            		slotSelection();  // Recursively call slotSelection to reattempt
            		return;
        	}
        	System.out.println();
        	System.out.println("Your selected slot is "+purple);
        	String selectedSlot = getSlotTime(x - 1);
        	System.out.println("	"+selectedSlot+def);

        	totalCost += 500;

        	selectedSlots.add(selectedSlot); 
        	slotsBooked[x - 1] = true;  
        	System.out.println();
        	System.out.println("Slot Booking costs "+skblue+"Rs.500"+def);
        	System.out.println();
        	System.out.println(green+"Continue payment "+def);
        	System.out.println("1. Yes ");
			System.out.println("2. Select another slot ");
        	int n;
        	while (true) 
		{
            		n = sc.nextInt();
            		if (n >= 1 && n <= 2) 
			{
                		break;
            		} 
			else 
			{
            	    		System.out.println("Invalid choice. Please enter a number between 1 and 2.");
            		}
        	}
        	if (n == 1) 
		{
            		payment.Payment(totalCost); 
        	} 
		else if (n == 2) 
		{
            		slot.slotSelection();
        	}
    	}
    	private String getSlotTime(int index) 
	{
        	switch (index) 
		{
            		case 0: return " 8:00 a.m -  9:00 a.m";
            		case 1: return " 9:00 a.m - 10:00 a.m";
            		case 2: return "10:00 a.m - 11:00 a.m";
            		case 3: return "11:00 a.m - 12:00 p.m";
            		case 4: return "12:00 p.m -  1:00 p.m";
            		case 5: return " 1:00 p.m -  2:00 p.m";
            		case 6: return " 2:00 p.m -  3:00 p.m";
            		case 7: return " 3:00 p.m -  4:00 p.m";
            		case 8: return " 4:00 p.m -  5:00 p.m";
            		case 9: return "5:00 p.m -  6:00 p.m";
            		case 10: return "6:00 p.m -  7:00 p.m";
            		case 11: return "7:00 p.m -  8:00 p.m";
            		default: return "";
        	}
    	}
}
class Payment 
{
    	static final String def = "\u001b[0;1m";
    	static final String blink = "\u001b[5m";
    	static final String red = "\u001b[31;1m";
    	static final String green = "\u001b[32;1m";
   	static final String yellow = "\u001b[33;1m";
	static final String purple = "\u001b[35;1m";
	static final String blue = "\u001b[34;1m";
    	static Scanner sc = new Scanner(System.in);
    	public void phonepe(int totalCost) 
	{
        	System.out.println(green);
		System.out.println("Total Cost = "+def+totalCost+" ");
        	System.out.println("Your payment is in process...... ");
        	System.out.println(green+"Successfully paid..."+def);
        	System.out.println(blue+"You have won a cashback of Rs.25 "+def);
        	System.out.println();
        	System.out.println(yellow+"--------------------------------");
		System.out.println("-                              -");
		System.out.print(yellow+"-"+def);
		System.out.print(purple+"       Your slot Details:     "+def);
		System.out.println(yellow+"-");
		System.out.println("-                              -");
		System.out.println(yellow+"--------------------------------");
			System.out.println("	Date: "+green+LocalDate.now()+def+" (yyyy/mm/dd)");
			System.out.println("Slot timings are:");
	        	displaySelectedSlots();
			System.out.println("	Your court number is "+red+"1"+def);
			System.out.println();
        	System.out.println("Have a good Day");
        	System.out.println();
        	System.out.println("Exiting...");
        	System.out.println(def);
    	}

    	public void gpay(int totalCost) 
	{
        	System.out.println(red);
		System.out.println("Total Cost = "+def+totalCost+" ");
        	System.out.println("Your payment is in process...... ");
			System.out.println();
        	System.out.println(green+"Successfully paid..."+def);
        	System.out.println(blue+"You have won a Scratch card"+def);
        	System.out.println();
        	System.out.println(yellow+"--------------------------------");
		System.out.println("-                              -");
		System.out.print(yellow+"-"+def);
		System.out.print(purple+"       Your slot Details:     "+def);
		System.out.println(yellow+"-");
		System.out.println("-                              -");
		System.out.println(yellow+"--------------------------------");	
			System.out.println("Date: "+green+LocalDate.now()+def+" (yyyy/mm/dd)");
			System.out.println("Slot timings are:");
        	displaySelectedSlots();
			System.out.println(" Your court number is "+red+"3"+def);
			System.out.println();
        	System.out.println("Have a good Day");
        	System.out.println();
        	System.out.println("Exiting...");
        	System.out.println(def);
    	}
    	public void paytm(int totalCost)
	{
        	System.out.println(yellow);
			System.out.println("Total Cost = "+def+totalCost+" ");
			System.out.println();
        	System.out.println("Your payment is in process...... ");
			System.out.println();
        	System.out.println(green+"Successfully paid..."+def);
        	System.out.println(blue+"You have won a cashback of Rs.49 "+def);
        	System.out.println();
		System.out.println(yellow+"--------------------------------");
		System.out.println("-                              -");
		System.out.print(yellow+"-"+def);
		System.out.print(purple+"       Your slot Details:     "+def);
		System.out.println(yellow+"-");
		System.out.println("-                              -");
		System.out.println(yellow+"--------------------------------");
			System.out.println("	Date: "+green+LocalDate.now()+def+" (yyyy/mm/dd)");
			System.out.println("Slot timings are:");
        	displaySelectedSlots();
			System.out.println("Your court number is "+red+"2"+def);
			System.out.println();
        	System.out.println("Have a good Day");
        	System.out.println();
        	System.out.println("Exiting...");
        	System.out.println(def);
    	}
    	public void Payment(int totalCost) 
	{
		System.out.println(yellow+"Your selected slots are:");
    		for (String slot : Slot.selectedSlots)
		{
        		System.out.println(purple+slot+def);
    		}
			System.out.println();
		System.out.println(yellow+"------------------------------------------------"+def);
		System.out.println(yellow+"-                                              -");
		System.out.println("-                                              -");
		System.out.println("-                    Payment                   -");
		System.out.println("-                                              -");
		System.out.println("-                                              -"+def);
		System.out.println(yellow+"------------------------------------------------"+def);
        	System.out.println("Select the App for payment");
        	System.out.println(green+"1. Phonepe ");
        	System.out.println(red+"2. Gpay ");
        	System.out.println(yellow+"3. Paytm "+def);
        	int n;
        	while (true) 
		{
            		n = sc.nextInt();
            		if (n >= 1 && n <= 3) 
			{
                		break;
            		} 
			else 
			{
                		System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            		}
        	}
        	switch (n) 
		{
            		case 1:
                		phonepe(totalCost);
                		break;
            		case 2:
                		gpay(totalCost);
                		break;
            		case 3:
                		paytm(totalCost);
                		break;
        	}
    	}
    	private void displaySelectedSlots() 
	{
        	for (String slot : Slot.selectedSlots) 
		{
           		System.out.println(slot);
        	}
    	}
}
class number
{
	private String phnumber;
	void setnumber(String phnumber)
	{
		this.phnumber=phnumber;
	}
	String getnumber()
	{
		return phnumber;
	}
}
class num extends number
{
    	static final String def = "\u001b[0;1m";
    	static final String blink = "\u001b[5m";
    	static final String red =  "\u001b[31;1m";
    	static final String green = "\u001b[32;1m";
    	static final String yellow = "\u001b[33;1m";
    	static final String blue = "\u001b[34;1m";
		static final String purpe = "\u001b[35;1m";
    	static final String skblue = "\u001b[36;1m";
    	static final String bgred =  "\u001b[101;1m";
    	static final String bggreen = "\u001b[102;1m";
    	static final String bgyellow = "\u001b[103;1m";
    	static final String bgblue = "\u001b[104;1m";
    	static final String bgpurpe = "\u001b[105;1m";
    	static final String bgskblue = "\u001b[106;1m";
	static Scanner sc=new Scanner(System.in);
	//static n.setnumber(sc.nextLong());
	boolean Numb() 
	{
        	String str = getnumber();
        	return str.length() == 10 && str.charAt(0) >= '6' && str.charAt(0) <= '9';
    	}
		void otp()
		{
			Random random=new Random();
			int m=9999-1000+1;
			int otp=1000+random.nextInt(m);
			
			System.out.println(red+"Generating New OTP");
			System.out.println(def);
			System.out.println(otp);
			//System.out.println(green);
			System.out.println(yellow+"Enter your OTP");
			System.out.println(def);
			int s=sc.nextInt();
			if(otp==s)
			{
				System.out.print(green);
				System.out.println("*** LOGIN SUCCESSFULL ***"+def);
			}
			else
			{
				System.out.println(red);
				System.out.println("Invalid OTP");
				System.out.print(def);
				otp();
			}
		}
}

class GameSelection extends num
{
	static final String def = "\u001b[0;1m";
    	static final String red =  "\u001b[31;1m";
    	static final String purpe = "\u001b[35;1m";
    	static final String skblue = "\u001b[36;1m";
    	static final String blink = "\u001b[5m";
    	static final String green = "\u001b[32;1m";
    	static final String yellow = "\u001b[33;1m";
    	static final String blue = "\u001b[34;1m";
    	static final String bgred =  "\u001b[101;1m";
    	static final String bggreen = "\u001b[102;1m";
    	static final String bgyellow = "\u001b[103;1m";
    	static final String bgblue = "\u001b[104;1m";
    	static final String bgpurpe = "\u001b[105;1m";
    	static final String bgskblue = "\u001b[106;1m";
	static num num=new num();
    	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(yellow+blink+"***********************************************");
		System.out.println("*                                             *");
		System.out.println("*"+red+"              Welcome to PLAYO               "+yellow+"*");
		System.out.println("*                                             *");
		System.out.println("***********************************************"+def);
		System.out.println();
		System.out.println(skblue+"Login to your account ");
		System.out.println();
		System.out.println(yellow+"Enter your mobile number"+def);
		while(true)
		{
			String phoneNumber = sc.next();
			num.setnumber(phoneNumber);
			if(num.Numb())
			{
				break;
			}
			else
			{
				System.out.println(red);
				System.out.println("Does not look like a valid phone number please enter again");
			}
		}
		num.otp();
		System.out.println(def);
		String red =  "\u001b[31;1m";
		//System.out.println(yellow);
		//System.out.println(blink);
		/*
		System.out.println(yellow+blink+"***********************************************");
		System.out.println("*                                             *");
		System.out.println("*"+red+"              Welcome to PLAYO               "+yellow+"*");
		System.out.println("*                                             *");
		System.out.println("***********************************************"+def);
		*/
		System.out.println(red);
		System.out.println("Select your Game:");
		System.out.println(skblue);
        	System.out.println("1. Badminton");
        	System.out.println("2. Cricket");
        	System.out.println("3. Volleyball");
        	System.out.println("4. Football");
		int gameChoice;
		while(true) 
		{
				System.out.println(def);
            		System.out.println("Select your Game Choice: ");
           		gameChoice = sc.nextInt();
            		if (gameChoice >= 1 && gameChoice <= 4) 
			{
             			break;
	        	} 
			else 
			{
                		System.out.println("Invalid game choice. Please enter a number between 1 and 4.");
			}
        	}
        	Ground selectedGame;
        	switch(gameChoice) 
		{
            		case 1:
                			selectedGame = new Badminton();
					selectedGame.selectNearestLocation();
					break;
            		case 2:
                			selectedGame = new Cricket();
					selectedGame.selectNearestLocation();
                			break;
			case 3:
               				selectedGame = new Volleyball();
					selectedGame.selectNearestLocation();
               				break;
      			case 4:
               				selectedGame = new Football();
					selectedGame.selectNearestLocation();
            				break;
      			default:
                			System.out.println("Invalid game selection.");
                			break;
        	}	
    	}
}