import com.mycompany.mavenproject1.Anjing;
import com.mycompany.mavenproject1.Kucing;
import com.mycompany.mavenproject1.Service;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ServiceTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testPilihanMenu1() {
        Service service = new Service();
        service.PilihanMenu1();
        Assert.assertEquals("Luas: 15\nKeliling: 16", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testPilihanMenu2() {
        Service service = new Service();
        service.PilihanMenu2();
        Assert.assertEquals("2 adalah bilangan prima: true", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testPilihanMenu3() {
        Service service = new Service();
        service.PilihanMenu3();
        Assert.assertEquals("Array yang terurut: [1, 2, 2, 3, 4, 5]", outputStreamCaptor.toString().trim());
    }

//    @Test
//    public void testPilihanMenu4() {
//        Service service = new Service();
//        service.PilihanMenu4();
//        String input = "5";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        Assert.assertEquals("\nMenu:\n1. Tambah Kontak\n2. Cari Kontak\n3. Hapus Kontak\n4. Tampilkan Semua Kontak\n5. Keluar\nPilih opsi: \n", outputStreamCaptor.toString().trim());
//    }

    @Test
    public void testPilihanMenu6() {
        Service service = new Service();
        service.PilihanMenu6();
        Anjing anjing = new Anjing("Buddy", "Golden Retriever", 3);
        Kucing kucing = new Kucing("Milo", "Putih", 2);
        Assert.assertEquals("Informasi Anjing:\n"+
                "Nama: "+ anjing.getNama() + ", Umur: "+ anjing.getUmur() + " tahun" + "\nJenis Ras: "+ anjing.getRas() +"\n"+
                "Suara: "+ anjing.suara() + "\n" +
                "\nInformasi Kucing:\n"+
                "Nama: "+ kucing.getNama() + ", Umur: "+ kucing.getUmur() + " tahun" + "\nWarna Bulu: "+ kucing.getWarnaBulu() +"\n"+
                "Suara: "+ kucing.suara()
                ,outputStreamCaptor.toString().trim());
    }
}
