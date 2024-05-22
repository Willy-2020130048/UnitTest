import com.mycompany.mavenproject1.Anjing;
import com.mycompany.mavenproject1.Kucing;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class KucingTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void kucingTest() {
        Kucing kucing = new Kucing("Biru", "Dimas", 2);
        assert (kucing.getWarnaBulu().equals("Biru"));
        assert (kucing.getNama().equals("Dimas"));
        assert (kucing.getUmur() == 2);
        assert (kucing.suara().equals("Meong"));
    }

    @Test
    public void testInfo(){
        Kucing kucing = new Kucing("Biru", "Dimas", 2);
        kucing.info();
        Assert.assertEquals("Nama: "+ kucing.getNama() + ", Umur: "+ kucing.getUmur() + " tahun" + "\nWarna Bulu: "+ kucing.getWarnaBulu(),
                outputStreamCaptor.toString().trim());
    }
}
