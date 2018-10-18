/*package com.mindty.ddbb;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.mindty.ddbb.BBDD;



public class DDBBTest {
@Test
	public void testUsuarioOkContrase�aOk(){
		
		boolean isOK = BBDD.getInstance().AnalisisLogin("Youssef","Youssef");
		assertTrue(isOK);
	}

@Test
public void testUsuarioErrContrase�aStringErr(){
	
	boolean isOK = BBDD.getInstance().AnalisisLogin("Feota","Si lo es");
	assertTrue(isOK);
}
@Test
public void testUsuarioNContrase�aN(){
	
	boolean isOK = BBDD.getInstance().AnalisisLogin("","");
	assertTrue(isOK);
}
@Test
public void testUsuarioNullContrase�aNull(){
	
	boolean isOK = BBDD.getInstance().AnalisisLogin("null","null");
	assertTrue(isOK);
}
@Test
public void testUsuarioNumContrase�aNum(){
	
	boolean isOK = BBDD.getInstance().AnalisisLogin("25","1");
	assertTrue(isOK);
}
@Test
public void testUsuarioMinContrase�aMin(){
	
	boolean isOK = BBDD.getInstance().AnalisisLogin("youssef","youssef");
	assertTrue(isOK);
}

//@Test
//public void testUpdateBBDDsalvado(){
//	Amigo miAmigo =DDBB.getInstance().getAmigo1(2);
//			
//	
//	assertTrue(miAmigo);
//}



}*/
