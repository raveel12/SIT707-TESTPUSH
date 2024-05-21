package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * @author Ahsan Habib
 */
public class LoginFormTest 
{

	@Test
	public void testStudentIdentity() {
		String studentId = "s223302973";
		Assert.assertNotNull("s223302973", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Raveel Kashif";
		Assert.assertNotNull("Raveel Kashif", studentName);
	}
	
	@Test
    public void testFailEmptyUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login(null, null);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	/*
	 * Write more test functions below.
	 */
	@Test
	 public void testFailEmptyUsernameAndWrongPasswordAndDontCareValCode()
	    {
			LoginStatus status = LoginForm.login(null, "xyz");
			Assert.assertTrue( status.isLoginSuccess() == false );
	    }
	
	@Test
	 public void testFailEmptyUsernameAndCorrectPasswordAndDontCareValCode()
	    {
			LoginStatus status = LoginForm.login(null, "ahsan_pass");
			Assert.assertTrue( status.isLoginSuccess() == false );
	    }
	
	@Test
    public void testFailWrongUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("xyz", null);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	@Test
    public void testFailWrongUsernameAndWrongPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("xyz", "abc");
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	@Test
    public void testFailWrongUsernameAndCorrectPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("xyz", "ahsan_pass");
		Assert.assertTrue( status.isLoginSuccess() == false );
    }

	@Test
    public void testFailCorrectUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("ahsan", null);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	@Test
    public void testFailCorrectUsernameAndWrongPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("ahsan", "xyz");
		Assert.assertTrue( status.isLoginSuccess() == false );
    }

	@Test
	public void testFailCorrectUsernameAndCorrectPasswordAndEmptyValCode()
    {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		if (status.isLoginSuccess()) {
			
			Assert.assertTrue( LoginForm.validateCode(null) == false );
        }
		
    }
	
	@Test
	public void testFailCorrectUsernameAndCorrectPasswordAndWrongValCode()
    {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		if (status.isLoginSuccess()) {
			
			Assert.assertTrue( LoginForm.validateCode("xyz") == false );
        }
		
    }
	
	@Test
	public void testFailCorrectUsernameAndCorrectPasswordAndCorrectValCode()
    {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		if (status.isLoginSuccess()) {
			
			Assert.assertTrue( LoginForm.validateCode("123456") == true );
        }
		
    }
	
}
