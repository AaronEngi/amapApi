package amapApi;

import java.util.List;

import cn.tyrael.library.http.HttpDefault;

public class AddressToCoodinate {
	private final String file;
	private AddressReader ar;
	private List<Store> reads;
	private List<Store> writes;
	
	public static void main(String args[]){
		
	}
	
	
	
	public AddressToCoodinate(String file) {
		super();
		this.file = file;
		ar = new AddressReader(file);
	}



	/**
	 * 从文件读取信息
	 */
	public void readAddress(){
		reads = ar.read();
	}
	
	/**
	 * 根据地址获取坐标
	 */
	public void requestGeo(){
		
	}
	
	/**
	 * 根据地址获取坐标
	 */
	public void requestGeo(Store store){
		String url = "http://restapi.amap.com/v3/geocode/geo?address=%E6%9D%AD%E5%B7%9E%E5%B8%82%E6%B1%9F%E5%B9%B2%E5%8C%BA%E6%96%B0%E5%A1%98%E8%B7%AF108%E5%8F%B7%E5%A4%A9%E8%99%B9%E5%95%86%E5%9C%BAB%E5%BA%A72%E6%A5%BC&output=json&key=1495366e3c9f3a059f341cb2d2a4972a";
		okhttp3.Response res = HttpDefault.get(url);
	}
	
	/**
	 * 结果保存成json
	 */
	public void writeGeo(){
		
	}
}
