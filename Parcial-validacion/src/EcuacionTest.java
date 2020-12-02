import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EcuacionTest {
	
				//Casos de Prueba
@Test
//Ecuacion1 
	public void TestEc1() throws Exception {
		ecuacion ec1 = new ecuacion (0);
		assertEquals(ec1.ecuacion1(7), 0.0 );
	}	
@Test
//Ecuacion 2
	public void TestEc2() throws Exception {
		ecuacion ec2 = new ecuacion (1, -3);
		assertEquals(ec2.ecuacion1(-1), 2.0 );
}
@Test
//Ecuacion 3
	public void TestEc3() throws Exception {
		ecuacion ec3 = new ecuacion (2,9,1);
		assertEquals(ec3.ecuacion1(6), 487.0 );
	}
@Test
//Ecuacion 4
	public void TestEc4() throws Exception {
		ecuacion ec4 = new ecuacion (7,2,9);
		assertEquals(ec4.ecuacion1(1), 18.0 );
}
@Test
//Ecuacion 5 asercion
public void TestEc5() throws Exception {
	ecuacion ec5 = new ecuacion(-1);
	Assertions.assertThrows(Exception.class, ()->ec5.ecuacion2(2));
}
@Test
//Ecuacion 6
public void TestEc6() throws Exception {
	ecuacion ec6 = new ecuacion (16,-4);
	assertEquals(ec6.ecuacion2(1), 0.0 );
}
@Test
//Ecuacion 7
public void TestEc7() throws Exception {
	ecuacion ec7 = new ecuacion (9, -3, 0);
	assertEquals(ec7.ecuacion2(5), 0.0);
}
//Ecuacion 8
@Test	
public void TestEc8() throws Exception {
	ecuacion ec8 = new ecuacion (4,3,0,1);
	equals(ec8.ecuacion2(0));
}
}
