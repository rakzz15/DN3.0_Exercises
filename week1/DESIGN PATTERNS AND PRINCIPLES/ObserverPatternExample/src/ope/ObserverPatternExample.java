package ope;

public class ObserverPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("MobileApp1");
        Observer mobileApp2 = new MobileApp("MobileApp2");
        Observer webApp = new WebApp("WebApp");

        stockMarket.register(mobileApp1);
        stockMarket.register(mobileApp2);
        stockMarket.register(webApp);

        System.out.println("Setting stock price to 100.0");
        stockMarket.setStockPrice(100.0);

        System.out.println("\nDeregistering MobileApp2");
        stockMarket.deregister(mobileApp2);

        System.out.println("\nSetting stock price to 150.0");
        stockMarket.setStockPrice(150.0);

	}

}
