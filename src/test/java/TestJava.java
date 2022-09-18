import org.junit.Test;

import com.journaldev.spring.model.User;
import static org.junit.Assert.*;

public class TestJava {
	
	User user=new User();
	
	@Test
	public void getUserNameTest() {
		user.setUserName("Amit");
		assertEquals("Amit",user.getUserName());  
		
	}
	

}
