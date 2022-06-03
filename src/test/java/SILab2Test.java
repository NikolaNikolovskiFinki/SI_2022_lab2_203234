import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.Arrays;

public class SILab2Test {
    @Test
    public void testEveryStatement(){
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(new ArrayList<>()));
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(Arrays.asList("0", "#", "#")));
        assertArrayEquals(new String[]{"#", "2", "#", "#", "2", "1", "#", "3", "#", "1", "3", "#", "#", "2", "#", "2"},
                SILab2.function(
                        Arrays.asList("#", "0", "#", "#",
                                "0", "0", "#", "0",
                                "#", "0", "0", "#",
                                "#", "0", "#", "0")).toArray(new String[16]));
    }

    @Test
    public void testEveryBranch(){
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(new ArrayList<>()));
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(Arrays.asList("0", "#", "#")));
        assertArrayEquals(new String[]{"#", "2", "#", "#", "2", "1", "#", "3", "#", "1", "3", "#", "#", "2", "#", "2"},
                SILab2.function(
                        Arrays.asList("#", "0", "#", "#",
                                "0", "0", "#", "0",
                                "#", "0", "0", "#",
                                "#", "0", "#", "0")).toArray(new String[16]));

    }
}
