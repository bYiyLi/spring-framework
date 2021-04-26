import com.google.gson.Gson;
import entity.Bean1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class InitTest {
	public static void main(String[] args) {
		System.out.println("==");
	}
	@Test
	public void test1(){
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("init.xml"));
		Bean1 o = (Bean1) factory.getBean("bean1");
		System.out.println(new Gson().toJson(o));
	}
}
