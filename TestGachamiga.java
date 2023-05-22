import practica.v2.Gachamiguero2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGachamiga1 {
    @Test
    public void testFor1() {
        Gachamiguero2 test = new Gachamiguero2();
        String result = test.obtenerGachamiga(1);
        Assertions.assertEquals("1", result);
    }

    @Test
    public void testFor2(){
        Gachamiguero2 test = new Gachamiguero2();
        String result = test.obtenerGachamiga(2);
        Assertions.assertEquals("2", result);
    }

    @Test
    public void testFor3(){
        Gachamiguero2 test = new Gachamiguero2();
        String result = test.obtenerGachamiga(3);
        Assertions.assertEquals("Gacha", result);
    }

    @Test
    public void testFor4(){
        Gachamiguero2 test = new Gachamiguero2();
        String result = test.obtenerGachamiga(4);
        Assertions.assertEquals("4", result);
    }

    @Test
    public void testFor5(){
        Gachamiguero2 test = new Gachamiguero2();
        String result = test.obtenerGachamiga(5);
        Assertions.assertEquals("Miga", result);
    }
}