package selenium_pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MovieReservation {

	public static void main(String[] args) {
		// ũ�� ����̹� ����
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		// naver ����
		driver.get("https://www.naver.com");
		
		// �ڽ����ǽ� �˻�
		WebElement searchInput = driver.findElement(By.cssSelector("#query"));
		searchInput.sendKeys("�ڽ����ǽ�");
		searchInput.sendKeys(Keys.ENTER);// ����Ű �Է� ������

		// 1�� ��ȭ Ŭ��
		WebElement firstMovie = driver.findElement(By.cssSelector("#main_pack > div.sc_new.cs_common_module.case_list.color_5._au_movie_list_content_wrap > div.cm_content_wrap > div > div > div.mflick > div._panel_popular._tab_content > div.list_image_info.type_pure_top > div > ul:nth-child(1) > li:nth-child(1) > a"));
		firstMovie.click();
		
		// �����ϱ� Ŭ��
		WebElement reservationBtn = driver.findElement(By.cssSelector("#main_pack > div.sc_new.cs_common_module.case_empasis.color_14._au_movie_content_wrap > div.cm_content_wrap > div.cm_content_area._cm_content_area_info > div.cm_info_box > div.button_area > div.button_box > ul > li > a"));
		reservationBtn.click();
		
		// ���� cgv�� 3��° ��ȭ Ŭ��
		WebElement theaterElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#main_pack > div.sc_new.cs_common_module.case_empasis.color_14._au_movie_content_wrap > div.cm_content_wrap > div > div > div > div.area_content > ul > li:nth-child(1) > div.area_slide_box_outer > div > ul > li:nth-child(3) > a")));
		driver.get(theaterElement.getAttribute("href"));
		
		// �¼����� Ŭ��
//		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
//		WebElement seatSelectionBtn = driver.findElement(By.cssSelector("#tnb_step_btn_right"));
//		seatSelectionBtn.click();
		
		
		
	}

}
