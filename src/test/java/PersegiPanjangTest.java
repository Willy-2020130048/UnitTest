import com.mycompany.mavenproject1.PersegiPanjang;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PersegiPanjangTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testPersegiPanjang(){
        PersegiPanjang persegi = new PersegiPanjang(2,3);
        assert (persegi.hitungKeliling() == 10);
        assert (persegi.hitungLuas() == 6);
    }

    @Test
    void testPrintHasil(){
        PersegiPanjang persegi = new PersegiPanjang(2,3);
        persegi.printHasil();
        Assert.assertEquals("Luas: " + persegi.hitungLuas() + "\nKeliling: " + persegi.hitungKeliling(),
                outputStreamCaptor.toString().trim());
    }
}
