package selenium_pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ticketing {

	public static void main(String[] args) {
		// 크롬 드라이버 생성
		WebDriver driver = new ChromeDriver();
		
		// SRT 페이지 열기
		driver.get("https://etk.srail.kr/main.do");
		
		// 출발역 선택
		WebElement departureInput = driver.findElement(By.cssSelector("#dptRsStnCd"));
		Select departure = new Select(departureInput);
		departure.selectByVisibleText("수서");
		
		// 도착역 선택
		WebElement arrivalInput = driver.findElement(By.cssSelector("#arvRsStnCd"));
		Select arrival = new Select(arrivalInput);
		arrival.selectByValue("0020"); // 부산
		
		// 간편조회하기 버튼 클릭
		WebElement searchBtn = driver.findElement(By.cssSelector("#search-form > fieldset > a"));
		searchBtn.click();
	}

}
