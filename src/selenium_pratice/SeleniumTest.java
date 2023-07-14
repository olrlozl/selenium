package selenium_pratice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver; //selenium안에 WebDriver라는 자료형을 만듦
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		
		//크롬 드라이버 생성
		WebDriver driver = new ChromeDriver(); 
		
		// 네이버 열기
		driver.get("https://www.naver.com");
		
		// 증권 버튼 클릭
		WebElement financeBtn = driver.findElement(By.cssSelector("#shortcutArea > ul > li:nth-child(6) > a"));
		financeBtn.click(); // 새 창 열림
		
		// 새로 열린 창으로 제어권 넘기기
		ArrayList<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windowHandles.get(1));
		
		// 삼성전자 검색
		WebElement searchInput = driver.findElement(By.cssSelector("#stock_items"));
		searchInput.sendKeys("삼성전자");
		searchInput.sendKeys(Keys.ENTER);// 엔터키 입력 보내기
	}

}
