package Login;

import java.util.HashMap;

public class IDandPass {
	HashMap<String,String> logininfo = new HashMap<String,String>();
	public IDandPass() {
		// TODO Auto-generated constructor stub
		logininfo.put("admin", "admin");
	}
	
	protected HashMap<String, String> getLogininfo() {
		return logininfo;
	}
	
}
