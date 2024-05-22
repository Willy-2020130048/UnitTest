import com.mycompany.mavenproject1.Kontak;
import com.mycompany.mavenproject1.ManajemenKontak;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ManajemenKontakTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testAddKontak() {
        ManajemenKontak mk = new ManajemenKontak();
        Kontak kontak = new Kontak("Willy", "081222490942");
        mk.addKontak(kontak);
        assert (mk.getKontak().contains(kontak));
        Assert.assertEquals("Kontak berhasil ditambahkan.", outputStreamCaptor.toString().trim());
    }

    @Test
    public void searchKontakNotFound() {
        ManajemenKontak mk = new ManajemenKontak();
        assert (mk.searchKontak("Willy") == null);
    }

    @Test
    public void searchKontakFound() {
        ManajemenKontak mk = new ManajemenKontak();
        Kontak kontak = new Kontak("Willy", "081222490942");
        mk.addKontak(kontak);
        assert (mk.searchKontak("Willy") == kontak);
    }

    @Test
    public void deleteKontakNotFound() {
        ManajemenKontak mk = new ManajemenKontak();
        mk.deleteKontak("Willy");
        Assert.assertEquals("Kontak tidak ditemukan.", outputStreamCaptor.toString().trim());
    }

    @Test
    public void deleteKontakFound() {
        ManajemenKontak mk = new ManajemenKontak();
        Kontak kontak = new Kontak("Willy", "081222490942");
        mk.addKontak(kontak);
        mk.deleteKontak("Willy");
        assert (!mk.getKontak().contains(kontak));
        Assert.assertEquals("Kontak berhasil ditambahkan.\nKontak berhasil dihapus.", outputStreamCaptor.toString().trim());
    }

    @Test
    public void displayKontakNotFound() {
        ManajemenKontak mk = new ManajemenKontak();
        mk.displayKontak();
        Assert.assertEquals("Daftar kontak kosong.", outputStreamCaptor.toString().trim());
    }

    @Test
    public void displayKontakFound() {
        ManajemenKontak mk = new ManajemenKontak();
        Kontak kontak1 = new Kontak("Willy", "081222490942");
        Kontak kontak2 = new Kontak("Bintang", "081212345678");
        mk.addKontak(kontak1);
        mk.addKontak(kontak2);
        mk.displayKontak();
        Assert.assertEquals("Kontak berhasil ditambahkan.\n" +
                "Kontak berhasil ditambahkan.\n" +
                "Nama: " + kontak1.getNama() + "  Nomor Telephon: " + kontak1.getNomorTelepon() + "\n" +
                "Nama: " + kontak2.getNama() + "  Nomor Telephon: " + kontak2.getNomorTelepon(), outputStreamCaptor.toString().trim());
    }

}
