import com.mycompany.mavenproject1.Item;
import com.mycompany.mavenproject1.ManajemenInventaris;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ManajemenInventarisTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testSearchItem() {
        ManajemenInventaris mi = new ManajemenInventaris();
        Item item = new Item("Mie Goreng", "Makanan", 100, 10);
        mi.addItem(item);
        assert (mi.searchItem("Mie Goreng").equals(item));
        Assert.assertEquals("Item berhasil ditambahkan.", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testDeleteItemFound() {
        ManajemenInventaris mi = new ManajemenInventaris();
        Item item = new Item("Mie Goreng", "Makanan", 100, 10);
        mi.addItem(item);
        mi.deleteItem(item.getNama());
        assert (mi.searchItem("Mie Goreng") == null);
        Assert.assertEquals("Item berhasil ditambahkan.\n"+ "Item berhasil dihapus.",
                outputStreamCaptor.toString().trim());
    }

    @Test
    public void testDeleteItemNotFound() {
        ManajemenInventaris mi = new ManajemenInventaris();
        mi.deleteItem("Mie Goreng");
        Assert.assertEquals("Item tidak ditemukan.", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testDisplayItemsFound() {
        ManajemenInventaris mi = new ManajemenInventaris();
        Item item1 = new Item("Mie Goreng", "Makanan", 15, 5000);
        Item item2 = new Item("Mie Kuah", "Makanan", 10, 6000);
        mi.addItem(item1);
        mi.addItem(item2);
        mi.displayItems();
        Assert.assertEquals("Item berhasil ditambahkan.\n"+ "Item berhasil ditambahkan.\n"
                + item1 + "\n" + item2,
                outputStreamCaptor.toString().trim());

    }

    @Test
    public void testDisplayItemsNotFound() {
        ManajemenInventaris mi = new ManajemenInventaris();
        mi.displayItems();
        Assert.assertEquals("Daftar item kosong.", outputStreamCaptor.toString().trim());
    }

}
