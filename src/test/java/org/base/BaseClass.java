package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver chromeBrowser() {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 return driver;
		
	}
	
	public static WebDriver browserLaunch(String bname) {
		
		if(bname.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(bname.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		}
		else if(bname.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();	
		}
		return driver;
	
	}
	
	public static WebDriver browserLaunch2(String bname) {
		
		switch(bname) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 
		case "edge":
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			 
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();	
				
		}
		
		return driver;	
		
	}
	
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void sendkeys(WebElement e,String value) {
		e.sendKeys(value);
	}
	
	public static void click(WebElement e) {
		e.click();
	}
	
	public static void clear(WebElement e) {
		e.clear();
	}
	
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void close() {
		driver.close();
	}
	
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;
	}

	public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
	}
	
	public static String getAttribute1(WebElement e) {
		String attribute = e.getAttribute("innerText");
		return attribute;
	}
	
	public static void implicitlywait(int a) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
		Thread.sleep(a);
	}
	
	public static void moveToElement(WebElement targetmove ) {
		Actions a=new Actions(driver);
		a.moveToElement(targetmove).perform();
	}
	
	public static void dragAndDrop(WebElement src,WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}
	
	public static void contentClick(WebElement targetcontent) {
		Actions a=new Actions(driver);
		a.contextClick(targetcontent).perform();
	}
	
	public static void doubleClick(WebElement targetdouble) {
		Actions a=new Actions(driver);
		a.doubleClick(targetdouble).perform();
	}
	
	public static void Click(WebElement targetclick) {
		Actions a=new Actions(driver);
		a.click(targetclick).perform();
	}
	
	public static void clickAndHold(WebElement targethold) {
		Actions a=new Actions(driver);
		a.clickAndHold(targethold).perform();
	}
	
	public static void release(WebElement targetrelease) {
		Actions a=new Actions(driver);
		a.release(targetrelease).perform();
	} 
	
	public static void keyEnter() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
//	public static void keyDown() throws AWTException {
//		Robot r=new Robot();
//		r.keyRelease(index);
//	}
	
	public static void selectByValue(WebElement e,String value) {
	    Select s=new Select(e);
	    s.selectByValue(value);
	}
	
	public static void selectByIndex(WebElement e,int index) {
		Select s=new Select(e);
		s.selectByIndex(index);
	}
	
	public static void selectByVisibleText(WebElement e,String text) {
		Select s=new Select(e);
		s.selectByVisibleText(text);
	}
	
	//one way
	public static List<WebElement>  getOptions(WebElement e) {
		Select s=new Select(e);
		List<WebElement> options = s.getOptions();
		return options;
	}
	//second way
	public static List<WebElement>  getOptions1(WebElement e) {
		Select s=new Select(e);
		List<WebElement> options = s.getOptions();
		for (WebElement x : options) {
			System.out.println(x.getText());
		}
		return options;
	}
	//third way
//	public static List<String>  getOptions3(WebElement e) {
//		Select s=new Select(e);
//		List<String> li=new ArrayList<>();
//		List<WebElement> options = s.getOptions();
//		for(int i=0;i<options.size();i++) {
//			WebElement webElement = options.get(i);
//			String text = webElement.getText();
//			li.add(text);
//		}
//		return li;
		
	public static List<WebElement> getAllSelectedOptions(WebElement e) {
		Select s=new Select(e);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;
	}
	
	public static String getFirstSelectedOption(WebElement e) {
		Select s=new Select(e);
		WebElement fs = s.getFirstSelectedOption();
		String text = fs.getText();
		return text;
	}
	
	public static void isMultiple(WebElement e) {
		Select s=new Select(e);
		 boolean result=s.isMultiple();
	}
	
	public static void deselectByIndex(WebElement e,int index) {
		Select s=new Select(e);
		s.deselectByIndex(index);
	}
	
	public static void deselectByValue(WebElement e,String value) {
		Select s=new Select(e);
		s.deselectByValue(value);
	}
	
	public static void deselectByVisibleText(WebElement e,String text) {
		Select s=new Select(e);
		s.deselectByVisibleText(text);
	}
	
	public static void deselectAll(WebElement e) {
		Select s=new Select(e);
		s.deselectAll();
	}
	
	public static void simpleAlert() {
		Alert a=driver.switchTo().alert();
		a.accept();	
	}
	
	public static void confirmAlert() {
		Alert a=driver.switchTo().alert();
		a.dismiss();
	}
	
	public static void promptAlert(String value) {
		Alert a=driver.switchTo().alert();
		a.sendKeys(value);
		a.accept();
	}
	
	public static void frames(String id) {
		driver.switchTo().frame(id);
	}
	
	public static void frames1(int index) {
		 driver.switchTo().frame(index);
	 }
	 
	 public static void frames2(String name) {
		 driver.switchTo().frame(name);
	 }
	 
	 public static void frames3(WebElement element,String w) {
		 driver.switchTo().frame(w);
	 }
	 
	 public static void parentframes() {
		 driver.switchTo().parentFrame();
	 }
	
	 public static void defaultContent() {
		 driver.switchTo().defaultContent();
	 }
	 
	public static void Screenshot() {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		
	}
	
	public static void windows(String Id) {
		driver.switchTo().window(Id);
	}
	
	public  static String getWiondowsHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	
	public static void getWindowsHandles(int index) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li=new ArrayList<String>();
		li.addAll(windowHandles);
		driver.switchTo().window(li.get(index));
	}
	 public static void to(String Url) {
		 driver.navigate().to(Url);
	 }
	 
	 public static void back() {
		 driver.navigate().back();
	 }
	 
	 public static void forward() {
		 driver.navigate().forward();
	 }
	 
	 public static void refresh() {
		 driver.navigate().refresh();
	 }
	  
	 public static boolean isDisplayed(WebElement e) {
		 boolean displayed = e.isDisplayed();
		 return displayed;
	 }
	 
	  public static boolean isEnabled(WebElement e) {
		  boolean enabled = e.isEnabled();
		  return enabled;
	  }
	  
	  public static boolean isSelected(WebElement e) {
		  boolean selected = e.isSelected();
		  return selected;
	  }
	  
	  public static String readExcel(String Filename,String sheet,int r,int c) throws IOException {
		  File f=new File("C:\\Users\\rithw\\eclipse-workspace\\NewMaven\\src\\test\\resources\\Excel");
		  FileInputStream st=new FileInputStream(f);
		  Workbook w=new XSSFWorkbook(st);
		  Sheet s = w.getSheet(sheet);
		  Row ro = s.getRow(r);
		  Cell cell = ro.getCell(c);
		  
		  int type = cell.getCellType();
		  String value=null;
		  if(type==1) {
			  value = cell.getStringCellValue();
		  }
		  else {
			  if(DateUtil.isCellDateFormatted(cell)) {
				  Date dateCellValue = cell.getDateCellValue();
				  SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yyyy");
				  value = sd.format(dateCellValue);
			  }
			  else {
				  double numericCellValue = cell.getNumericCellValue();
				  long num=(long)numericCellValue;
				   value= String.valueOf(num);
			  }
		  }
		return value;
		  

	  }
	  
}
