package com.example;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;



public class AppTest {

	

	 @Test
	 public void testReturnTestAndTestAEqualB() {
		//creating mock object
	     AppDependency appDependencymock = PowerMockito.mock(AppDependency.class);
	     

        // defining behaviour for mock object
        when(appDependencymock.testMethod()).thenReturn("Test");
        
        // injecting mock  into service thru constructor
        App app = new App(appDependencymock);
        
	     // Call the method
	     int result = app.testme(2);
	
	     // Assert behavior
	     assertEquals(2, result);  
	     // test covered 
	     // if a == b
	     // if the method return Test
	 }
	 
	 @Test
	 public void testReturnNotTestAndTestANotEqualB() {
		//creating mock object
	     AppDependency appDependencymock = PowerMockito.mock(AppDependency.class);
	     

        // defining behaviour for mock object
        when(appDependencymock.testMethod()).thenReturn("Tedst");
        
        // injecting mock  into service thru constructor
        App app = new App(appDependencymock);
        
	     // Call the method
	     int result = app.testme(3);
	
	     // Assert behavior
	     assertNotEquals(3, result);  
	     // test covered 
	     // if a == b
	     // if the method return Test
	 }
}