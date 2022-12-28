package Vectors;

public class Vector {
    private int x, y, z;
    public Vector(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;

    }
    public double VectorsLength() {
        int toInt = (int)Math.sqrt(x * x + y * y + z * z) * 100;
        return (double)toInt / 100 ;
    }

    public int ScalarComposition(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector VectorComposition(Vector vector) {
        return new Vector (y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
    }

    public double VectorsAngle(Vector vector) {
        return ScalarComposition(vector) / (VectorsLength() * vector.VectorsLength());
    }

    public Vector VectorSumm(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    public Vector VectorDifference(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    public int[][] RandomVectors(int N) {
        int vectCounter = 0;
        int[][] vectorArray = new int[N][3];

        for (int i = 0; i < N ; i++) {
            for (int j = 0; j < 3; j++) {
                vectorArray[i][j] = (int) Math.random();
            }
        }
        return vectorArray;
    }
}
