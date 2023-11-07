package arreglosbidimencionales;
public class ArregoDeLetras {
    public static void main(String[] args) {
        
        char [][] letras = new char [3][5];        
        char  letra = 'a';
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                letras[i][j] = letra;
                letra++;
            }
        }
 
        //Imprimir
        for (int i = 0; i < 3; i++) {            //Control de filas
            for (int j = 0; j < 5; j++) {        //Control de columnas
                System.out.print(letras[i][j]+" ");
            }
            System.out.println();
        }
    }
}

