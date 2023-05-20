package PageFactory;

public class Object_Repository {
	
	
	//==============::::::::::=============================:::::::::::::============================:::::::::::==============================
										/**************
										 * Login Page *
										 **************/
	
		
				public static final String UserName 			= 		".//*[@Formcontrolname=\"Email\"]";
				public static final String Password 			= 		".//*[@Formcontrolname=\"Password\"]";
			
				public static final String Login_Button 		= 		".//*[@type=\"submit\"]";
	/*
				public static final String UserName = ".//*[@Formcontrolname=\"Email\"]";
			
				public static final String UserName = ".//*[@Formcontrolname=\"Email\"]";
			
				public static final String UserName = ".//*[@Formcontrolname=\"Email\"]";
			
				public static final String UserName = ".//*[@Formcontrolname=\"Email\"]";
			
				public static final String UserName = ".//*[@Formcontrolname=\"Email\"]";
	*/
	
	//==============::::::::::=============================:::::::::::::============================:::::::::::==============================
										/**************
										 * HomePage Page *
										 **************/
				
				public static final String SignOut 						= 		".//*[@class=\"dropdown-toggle nav-link\"]";
				
				public static final String Logout_btn 					= 		"//button[contains(text(),\"Logout\")]";
				
				public static final String LogOut_Confirm				= 		"(.//*[@type=\"button\"])[1]";
				
				public static final String Create_New_Filing_btn		= 		"//button[text()=' Create New Filing ']";
				
				public static final String CreateNewFiling_PageName 	= 		"//p[contains(text(),\"Create New Filing\")]";
				
				public static final String Quick_Actions                =       "//*[@id=\"user-dropdown\"]/span";
				
				public static final String Assigne_Shipment_Number      =       "//*[@id=\"dropdown-toggler\"]/div[1]";
				
				public static final String Title_For_Shipment           =       "/html/body/ngb-modal-window/div/div/form/div[2]/div[1]/div/input";
				
				public static final String Shipment_Tracking_Number     =       "/html/body/ngb-modal-window/div/div/form/div[2]/div[2]/div/input";
				
                public static final String Filing_For_Shipment          =       "//span[contains(text(),'Select Filing')]";

                public static final String Filing_For_Shipment1         =       "(.//*[@class='item2']//div)[1]";
                
                public static final String Save_Btn_For_Shipment        =       "/html/body/ngb-modal-window/div/div/form/div[3]/button[2]";
                
                
	//==============::::::::::=============================:::::::::::::============================:::::::::::==============================
											/**************************
											 * Create New Filing Page *
											 **************************/	
				
				
				public static final String Choose_Filing_Type 			= 		".//*[@id=\"sel1\"]";
				
			//	public static final String SponsorType 					= 		"(.//*[@type=\"radio\"])[1]";
				
			//	public static final String AddTeamMember 					= 		"(.//*[@type=\"radio\"])[1]";				
				
			//	public static final String SponsorType 					= 		"(.//*[@type=\"radio\"])[1]";				
				
	//==============::::::::=============================:::::::::::================================:::::::::::::===============================			
				                                    /**************************
			                                     	 *      Admin Filing      *
				                                     **************************/
				
				
				
				
				//Member
				public static final String Members                    =   "//div[contains(text(),\"Members\")]";
				
				public static final String Add_New_Team_Member        =   "(.//*[@class=\"col-sm-6\"]//button)[4]";
				
				public static final String Unlock_subadmin            =   ".//*[@class=\"fas fa-unlock-alt pointer\"]";
				
				public static final String Cancle_Btn_On_Members_Card =   "/html/body/ngb-modal-window/div/div/div[3]/button";
				
				public static final String Edit_In_Members_Tab        =   "(//button[contains(text(),\"Edit\")])[2]";     
				
				public static final String Subadmin_Row               =   "(.//*[@class=\"row\"]//i)[2]";
				
				public static final String Confirm_Remove_The_Member  =   "//button[@class ='btn btn-danger ml-20 mt-10 fs-12']";
				
				public static final String Save_Btn_In_Members_Tab    =    "//button[contains(text(),\"Save\")]";
				
				public static final String Add_Shipment_Number_Overview_Section =    "(.//*[@class='col-md-4']//span)[3]";
				
				public static final String Shipment_Title_Overview_Section =    "(//input[@type='text'])[1]";

				public static final String Enter_Shipment_Number_Overview_Section =    "(//input[@type='text'])[2]";
				
				public static final String Save_Shipment_Number_Overview_Section =    "/html/body/ngb-modal-window/div/div/div[3]/button[2]";

				public static final String Open_Shipment_Number_Overview_Section =    "/html/body/app-root/app-app-layout/app-fillings/app-filling-layout/div[3]/app-overview/div/div[1]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[4]/div/span[3]";

				public static final String Shipment_Status               =    "(.//*[@class='col-md-12']//div)[2]";

				
				//==============::::::::=============================:::::::::::================================:::::::::::::===============================			
                                                            /**************************
                                                            *     Admin Task  tab     *
                                                             **************************/				
             
				public static final String View_Task                                              =   "(//button[@tabindex='0'])[1]" ;
				
				public static final String Open_Org_Dtls_In_Client_Task                           =   "(.//*[@class=\"col-md-12\"])[2]";
				
				
			    public static final String get_text_Organization_Name                             =    "//*[@id=\"1\"]/organization-form/form/div[2]/div/input" ;     

                public static final String get_text_Doing_Business_As_Name                        =    "//*[@id=\"1\"]/organization-form/form/div[3]/div/input";

                public static final String get_text_Nature_Of_Business                            =    "//*[@id=\"1\"]/organization-form/form/div[4]/div[1]/input";

                public static final String get_text_Company_Formed_On                             =    "//*[@id=\"1\"]/organization-form/form/div[4]/div[2]/div/input";

                public static final String get_text_Current_Total_Number_Of_Employees             =    "//*[@id=\"1\"]/organization-form/form/div[5]/div/input";
                
                public static final String get_text_Total_Full_Time_Employees                     =    "//*[@id=\"1\"]/organization-form/form/div[6]/div[1]/input";

                public static final String get_text_Number_Of_Employees_On_H1_B                   =    "//*[@id=\"1\"]/organization-form/form/div[6]/div[2]/input";

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
        	//==============::::::::=============================:::::::::::================================:::::::::::::===============================			
                                                         /**************************
             	                                          *   Admin Messages tab    *
                                                          **************************/				
				
				public static final String Admin_Messgaes_Tab                    =    "(//div[@class='gl-listname'])[2]";
				
				public static final String Add_New_Topic_On_Messages_tab         =    "/html/body/app-root/app-app-layout/app-fillings/app-filling-layout/div[3]/app-messages/div[1]/div[2]/div/button";
				
				public static final String Topic_Or_Question                     =    "//input[@name='topic']";
				
				public static final String Description_On_Messages_Tab           =    ".//*[@formcontrolname=\"description\"]";
				
				public static final String Add_Law_Members_For_Topic_On_Messages =    "(//span[@class='dropdown-btn'])[1]";
				
				public static final String Select_All_Law_Members_On_Members     =    "(//div[contains(text(),\"Select All\")])[1]";
				
                public static final String Add_Client_Members_For_Topic_On_Messages =    "(//span[@class='dropdown-btn'])[2]";
				
				public static final String Select_All_Client_Members_On_Members     =    "(//div[contains(text(),'Select All')])[2]";
				
				public static final String Save_Btn_On_Memebrs_Tab                =    "(//button[@class= 'btn btn-primary'])[2]";
				
				public static final String Open_The_New_Topic                     =    "(//li[contains(text(),\"View\")])[1]";
				
				public static final String Reply_To_Members                       =    "/html/body/app-root/app-app-layout/app-fillings/app-filling-layout/div[3]/app-viewmessages/div[3]/div/div/div/textarea";
				
				public static final String Send_Message                           =    "//button[contains(text(),\"Send Message\")]";


			
	        	//==============::::::::=============================:::::::::::================================:::::::::::::===============================			
	                                                         /**************************
	             	                                          *  Client Settings Page  *
	                                                          **************************/


				public static final String Clients_Settings_Page                         =    "(//*[@id=\"navbar-menu\"]/div[1]/a[4])[2]";

                public static final String Change_Details_Btn_In_Client                  =    "//*[@id=\"1\"]/organization-card/div/div/div/div/button";

            
                public static final String Save_Changes_Btn_For_Org_Dtls_In_Client       =    "//*[@id=\"1\"]/organization-form/form/div[7]/div/button[1]";
                

                public static final String Organization_Name_Field_In_Client             =    "//*[@id=\"1\"]/organization-form/form/div[2]/div/input" ;     

                public static final String Doing_Business_As_Name                        =    "//*[@id=\"1\"]/organization-form/form/div[3]/div/input";

                public static final String Nature_Of_Business                            =    "//*[@id=\"1\"]/organization-form/form/div[4]/div[1]/input";

                public static final String Company_Formed_On                             =    "//*[@id=\"1\"]/organization-form/form/div[4]/div[2]/div/input";

                public static final String Current_Total_Number_Of_Employees             =    "//*[@id=\"1\"]/organization-form/form/div[5]/div/input";
                
                public static final String Total_Full_Time_Employees                     =    "//*[@id=\"1\"]/organization-form/form/div[6]/div[1]/input";

                public static final String Number_Of_Employees_On_H1_B                   =    "//*[@id=\"1\"]/organization-form/form/div[6]/div[2]/input"; 






































}
