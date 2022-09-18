import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.journaldev.spring.model.User;


public class TestJava {
	
	User user=new User();
	
	@Test
	public void getUserNameTest() {
		user.setUserName("Amit");
		assertEquals("Amits",user.getUserName());  
		
	}
	

}
