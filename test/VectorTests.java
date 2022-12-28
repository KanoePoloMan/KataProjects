import Vectors.Vector;
//import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VectorTests {

    public VectorTests(int x, int y, int z) {
    }

    Vector vector = new Vector(2, 3, 4);

    @org.junit.jupiter.api.Test
    public void testVectorsLength() {
        assertEquals(5.09D, vector.VectorsLength());
    }

    @org.junit.jupiter.api.Test
    public void testScalarComposition() {
        assertEquals(29, vector.ScalarComposition(vector));
    }

    @org.junit.jupiter.api.Test
    public void testVectorComposition() {
        assertEquals(new Vector(0, 0, 0), vector.VectorComposition(vector));
    }

    @org.junit.jupiter.api.Test
    public void testVectorsAngle() {
        assertEquals(1.0, vector.VectorsAngle(vector));
    }

    @org.junit.jupiter.api.Test
    public void testVectorSumm() {
        assertEquals(new Vector(4, 6, 8), vector.VectorSumm(vector));
    }

    @org.junit.jupiter.api.Test
    public void testVectorDifference() {
        assertEquals(new Vector(0, 0, 0), vector.VectorDifference(vector));
    }

    @org.junit.jupiter.api.Test
    public void testRandomVectors() {
        int n = 5;
        assertEquals(new int[n][].length, vector.RandomVectors(n).length);
    }

    @org.junit.jupiter.api.Test
    public void allTests() {
        VectorTests vc = new VectorTests(2, 3, 4);

        vc.testVectorsLength();
        vc.testScalarComposition();
        vc.testVectorComposition();
        vc.testVectorsAngle();
        vc.testVectorSumm();
        vc.testVectorDifference();
        vc.testRandomVectors();
    }
}
