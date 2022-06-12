package excep;

import java.io.File;

public class DataStrage {
	File storage = File.initialize();
	
	public Data read(String key) throws FileException {
		return storage.find(key);
	}
}
