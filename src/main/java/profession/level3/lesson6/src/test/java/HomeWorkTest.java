import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

class HomeWorkTest {

    @Test
    void refactorMassElementNotFound() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 2, 3, 5, 1, 7));
        Assertions.assertThrows(RuntimeException.class, () -> HomeWork.refactorMass(arr));
    }

    @Test
    void refactorMass(){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 4, 2, 2, 3, 5, 1, 7));
        ArrayList<Integer> expectedArr = new ArrayList<>(Arrays.asList(2, 2, 3, 5, 1, 7));
        Assertions.assertEquals(expectedArr, HomeWork.refactorMass(arr));
    }

    @Test
    void refactorMassElementNotFound2() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 4, 4, 4));
        Assertions.assertThrows(RuntimeException.class, () -> HomeWork.refactorMass(arr));
    }

    @Test
    void refactorMassElementNotFound3() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList());
        Assertions.assertThrows(RuntimeException.class, () -> HomeWork.refactorMass(arr));
    }

    @Test
    void checkArray() {
        int[] arr = new int[]{1,3,4,5};
        Assertions.assertEquals(true, HomeWork.checkArray(arr));
    }

    @Test
    void checkArray2() {
        int[] arr = new int[]{1,1,1,1};
        Assertions.assertEquals(true, HomeWork.checkArray(arr));
    }

    @Test
    void checkArray3() {
        int[] arr = new int[]{4,4,4,4};
        Assertions.assertEquals(true, HomeWork.checkArray(arr));
    }

    @Test
    void checkArray4() {
        int[] arr = new int[]{2,3,5,5};
        Assertions.assertEquals(false, HomeWork.checkArray(arr));
    }

    @Test
    void checkArray5() {
        int[] arr = null;
        Assertions.assertEquals(false, HomeWork.checkArray(arr));
    }
}