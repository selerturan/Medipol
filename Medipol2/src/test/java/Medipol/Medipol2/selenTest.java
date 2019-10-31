import org.junit.*;

import junit.framework.Assert;

public class selenTest  {

	public void testTopla() {
		String sayi1 = "100.50";
		String sayi2 = "42.3";
		String sonuc = selen.topla(sayi1, sayi2);
		Assert.assertEquals("142.80", sonuc);
	}
	public void testToplaBuyukSayılar() {
		String sayi1 = "100000000000000000000000";
		String sayi2 = "100000000000000000000042";
		String sonuc = selen.topla(sayi1, sayi2);
		Assert.assertEquals("2000000000000000000000042", sonuc);
	}
}
