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

    @Test
    public void testFor6(){
        Gachamiguero2 test = new Gachamiguero2();
        String result = test.obtenerGachamiga(6);
        Assertions.assertEquals("Gacha", result);
    }

    @Test
    public void testFor7(){
        Gachamiguero2 test = new Gachamiguero2();
        String result = test.obtenerGachamiga(7);
        Assertions.assertEquals("7", result);
    }

    @Test
    public void testFor8(){
        Gachamiguero2 test = new Gachamiguero2();
        String result = test.obtenerGachamiga(8);
        Assertions.assertEquals("8", result);
    }

    @Test
    public void testFor9(){
        Gachamiguero2 test = new Gachamiguero2();
        String result = test.obtenerGachamiga(9);
        Assertions.assertEquals("Gacha", result);
    }

    @Test
    public void testFor10(){
        Gachamiguero2 test = new Gachamiguero2();
        String result = test.obtenerGachamiga(10);
        Assertions.assertEquals("Miga", result);
    }

    @Test
    public void testFor11(){
        Gachamiguero2 test = new Gachamiguero2();
        String result = test.obtenerGachamiga(11);
        Assertions.assertEquals("11", result);
    }

    @Testgit
    public void testFor12(){
        Gachamiguero2 test = new Gachamiguero2();
        String result = test.obtenerGachamiga(12);
        Assertions.assertEquals("Gacha", result);
    }

    public void testFor13(){
        Gachamiguero2 test = new Gachamiguero2();
        String result = test.obtenerGachamiga(13);
        Assertions.assertEquals("13", result);
    }

    @Test
    public void testFor14(){
        Gachamiguero2 test = new Gachamiguero2();
        String result = test.obtenerGachamiga(14);
        Assertions.assertEquals("14", result);
    }

    @Test
    public void testFor15(){
        String result = GachamigueroV2.cocinarGachamiga(15);
        Assertions.assertEquals("Gachamiga", result);
    }
}