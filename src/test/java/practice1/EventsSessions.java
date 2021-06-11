/*package practice1;

import java.awt.Desktop.Action;
import java.awt.List;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;


public class EventsSessions {
	//WebDriver driver;
	
  @Test()
  public void f1(WebDriver driver) throws InterruptedException {
	  //relative xpath for admin
	  
	  Thread.sleep(4000);
   WebElement a = driver.findElement(By.xpath("//div[@role='navigation']/div/ul/li[7]/a"));
   //tools
   WebElement b = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[7]/ul/li[1]/a"));
   Thread.sleep(4000);
   
   Actions action = new Actions(driver);
   //mouse hover with click and enter for admin and tools
   action.moveToElement(a).click().sendKeys(Keys.ENTER).perform();
   b.click();
   
   //learning
   driver.findElement(By.xpath("//*[@id=\"bi3p\"]")).click();
   //catalogue
   driver.findElement(By.xpath("//*[@id=\"_cj0ee\"]")).click();
   //events and sessions
   driver.findElement(By.xpath("//*[@id=\"_cp1ai2ee\"]")).click();
   //creating new event
   driver.findElement(By.xpath("//*[@id=\"CsLinkButton1\"]/span")).click();
   String name=RandomStringUtils.randomAlphabetic(6,8);
   driver.findElement(By.xpath("//*[@id=\"EventTitle\"]")).sendKeys(name);
   System.out.println(name + " is event name");
   driver.findElement(By.xpath("//*[@id=\"ProviderList_csSelectProvider_button\"]")).click();
   
   
   String MainWindow=driver.getWindowHandle();		
	
   // To handle all new opened window.				
       Set<String> s1=driver.getWindowHandles();		
   Iterator<String> i1=s1.iterator();		
   		
   while(i1.hasNext())			
   {		
       String ChildWindow=i1.next();		
       		
       if(!MainWindow.equalsIgnoreCase(ChildWindow))			
       {    		
            
               // Switching to Child window
               driver.switchTo().window(ChildWindow);	                                                                                                           
               //String MainWindow1=driver.getWindowHandle();	
               
               Thread.sleep(4000);
               driver.findElement(By.xpath("//form[@method='post']/table/tbody/tr[3]/td/table/tbody/tr[3]/td[1]")).click();			
       }
   
       driver.switchTo().window(MainWindow);
   }
   driver.findElement(By.xpath("//*[@id=\"PropertiesPanel\"]/table/tbody/tr[14]/td[2]/a")).click();
   //driver.findElement(By.xpath("//*[@id=\"cancelButton\"]")).click();
   driver.findElement(By.xpath("//*[@id=\"subjectSearch_dlgSubjectSearch_upContents\"]/div[2]/table/tbody/tr[5]/td/table[1]/tbody/tr/td[1]/a[2]")).click();
   driver.findElement(By.xpath("//*[@id=\"btnNext\"]/span")).click();
   Select criteria=new Select(driver.findElement(By.xpath("//*[@id=\"OrgUnitFilter_OrgUnitTypeList\"]")));
   criteria.selectByIndex(2);
   driver.findElement(By.xpath("//*[@id=\"selectOrgUnitHref\"]/img")).click();
   
   //String MainWindow2=driver.getWindowHandle();
   //handle sub window
   Set<String> s2=driver.getWindowHandles();		
   Iterator<String> i2=s2.iterator();		
   		
   while(i2.hasNext())			
   {		
       String ChildWindow=i2.next();		
       		
       if(!MainWindow.equalsIgnoreCase(ChildWindow))			
       {    		
            
               // Switching to Child window
               driver.switchTo().window(ChildWindow);	                                                                                                           
               //String MainWindow1=driver.getWindowHandle();	
               
               Thread.sleep(4000);
   
   
   driver.findElement(By.xpath("//*[@id=\"NameField\"]")).sendKeys("Accenture");
   driver.findElement(By.xpath("//*[@id=\"cmdSearch\"]/span/b")).click();
   driver.findElement(By.xpath("//*[@id=\"ResultsListOU_ctl01_SelectResultsItem\"]")).click();
   driver.findElement(By.xpath("//*[@id=\"DoneButton\"]/span/b")).click();
      
   
  		
	
   // To handle all new opened window.				
       Set<String> s3=driver.getWindowHandles();		
   Iterator<String> i3=s3.iterator();		
   		
   while(i3.hasNext())			
   {		
     String ChildWindow1=i3.next();		
       		
       if(!MainWindow.equalsIgnoreCase(ChildWindow))			
       {    		
                
               driver.switchTo().window(MainWindow);  
               driver.findElement(By.xpath("//*[@id='OrgUnitFilter_SelectedList_ctl00_PreApprovedColumn']")).click();
               driver.findElement(By.xpath("//*[@id=\"OrgUnitFilter_SelectedList_ctl00_RegUponAppr\"]")).click();
               driver.findElement(By.xpath("//*[@id=\"btnNext\"]/span/b")).click();
               driver.findElement(By.xpath("//*[@id=\"btnNext\"]/span/b")).click();
               driver.findElement(By.xpath("//*[@id=\"txtMinimumRegistration\"]")).sendKeys("1");
               driver.findElement(By.xpath("//*[@id=\"txtMaximumRegistration\"]")).sendKeys("10");
               driver.findElement(By.xpath("//*[@id=\"Submit\"]/span/b")).click();
               driver.findElement(By.xpath("//*[@id=\"txtEventName\"]")).sendKeys(name);
               driver.findElement(By.xpath("//*[@id=\"SearchEvent\"]/span/b")).click();
               //editing the event
               driver.findElement(By.xpath("//*[@id=\"EventList_ctl00_editEventButton\"]")).click();
               driver.findElement(By.name("txtTrainingHours")).sendKeys("10");
               driver.findElement(By.xpath("//a[@data-tag='Submit']")).click();
       
   
   
       
              //creating session
               driver.findElement(By.xpath("//*[@id=\"pnlEvents_content\"]/tbody/tr/td[2]/table/tbody/tr/td[8]/a[2]/img")).click();
               driver.findElement(By.xpath("//*[@id=\"lnkCreateSession\"]/span")).click();
               driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ContentPlaceHolder1_NextButton\"]/span/b")).click();
               driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ContentPlaceHolder1_SessionDetailContent_txtPartName\"]")).sendKeys(name);
               driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ContentPlaceHolder1_SessionDetailContent_csSelectLocation_button\"]")).click();
       
      
               
               Set<String> s4=driver.getWindowHandles();		
               Iterator<String> i4=s4.iterator();		
               		
               while(i4.hasNext())			
               {		
                   String ChildWindow4=i4.next();		
                   		
                   if(!MainWindow.equalsIgnoreCase(ChildWindow4))			
                   {    		
                        
                           // Switching to Child window
                           driver.switchTo().window(ChildWindow4);	                                                                                                           
                           //String MainWindow1=driver.getWindowHandle();	
                           
                           Thread.sleep(4000);
                           driver.findElement(By.xpath("//form[@method='post']/table[2]/tbody/tr[3]/td/input[@role='button']")).click();
                           
                           driver.findElement(By.xpath("//*[@id=\"LocationConfirm\"]")).click();
                           driver.findElement(By.xpath("//*[@id=\"DoneButton\"]/span/b")).click();
                           driver.switchTo().window(MainWindow);
                           Thread.sleep(2000);
                           driver.findElement(By.xpath("//div[@style='margin-top: 15px;']/a[@data-tag='SaveButton']")).click();
                           Thread.sleep(4000);
                           
                     	for(int i=0;i<2;i++) {
                     		try {
                     		    WebDriverWait wait = new WebDriverWait(driver, 2);
                     		    wait.until(ExpectedConditions.alertIsPresent());
                     		    Alert alert = driver.switchTo().alert();
                     		    System.out.println(alert.getText());
                     		    alert.accept();
                     		    //Assert.assertTrue(alert.getText().contains("Thanks."));
                     		} catch (Exception e) {
                     		    //exception handling
                     		}
                     		              //Alert alert = (Alert) driver.switchTo().alert();
                     		              //alert().accept();
                     		//driver.findElement(By.xpath("))
                     		              WebElement element = driver.findElement(By.xpath("//a[@data-tag='NextButton']"));
                     		              JavascriptExecutor executor = (JavascriptExecutor)driver;
                     		              executor.executeScript("arguments[0].click();", element);
                     		              Thread.sleep(2000);

                     
                     	          }
                     	driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ContentPlaceHolder1_SessionDetailContent_OrgUnitFilter_SelectedList_ctl00_Preapproved\"]")).click();
                        driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ContentPlaceHolder1_SessionDetailContent_OrgUnitFilter_SelectedList_ctl00_RegUponAppr\"]")).click();
                        for(int i=0;i<1;i++) {
                     		
       		              WebElement element = driver.findElement(By.xpath("//a[@data-tag='NextButton']"));
       		              JavascriptExecutor executor = (JavascriptExecutor)driver;
       		              executor.executeScript("arguments[0].click();", element);
       		              Thread.sleep(2000);

       
       	          }
                        

                            driver.findElement(By.xpath("//a[@data-tag='SaveButton']")).click();
                            System.out.println("Session is created");
                            
                           
                           //editing a session
                            driver.findElement(By.xpath("//*[@id=\"SessionList_ctl00_EditSessionButton\"]/img")).click();
                           Thread.sleep(4000);
                            WebElement element = driver.findElement(By.xpath("//a[@data-tag='NextButton']"));
                    		JavascriptExecutor executor = (JavascriptExecutor)driver;
                    		executor.executeScript("arguments[0].click();", element);
                             Thread.sleep(2000);
                             try {
                            	    WebDriverWait wait = new WebDriverWait(driver, 2);
                            	    wait.until(ExpectedConditions.alertIsPresent());
                            	    Alert alert = driver.switchTo().alert();
                            	    System.out.println(alert.getText());
                            	    alert.accept();
                            	    //Assert.assertTrue(alert.getText().contains("Thanks."));
                            	} catch (Exception e) {
                            	    //exception handling
                            	}
                             driver.findElement(By.xpath("//a[@data-tag='SaveButton']")).click();
                             
                            
                             //upload files to roaster
                             Thread.sleep(8000);
                            // driver.findElement(By.xpath("//*[@id=\"SessionList_ctl00_aViewRoster\"]/img")).click();
                             
                             //canceling session
                             driver.findElement(By.xpath("//*[@id=\"SessionList_ctl00_CancelSessionButton\"]/img")).click();
                             System.out.println("Session is cancelled");
                             driver.close();
                             
                             
                           
                             
                             //Creating user group
                          /*driver.get("https://boilearningzone-stg.csod.com/ui/lms-learner-home/home?tab_page_id=-200300006&tab_id=-1");
                            
                             WebElement c = driver.findElement(By.xpath("//div[@role='navigation']/div/ul/li[7]/a"));
                             action.moveToElement(c).click().sendKeys(Keys.ENTER).perform();
                             driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[7]/ul/li[11]/a")).click();
                             
                             Set<String> s5=driver.getWindowHandles();		
                             Iterator<String> i5=s5.iterator();	
                             
                             while(i5.hasNext())			
                             {		
                                String ChildWindow5=i5.next();		
                                 		
                                 if(!MainWindow.equalsIgnoreCase(ChildWindow5))	
                                 {    		
                                	 //driver.get("https://boilearningzone-stg.csod.com/ui/lms-learner-home/home?tab_page_id=-200300006&tab_id=-1");
                                     
                                     //WebElement c = driver.findElement(By.xpath("//div[@role='navigation']/div/ul/li[7]/a"));
                                     //action.moveToElement(c).click().sendKeys(Keys.ENTER).perform();
                                     //driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[7]/ul/li[11]/a")).click();
                                      
                                         // Switching to Child window
                                         	                                                                                                           
                                         String MainWindow1=driver.getWindowHandle();
                             
                             
                             driver.findElement(By.xpath("//div[@id='dvLInks']//a[@data-tag=\"csLBAddGroup\"]")).click();
                             //driver.switchTo().window(ChildWindow5);
                             //driver.get("https://boilearningzone-stg.csod.com/admin/OrgUnitsAdd.aspx?isPopup=true&ouType=128");
                             //driver.switchTo().window(ChildWindow4);
                             String name1=RandomStringUtils.randomAlphabetic(6,8);
                             Thread.sleep(4000);
                             //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                             //driver.switchTo().window(ChildWindow5);
                             driver.switchTo().window(MainWindow1);
                             driver.findElement(By.xpath("//div[@data-tag=\"cspnl\"]/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[2]/span[1]/input")).sendKeys(name1);
                             Thread.sleep(4000);
                             driver.findElement(By.xpath("//*[@id=\"SaveButton\"]")).click();
                             System.out.println("user group is created " +name1);
                             
                             driver.switchTo().window(MainWindow1);
                             
                             //driver.close();
                             
                           
                    }
                 }*/
               //}
           //  }
	      //  }
         //  }
         // }
       //  }
  //}

	//private Alert alert() {
		// TODO Auto-generated method stub
		//return null;
	//}
//}




