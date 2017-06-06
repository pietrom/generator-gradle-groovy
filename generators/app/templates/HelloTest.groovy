package <%= groupId %>.hello

import org.junit.*

public class HelloTest {
	@Test
	def void shouldSayHelloWorld() {
		def sut = new Hello();
		Assert.assertEquals("Hello, World!", sut.sayHello());
	}
}