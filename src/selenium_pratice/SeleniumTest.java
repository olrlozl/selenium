package selenium_pratice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver; //selenium�ȿ� WebDriver��� �ڷ����� ����
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		
		//ũ�� ����̹� ����
		WebDriver driver = new ChromeDriver(); 
		
		// ���̹� ����
		driver.get("https://www.naver.com");
		
		// ���� ��ư Ŭ��
		WebElement financeBtn = driver.findElement(By.cssSelector("#shortcutArea > ul > li:nth-child(6) > a"));
		financeBtn.click(); // �� â ����
		
		// ���� ���� â���� ����� �ѱ��
		ArrayList<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windowHandles.get(1));
		
		// �Ｚ���� �˻�
		WebElement searchInput = driver.findElement(By.cssSelector("#stock_items"));
		searchInput.sendKeys("�Ｚ����");
		searchInput.sendKeys(Keys.ENTER);// ����Ű �Է� ������
	}

}
