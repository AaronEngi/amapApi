package amapApi;

import java.util.ArrayList;
import java.util.List;

import cn.tyrael.library.excel.CsvReader;

public class AddressReader {
	private final String filePath;
	private CsvReader csvReader;
	private List<Store> stores = new ArrayList<Store>();
	
	
	
	public AddressReader(String filePath) {
		super();
		this.filePath = filePath;
		csvReader = new CsvReader(filePath);
	}



	public List<Store> read(){
		csvReader.open();
		while(csvReader.hasNextLine()){
			String[] line = csvReader.nextLine();
			Store s = new Store();
			s.name = line[1];
			s.address = line[3];
			stores.add(s);
		}
		return stores;
	}
	

}
