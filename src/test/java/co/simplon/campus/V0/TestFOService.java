package co.simplon.campus.V0;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import campus.V0.Populate;
import campus.V0.domain.application.IFrontOfficeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestFOService {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Autowired
	IFrontOfficeService frontOfficeService;

	@Autowired
	Populate populate;

	@Before
	public void setUp() throws Exception {
		populate.nettoiePuisCree();
	}

	@After
	public void tearDown() throws Exception {
		populate.nettoyage();
	}
	
	@Test
	public void testmettreAjourEmail() {
		
	}

}
