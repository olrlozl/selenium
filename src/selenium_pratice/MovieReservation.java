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
		// 크롬 드라이버 생성
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		// naver 열기
		driver.get("https://www.naver.com");
		
		// 박스오피스 검색
		WebElement searchInput = driver.findElement(By.cssSelector("#query"));
		searchInput.sendKeys("박스오피스");
		searchInput.sendKeys(Keys.ENTER);// 엔터키 입력 보내기

		// 1위 영화 클릭
		WebElement firstMovie = driver.findElement(By.cssSelector("#main_pack > div.sc_new.cs_common_module.case_list.color_5._au_movie_list_content_wrap > div.cm_content_wrap > div > div > div.mflick > div._panel_popular._tab_content > div.list_image_info.type_pure_top > div > ul:nth-child(1) > li:nth-child(1) > a"));
		firstMovie.click();
		
		// 예매하기 클릭
		WebElement reservationBtn = driver.findElement(By.cssSelector("#main_pack > div.sc_new.cs_common_module.case_empasis.color_14._au_movie_content_wrap > div.cm_content_wrap > div.cm_content_area._cm_content_area_info > div.cm_info_box > div.button_area > div.button_box > ul > li > a"));
		reservationBtn.click();
		
		// 강남 cgv의 3번째 영화 클릭
		WebElement theaterElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#main_pack > div.sc_new.cs_common_module.case_empasis.color_14._au_movie_content_wrap > div.cm_content_wrap > div > div > div > div.area_content > ul > li:nth-child(1) > div.area_slide_box_outer > div > ul > li:nth-child(3) > a")));
		driver.get(theaterElement.getAttribute("href"));
		
		// 좌석선택 클릭
//		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
//		WebElement seatSelectionBtn = driver.findElement(By.cssSelector("#tnb_step_btn_right"));
//		seatSelectionBtn.click();
		
		
		
	}

}
