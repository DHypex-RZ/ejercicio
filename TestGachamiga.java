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
}