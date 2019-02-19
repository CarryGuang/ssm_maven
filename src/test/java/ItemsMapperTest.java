import com.chengguang.dao.ItemsDao;
import com.chengguang.daomain.Items;
import com.chengguang.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsMapperTest {
    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
       /* ItemsDao dao = ac.getBean(ItemsDao.class);
      ///  ItemsDao dao = (ItemsDao) ac.getBean("itemsDao");
        Items items = dao.findById(1);
        System.out.println(items);*/
        ItemsService service = ac.getBean(ItemsService.class);
        Items items = service.findById(1);
        System.out.println(items);
    }
}
