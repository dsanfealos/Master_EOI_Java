package ClasesInternas;

public class ClaseExterna {
    int x = 10;
    int y = 5;
    Vector miVector = new Vector(4,5);
    Vector tuVector = new Vector(2,3);

    public void moduloVector (Vector a){
        System.out.println("módulo = " + (Math.sqrt(Math.pow(a.x,2) +Math.pow(a.y,2))));
    }

    class Vector{  //clase interna. la uso para crear atributos en mi clase externa.
        int x ; //Son distintos de los de la clase externa
        int y;

        public Vector(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private class Interna1{
        int k = 23;
    }

    static class InternaStatic{
        int j = 89;
    }
}
