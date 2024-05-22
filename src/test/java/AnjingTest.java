import com.mycompany.mavenproject1.Anjing;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnjingTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testAnjing() {
        Anjing anjing = new Anjing("Husky", "Bolang", 1);
        assert (anjing.getRas().equals("Husky"));
        assert (anjing.getNama().equals("Bolang"));
        assert (anjing.getUmur() == 1);
        assert (anjing.suara().equals("Gok gok"));
    }
    @Test
    public void testInfo(){
        Anjing anjing = new Anjing("Husky", "Bolang", 1);
        anjing.info();
        Assert.assertEquals("Nama: "+ anjing.getNama() + ", Umur: "+ anjing.getUmur() + " tahun" + "\nJenis Ras: "+ anjing.getRas(),
                            outputStreamCaptor.toString().trim());
    }
}
