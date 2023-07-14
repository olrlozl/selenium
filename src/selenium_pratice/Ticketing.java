package selenium_pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ticketing {

	public static void main(String[] args) {
		// ũ�� ����̹� ����
		WebDriver driver = new ChromeDriver();
		
		// SRT ������ ����
		driver.get("https://etk.srail.kr/main.do");
		
		// ��߿� ����
		WebElement departureInput = driver.findElement(By.cssSelector("#dptRsStnCd"));
		Select departure = new Select(departureInput);
		departure.selectByVisibleText("����");
		
		// ������ ����
		WebElement arrivalInput = driver.findElement(By.cssSelector("#arvRsStnCd"));
		Select arrival = new Select(arrivalInput);
		arrival.selectByValue("0020"); // �λ�
		
		// ������ȸ�ϱ� ��ư Ŭ��
		WebElement searchBtn = driver.findElement(By.cssSelector("#search-form > fieldset > a"));
		searchBtn.click();
	}

}
