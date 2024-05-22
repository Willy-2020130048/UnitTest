import com.mycompany.mavenproject1.Item;
import org.junit.jupiter.api.Test;

public class ItemTest {
    @Test
    public void testItemConstructor() {
        Item item = new Item("Indomie", "Makanan", 100, 5000);
        assert (item.getNama().equals("Indomie"));
        assert (item.getKategori().equals("Makanan"));
        assert (item.getJumlah() == 100);
        assert (item.getHarga() == 5000);
    }

    @Test
    public void testItemToString() {
        Item item = new Item("Mie Kuah", "Makanan", 25, 5500);
        assert (item.toString().equals("Nama: "+item.getNama()+
                                        "\n Kategori: "+item.getKategori()+
                                        "\n Jumlah: "+item.getJumlah()+
                                        "\n Harga: "+item.getHarga()));
    }
}
