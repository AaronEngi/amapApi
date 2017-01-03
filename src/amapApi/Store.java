package amapApi;

public class Store {
	public static enum BRAND {CSMall};
	
	public String name;
	public String address;
	public BRAND brand; 
	/**
	 * 精度
	 */
	public String longitude;
	/**
	 * 纬度
	 */
	public String latitude;
}
