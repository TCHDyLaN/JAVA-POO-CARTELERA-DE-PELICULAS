import aluracursosScreenmatch.pelicula;

public class Principal {
    public static void main(String[] args) {
        pelicula miPelicula = new pelicula();
        miPelicula.setnombre_pelicula("Encanto");
        miPelicula.setduracion(110);
        miPelicula.setfecha_estreno("10/06/2025");
        miPelicula.setdisponible(false);



        miPelicula.mostrarFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(8.5);
        miPelicula.evalua(10.4);

        System.out.println(miPelicula.getsumaEvaluaciones());
        System.out.println(miPelicula.getcalcularMedia());
        










        // pelicula otraPelicula = new pelicula();
        // otraPelicula.nombre_pelicula = "Matrix";
        // otraPelicula.fecha_estreno = "13/06/2025";
        // otraPelicula.duracion = 120;
        // otraPelicula.disponible= true;

        //otraPelicula.mostrarFichaTecnica();



        // System.out.println("Mi otra pelicula es: " + otraPelicula.nombre_pelicula + " y se estrenará el " + otraPelicula.fecha_estreno);
    }
}
