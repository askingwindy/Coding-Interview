package hry.interview.jianzhiOffer.test;

import static org.junit.Assert.*;
import hry.interview.jianzhiOffer.Q4ReplaceBlank;

import org.junit.Before;
import org.junit.Test;

public class Q4ReplaceBlankTest {

	private Q4ReplaceBlank q4 = new Q4ReplaceBlank();
	
	private String helper(String string){
		if(string == null || string.length()==0){
			return string;
		}
		char[] array = new char[100];
	    for(int i=0; i<string.length(); i++){
	    	array[i] = string.charAt(i);
	    }
	    q4.replaceBlank(array);
	    StringBuilder rst = new StringBuilder();
	    for(int i=0; i<array.length; i++){
	    	if(array[i] == '\0'){
	    		break;
	    	}
	    	rst.append(array[i]);
	    }
	    return rst.toString();
	}
	@Test
	public void test1() {
		String string = helper("hello world");
		assertEquals("hello%20world",string);
	}
	@Test
	public void test2() {
		String string = helper(" helloworld");
		assertEquals("%20helloworld",string);
	}
	@Test
	public void test3() {
		String string = helper("helloworld ");
		assertEquals("helloworld%20",string);
	}
	@Test
	public void test4() {
		String string = helper("hello  world");
		assertEquals("hello%20%20world",string);
	}
	@Test
	public void test5() {
		String string = helper(null);
		assertEquals(null,string);
	}
	@Test
	public void test6() {
		String string = helper("");
		assertEquals("",string);
	}
	@Test
	public void test7() {
		String string = helper(" ");
		assertEquals("%20",string);
	}
	@Test
	public void test8() {
		String string = helper("helloworld");
		assertEquals("helloworld",string);
	}
	@Test
	public void test9() {
		String string = helper("   ");
		assertEquals("%20%20%20",string);
	}
}
