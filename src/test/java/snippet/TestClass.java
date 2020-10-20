package snippet;

import org.testng.annotations.Test;

public class TestClass {
	@Test
	public void cmdTest()
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URL);
		
		
	}
}

