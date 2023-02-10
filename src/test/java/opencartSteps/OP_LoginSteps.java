package opencartSteps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import opencartPages.OP_HomePage;
import opencartPages.OP_LoginPage;
import opencartPages.OP_MyAccountPage;
import opencartUtilities.TestBase;

public class OP_LoginSteps {
	OP_HomePage hp = new OP_HomePage();
	OP_LoginPage lp = new OP_LoginPage();
	OP_MyAccountPage myAc = new OP_MyAccountPage();

	@Given("User launch browser and opens Url")
	public void user_launch_browser_and_opens_url() {
		System.out.println("Home page");
	}

	@When("User navigate to MyAccount menu")
	public void user_navigate_to_my_account_menu() {
		hp.clickOnMyAccount();

	}

	@When("click on Login")
	public void click_on_login() {
		hp.clickOnLogin();
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emails, String passwords) {
		lp.enteremail(emails);
		lp.enterpassword(passwords);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		lp.clickOnLogin();
	}

	@Then("User navigates to MyAccount Page")
	public void user_navigates_to_my_account_page() {
		
		boolean targetpage=	myAc.isMyAccountPageExists();
		

	
	        if(targetpage)
	        {
	            Assert.assertTrue(true);
	        }
	        else
	        {
	            Assert.assertTrue(false);
	        }
	
	    }
	
	

//	 WebDriver driver;
//     HomePage hp;
//     LoginPage lp;
//     MyAccountPage macc;
//
//     List<HashMap<String, String>> datamap; //Data driven
//
//     Logger logger; //for logging
//     ResourceBundle rb; // for reading properties file
//     String br; //to store browser name
//


// 
//
//    @Given("opens URL {string}")
//    public void opens_url(String url) {
//        driver.get(url);
//        driver.manage().window().maximize();
//    }
//   
//
//    @When("User navigate to MyAccount menu")
//    public void user_navigate_to_my_account() {
//    	hp=new HomePage(driver);
//    	hp.clickMyAccount();
//        logger.info("Clicked on My Account ");
//            
//    }
//
//    @When("click on Login")
//    public void click_on_login() {
//        hp.clickLogin();
//        logger.info("Clicked on Login ");
//    }
//
//    @When("User enters Email as {string} and Password as {string}")
//    public void user_enters_email_as_and_password_as(String email, String pwd) {
//    	lp=new LoginPage(driver);
//         
//    	lp.setEmail(email);
//        logger.info("Provided Email ");
//        lp.setPassword(pwd);
//        logger.info("Provided Password ");
//    }
//
//    @When("Click on Login button")
//    public void click_on_login_button() {
//        lp.clickLogin();
//        logger.info("Clicked on Login button");
//    }
//
//
//    @Then("User navigates to MyAccount Page")
//    public void user_navigates_to_my_account_page() {
//    	macc=new MyAccountPage(driver);
//		boolean targetpage=macc.isMyAccountPageExists();
//	
//        if(targetpage)
//        {
//            logger.info("Login Success ");
//            Assert.assertTrue(true);
//        }
//        else
//        {
//            logger.error("Login Failed ");
//            Assert.assertTrue(false);
//        }
//
//    }
//
//    //*******   Data Driven test method    **************
//    @Then("check User navigates to MyAccount Page by passing Email and Password with excel row {string}")
//    public void check_user_navigates_to_my_account_page_by_passing_email_and_password_with_excel_data(String rows)
//    {
//        datamap=DataReader.data(System.getProperty("user.dir")+"\\testData\\Opencart_LoginData.xlsx", "Sheet1");
//
//        int index=Integer.parseInt(rows)-1;
//        String email= datamap.get(index).get("username");
//        String pwd= datamap.get(index).get("password");
//        String exp_res= datamap.get(index).get("res");
//
//        lp=new LoginPage(driver);
//        lp.setEmail(email);
//        lp.setPassword(pwd);
//
//        lp.clickLogin();
//        try
//        {
//            boolean targetpage=macc.isMyAccountPageExists();
//
//            if(exp_res.equals("Valid"))
//            {
//                if(targetpage==true)
//                {
//                    MyAccountPage myaccpage=new MyAccountPage(driver);
//                    myaccpage.clickLogout();
//                    Assert.assertTrue(true);
//                }
//                else
//                {
//                    Assert.assertTrue(false);
//                }
//            }
//
//            if(exp_res.equals("Invalid"))
//            {
//                if(targetpage==true)
//                {
//                    macc.clickLogout();
//                    Assert.assertTrue(false);
//                }
//                else
//                {
//                    Assert.assertTrue(true);
//                }
//            }
//
//
//        }
//        catch(Exception e)
//        {
//
//            Assert.assertTrue(false);
//        }
//        driver.close();
//    }
//
//    //*******   Account Registration Methods    **************
}
