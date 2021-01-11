package progect;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double[] quadraticRoots = quadraticSolution(1,12,3);
        double[] quadraticRoot = quadraticSolution(1,0,0);
        double[] withOutRoot = quadraticSolution(11,14,12);
        System.out.println(Arrays.toString(quadraticRoots));
        System.out.println(Arrays.toString(quadraticRoot));
        System.out.println(Arrays.toString(withOutRoot));

    }

    public static double[] quadraticSolution(int a,int b, int c){

        double[] rootsOfTheEquation = {-1.0, -1.0};
        if(a == 0){
            return rootsOfTheEquation;
        }

        double Discriminant = (b*b) - (4*a*c);

        if(Discriminant > 0){

            rootsOfTheEquation[0] = (-b - Math.sqrt(Discriminant)) / (2 * a);
            rootsOfTheEquation[1] = (-b + Math.sqrt(Discriminant)) / (2 * a);
        }else if(Discriminant == 0){

            rootsOfTheEquation[0] = -b / (2 * a);
            rootsOfTheEquation[1] = 0.0;
        }
        return rootsOfTheEquation;
    }

}
