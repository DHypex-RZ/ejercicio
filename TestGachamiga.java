import practica.v2.Gachamiguero2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class  TestGachamiga {
    @Test
    public void TestMultiplo3(){
        Gachamiguero2 test = new Gachamiguero2();
        String result = test.obtenerGachamiga(6);
        Assertions.assertEquals("Gacha", result);
    }

    @Test
    public void TestMultiplo5(){
        Gachamiguero2 test = new Gachamiguero2();
        String result = test.obtenerGachamiga(5);
        Assertions.assertEquals("Miga", result);
    }
}
