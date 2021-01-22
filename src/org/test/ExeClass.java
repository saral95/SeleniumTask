package org.test;



public class ExeClass extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		loadBrowser();
		launchUrl("https://www.facebook.com/");
		Pojo l=new Pojo();
		fill(l.getEmail(),"asifsarams@gmail.com");
		fill(l.getPass(),"saraldaisyanar");
		btnClick(l.getLoginbtn());
		
	}
	

}
