import com.egecius.androidlibrary.AndroidLibrary;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Single Responsibility:
 *
 * //todo
 */
public class AndroidLibraryTest {

	@Test
	public void failingTest() {
		AndroidLibrary library = new AndroidLibrary();

		String field = library.getField();

		assertEquals("nonsense", field);
	}

	@Test
	public void passingTest() {
		AndroidLibrary library = new AndroidLibrary();
		String field = library.getField();
		assertEquals("Android Library field", field);
	}
}
