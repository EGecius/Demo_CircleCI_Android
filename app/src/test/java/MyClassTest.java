import com.egecius.demo_circleci_android.MyClass;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Single Responsibility:
 *
 * //todo
 */
public class MyClassTest {

	@Test
	public void firsTest() {
		MyClass myClass = new MyClass();
		assertEquals(myClass.name, "Egis");
	}

	@Test
	public void passingSurnameTest() {
		MyClass myClass = new MyClass();
		assertEquals(myClass.surname, "Gecius");
	}

	@Test
	public void failingTest() {
		MyClass myClass = new MyClass();
		assertEquals(myClass.surname, "Dzigajevas");
	}


}
