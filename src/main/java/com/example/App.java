package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
	private AppDependency dependency;
	public App(){}
	
	public App(AppDependency dependency) {
        this.dependency = dependency;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App test = new App();

    	test.testme(1);
	}
    
    public int testme(int a) {
    	
    	int f =0;
		int b = 2;
		if(a == b) {
			f = a;
			
			System.out.println("test");
		}
		
		if(dependency.testMethod() == "Test") {
			System.out.println("test");
		}
		return f;
    }
    
    
    // note to display the coverage in the html file execute this : mvn clean verify
    
}
