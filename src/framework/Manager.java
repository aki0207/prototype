package framework;

import java.util.HashMap;


/**
 * Productインターフェースを利用してインスタンスの複製を行うクラス
 */
public class Manager {
	private HashMap<String, Product> showcase = new HashMap<>();
	
	public void register(String name, Product proto) {
		showcase.put(name, proto);
	}
	public Product create(String protoname) {
		Product p = showcase.get(protoname);
		return p.createClone();
	}

}
