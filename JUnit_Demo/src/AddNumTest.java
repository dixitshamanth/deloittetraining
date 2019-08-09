import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddNumTest {

	@Test
	void testSum() {
		AddNum addNum=new AddNum();
		assertEquals(20, addNum.sum(5, 10, 5));
	}

	@Test
	void testSum1() {
		AddNum addNum=new AddNum();
		assertEquals(20, addNum.sum(-20, 20, 20));
	}

	@Test
	void testSum2() {
		AddNum addNum=new AddNum();
		assertEquals(0, addNum.sum(-2, -2, -2));
	}

}
