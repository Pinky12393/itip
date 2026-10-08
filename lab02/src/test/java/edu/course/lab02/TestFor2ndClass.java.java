package edu.course.lab02;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
class TestFor2ndClass{
    @Test
    void testforcreate(){
        double[] line = {123,233,3333,2113,444};
        DataSample exemplar_1 = new DataSample("id-1","cat",SampleStatus.NEW, line);
    }
    @Test
    void Testforinvariants(){
        double[] line = {123,33,3231,3213,33};
        assertThrows(NullPointerException.class, () -> new DataSample("", "cat", SampleStatus.NEW, line));
    }
    @Test
    void Testforinvariants1(){
        double[] line = {123,33,3231,3213,33};
        assertThrows(NullPointerException.class, () -> new DataSample(null, "cat", SampleStatus.NEW, line));
    }
    @Test
    void Testforinvariants2(){
        double[] line = {123,33,3231,3213,33};
        assertThrows(NullPointerException.class, () -> new DataSample("id-1", "", SampleStatus.NEW, line));
    }
    @Test
    void Testforinvariants3(){
        double[] line = {123,33,3231,3213,33};
        assertThrows(NullPointerException.class, () -> new DataSample("id-1", null, SampleStatus.NEW, line));
    }
    @Test
    void Testforinvariants4(){
        double[] line = {123,33,3231,3213,33};
        assertThrows(NullPointerException.class, () -> new DataSample("", "cat", null, line));
    }
    @Test
    void Testforinvariants5(){
        double[] line = {123,33,3231,3213,33};
        assertThrows(NullPointerException.class, () -> new DataSample("", "cat", SampleStatus.NEW, null));
    }
    @Test
    void testforready(){
        double[] line = {123,233,3333,2113,444};
        DataSample exemplar_1 = new DataSample("id-1","cat",SampleStatus.NEW, line);
        boolean result = exemplar_1.checkready();
        assertFalse(result);
    }
    @Test
    void testforready1() {
        double[] line = {123, 233, 3333, 2113, 444};
        DataSample exemplar_1 = new DataSample("id-1", "cat", SampleStatus.READY, line);
        boolean result = exemplar_1.checkready();
        assertTrue(result);
    }
    @Test
    void tesforchangestatus(){
        double[] line = {123,33,313,111,441,444};
        DataSample exemplar = new DataSample("id-1","cat", SampleStatus.NEW, line);
        exemplar.changeStatus(SampleStatus.READY);
        boolean result = exemplar.checkready();
        assertTrue(result);
    }
    @Test
    void testforaverage(){
        double[] line = {8,4,8,4};
        DataSample exemplar = new DataSample("id-1","cat", SampleStatus.NEW, line);
        assertEquals(6,exemplar.averagee());
    }
}