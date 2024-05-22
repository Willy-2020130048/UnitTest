import com.mycompany.mavenproject1.Kontak;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class KontakTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testKontak() {
        Kontak kontak = new Kontak("Willy","081222490942");
        assert (kontak.getNama().equals("Willy"));
        assert (kontak.getNomorTelepon().equals("081222490942"));
    }

    @Test
    void testKontakToString() {
        Kontak kontak = new Kontak("Willy","081222490942");
        assert (kontak.toString().equals("\nNama: "+kontak.getNama()+"\nNomor Telepon: "+ kontak.getNomorTelepon()+"\n"));
    }

}
