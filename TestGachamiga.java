import practica.v2.Gachamiguero2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGachamiga {
    @Test
    public void TestMultiplo3(){
        String result = GachamigueroV2.cocinarGachamiga(6);
        Assertions.assertEquals("Gacha", result);
    }

    @Test
    public void TestMultiplo5(){
        String result = GachamigueroV2.cocinarGachamiga(5);
        Assertions.assertEquals("Miga", result);
    }
}
