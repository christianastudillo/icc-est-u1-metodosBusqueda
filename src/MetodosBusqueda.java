public class MetodosBusqueda {
    public int busquedaSecuencial(int[] arreglo, int valorBuscar){
        //int pos = -1;
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Comparacion: "+i);

            if (arreglo[i] == valorBuscar) {
                //pos = i;
                return i;
            }
        }
        //return pos;
        return -1;
    }
    public int busquedaBinaria(int[] arr, int value){
        int inicio = 0;
        int fin = arr.length -1;
        int cont = 0 ;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            cont++;
            System.out.println("Contador Binario: " + cont);
            if (arr[medio] == value) {
                
                //Elemento encontrado
                return medio;
            }
            if (arr[medio] < value) {
                inicio = medio + 1;//Buscar en la midad de la derecha 
            }else{
                fin = medio - 1;//Buscar en la midad de la izquierda 
            }
        }

        return -1;
    }

    public void printArreglo(int[] arreglo){
        for (int elem : arreglo) {
            System.out.print(elem + " ");
        }
    }
}
