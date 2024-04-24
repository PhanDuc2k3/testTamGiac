import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testTamGiac {
    
    @Test
    public void testIsTamGiac() {
        assertTrue(tamgiac.isTamGiac(3, 4, 5)); // Tam giác vuông
        assertTrue(tamgiac.isTamGiac(5, 5, 5)); // Tam giác đều
        assertTrue(tamgiac.isTamGiac(5, 5, 8)); // Tam giác cân
        assertFalse(tamgiac.isTamGiac(1, 1, 10)); // Không phải tam giác
    }
    
    @Test
    public void testXacDinhLoaiTamGiac() {
        assertEquals("Tam giác vuông", tamgiac.xacDinhLoaiTamGiac(3, 4, 5));
        assertEquals("Tam giác đều", tamgiac.xacDinhLoaiTamGiac(5, 5, 5));
        assertEquals("Tam giác cân", tamgiac.xacDinhLoaiTamGiac(5, 5, 8));
        assertEquals("Tam giác thường", tamgiac.xacDinhLoaiTamGiac(7, 8, 9));
    }
}
