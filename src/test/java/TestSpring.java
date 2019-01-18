import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.Book_typeService;

/**
 * @time: 2019/1/17 10:10
 * @desc:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public  class TestSpring {
    @Autowired
    private Book_typeService service;
    
    @Test
    public void testSpring() {
        System.out.println(service.selectByPrimaryKey(1).getTypeName());
    }
}
