import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat beanFirstCat =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanFirstCat.getMessage());

        Cat beanSecondCat =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanFirstCat.getMessage());

        System.out.println(bean == bean2);
        System.out.println(beanFirstCat == beanSecondCat);
    }
}