package pageUIs_nopCommerce;

public class BasePageUI {
	// Không có tham số - truyền cố định
	public static final String HOME_PAGE_IMG = "//img[@alt='nopCommerce demo store']";
	public static final String SHOPPING_CART_LINK = "//div[@class='footer']//a[text()='Shopping cart']";
	public static final String ABOUT_US_PAGE_LINK = "//div[@class='footer']//a[text()='About us']";
	public static final String NEWS_PAGE_LINK = "//div[@class='footer']//a[text()='News']";
	public static final String SITE_MAP_LINK = "//div[@class='footer']//a[text()='Sitemap']";
	
	
	// Có 1 tham số - Dynamic Page name
	public static final String FOOTER_PAGE_LINK_NAME = "//div[@class='footer']//a[text()='%s']";

}
