import java.util.Random;
import java.lang.Math;

public class Main {
    private  static final short minArrayk=5;
    private  static final short maxArrayk=21;

    private static final float minArrayx=-15.0f;
    private static final float maxArrayx=7.0f;

    private static final int rowsArrayp=9;
    private static final int columnsArrayp=18;

    public static void main (String[] args) {

        short[]k = new short[(maxArrayk - minArrayk) / 2 + 1];
        k=makeK(k,maxArrayk,minArrayk);
        printArrayk(k);

        float[]x = new float[18];
        x=makeX(x,maxArrayx,minArrayx);
        printArrayx(x);

        double [][]p = new double[rowsArrayp][columnsArrayp];
        p=makeP(p,k,x);
        printArrayp(p);
    }

    public static short[] makeK (short []k,short maxArrayk, short minArrayk){
        int index = 0;
        for(short i = maxArrayk; i>= minArrayk; i--){
            if(i%2==1){
                k[index]=i;
                index++;
            }
        }
        return k;
    }
    private static void printArrayk(short []k){
        System.out.println("First array: ");
        for(short value : k) {
            System.out.print(value + " ");
        }
        System.out.println("\n");
    }

    public static float[] makeX(float []x, float maxArrayx, float minArrayx){
        Random random = new Random();
        for(int i=0; i<18; i++){
            x[i]=minArrayx+random.nextFloat()*(maxArrayx-minArrayx); //.nextFloat: Returns a random number from 0.0 to 1.0
        }
        return x;
    }
    private static void printArrayx(float []x){
        System.out.println("Second array: ");
        for(float value: x){
            System.out.format("%.4f " ,value);   //Print the resulting array in four decimal places
        }
        System.out.println("\n");
    }

    public static double[][] makeP (double [][]p,short []k, float []x){
        for(int i=0;i<rowsArrayp;i++){
            for (int j =0;j<columnsArrayp;j++){
                float x1=x[j];
                switch (k[i]){
                    case 13:
                        p[i][j]= Math.pow(Math.pow(((1/4)/((((1/4)-x1)/2)+4)),x1/(x1+1)),2*Math.cbrt(Math.pow(x1/(x1-1),x1)));
                        break;
                    case 5,7,15,17:
                        p[i][j]= Math.cos(2*Math.atan((x1-4)/22));
                        break;
                    default:
                        p[i][j]= Math.pow((Math.cbrt(Math.atan(Math.sin(x1))))/2,3);
                        break;
                }
            }
        }
        return p;
    }
    private static void printArrayp (double [][]p){
        System.out.println("Third array: ");
        for(double []p_i: p){
            for(double p_j: p_i){
                System.out.format("%.4f\t", p_j);
            }
            System.out.println("\n");
        }
    }
}
