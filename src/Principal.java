public class Principal {
    public static void main(String[] args) {
        pelicula miPelicula = new pelicula();
        miPelicula.nombre_pelicula = "Encanto";
        miPelicula.duracion = 110;
        miPelicula.fecha_estreno= "10/06/2025";
        miPelicula.disponible = false;



        miPelicula.mostrarFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(8.5);

        System.out.println(miPelicula.sumaEvaluaciones);
        System.out.println(miPelicula.TotalEvaluaciones);
        System.out.println(miPelicula.calcularMedia());

        pelicula otraPelicula = new pelicula();
        otraPelicula.nombre_pelicula = "Matrix";
        otraPelicula.fecha_estreno = "13/06/2025";
        otraPelicula.duracion = 120;
        otraPelicula.disponible= true;

        //otraPelicula.mostrarFichaTecnica();

        System.out.println();

        System.out.println("Mi otra pelicula es: " + otraPelicula.nombre_pelicula + " y se estrenará el " + otraPelicula.fecha_estreno);
    }
}
