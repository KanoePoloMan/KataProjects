package Vectors;

import java.text.DecimalFormat;

public class Vector {
    private double x, y, z;
    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;

    }
    public double VectorsLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double ScalarComposition(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public double[] VectorComposition(Vector vector) {
        return new double[]{y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x};
    }

    public double VectorsAngle(Vector vector) {
        return ScalarComposition(vector) / (VectorsLength() * vector.VectorsLength());
    }

    public double[] VectorSumm(Vector vector) {
        return new double[]{x + vector.x, y + vector.y, z + vector.z};
    }

    public double[] VectorDifference(Vector vector) {
        return new double[]{x - vector.x, y - vector.y, z - vector.z};
    }

    public double[][] RandomVectors(int N) {
        double[][] vectors = new double[N][];
        for (int i = 0; i < N ; i++) {
            for (int j = 0; j < 3; j++) {
                vectors[i][j] = Math.random() * 10;
            }
        }
        return vectors;
    }
}
