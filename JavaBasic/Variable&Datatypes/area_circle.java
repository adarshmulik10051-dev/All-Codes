package JavaBasic.VariableAndDatatypes;
import java . util.*;
public class area_circle {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a radius:");
        float radius = sc.nextFloat();
        float pie=3.14f;
        float area = (int) pie * (radius*radius);
        System.out.print(area);
    }
}
