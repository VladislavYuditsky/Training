//Составить программу для вычисления пути, пройденного лодкой, если её скорость в стоячей воде v км/ч,
// скорость течения реки v1 км/ч, время движения по озер t1 ч, а против течения реки - t2 ч.

public class Task31 {
    public static void main(String[] args) {
        int v = 10;
        int v1 = 5;
        double t1 = 0.5;
        double t2 = 1;
        System.out.println("S = " + (v*t1+(v-v1)*t2) + " км");
    }
}
