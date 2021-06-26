import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOG = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        int x = 5;
        char a = 'a';
        //критичность уменьшается снизу вверх
        LOG.trace("x={}, a={}", x, a);
        /*LOG.debug("x={}",x);
        LOG.info("Пользователь зашел на сервер");
        LOG.warn("x={}",x);
        LOG.error("x={}",x);
        LOG.fatal("x={}",x);*/
    }
}
