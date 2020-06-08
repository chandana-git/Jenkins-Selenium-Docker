package testcases.mytheresa;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import objectRepository.mytheresa.MytheresaHomePage;
import objectRepository.mytheresa.MytheresaMyAccountPage;
import objectRepository.mytheresa.MytheresaNewArraivalThisWeekPage;
import objectRepository.mytheresa.MytheresaWishListPage;

import static variables.mytheresa.UserVariables.*;

public class WishListCheckAdd {

	@Test
	public void WishList() {

		
	}

	private void logIn(WebDriver driver) {
		// log in
		
	}

	private MytheresaWishListPage addDeleteItemWishlist(WebDriver driver) {
	 	// add item in wish list
		// My account page access
		MytheresaMyAccountPage map = new MytheresaMyAccountPage(driver);
		map.wishListLinkPath().click();

		// wish list page access
		MytheresaWishListPage mwlp = new MytheresaWishListPage(driver);
		mwlp.newArrivalListPath().click();

		// New arrival this week page access
		//MytheresaNewArraivalThisWeekPage mnatwp = new MytheresaNewArraivalThisWeekPage(driver); 
		//mnatwp.selectAsWishPath().click();

		//if(mnatwp.isSizeExist()) {
		//	mnatwp.selectSizePath().click();
		//}

		//mnatwp.addToWishListPath().click();
		//mnatwp.viewWishListPath().click();

		// delete item from wish list
		// wish list page access
		//mwlp.removeOptionPath().click();
		return mwlp;
	}

	private void louOut(WebDriver driver, MytheresaWishListPage mwlp) {
		
	}

}
