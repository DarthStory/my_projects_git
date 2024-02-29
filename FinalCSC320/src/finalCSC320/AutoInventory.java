package finalCSC320;

import java.util.ArrayList;
import java.util.List;

public class AutoInventory {
	private List<Automobile> auto = new ArrayList<>();
	
	public void addAutomobile(Automobile automobile) {
		auto.add(automobile);
	}
	public boolean deleteAutomobile(String make) {
		return auto.removeIf(auto -> auto.getMake().equals(make));
	}
	public boolean modifyAutomobile ()
}