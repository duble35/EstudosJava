package Array;
public class Array{
    public static void main(String[] args){
        arrayNumeros();
        arrayString();
    }


    private static void arrayNumeros(){
        int[] contador = new int[5];
        contador[0] = 1;
        contador[1] = 2;
        contador[2] = 3;
        contador[3] = 4;
        contador[4] = 5;
        for(int i = 0; i<contador.length;i++){
            System.out.println(contador[i]);
        }
    }

    private static void arrayString(){
        String[]escritor = new String[5];
        escritor[0] = "Texto 01";
        escritor[1] = "Texto 02";
        escritor[2] = "Texto 03";
        escritor[3] = "Texto 04";
        escritor[4] = "Texto 05";
        for(int i = 0; i<escritor.length;i++){
            System.out.println(escritor[i]);
        }
    }

}