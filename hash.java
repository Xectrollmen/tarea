public class HashFunction {
    // Valor constante A
    private static final double A = (Math.sqrt(5) - 1) / 2;

    // buckets
    private static final int BUCKETS = 10;

    // calcular el hash
    public static int Hash(int k) {
        // Calcula el valor hash
        double hashValue = BUCKETS * ((k * A) % 1);
        
        // Redondeamos para abajo
        return (int) Math.floor(hashValue);
    }

    public static void main(String[] args) {
        // pruebas
        int[] keys = {123, 456, 789, 101, 202};
        
        // Mostrar los resultados
        for (int key : keys) {
            int hash = Hash(key);
            System.out.println("Clave: " + key + " -> Hash: " + hash);
        }
    }
}
