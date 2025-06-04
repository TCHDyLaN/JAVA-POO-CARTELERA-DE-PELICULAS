import aluracursosScreenmatch.pelicula;
import aluracursosScreenmatch.serie;

public class Principal {
    public static void main(String[] args) {
        pelicula miPelicula = new pelicula();
        miPelicula.setnombre_pelicula("Encanto");
        miPelicula.setduracion(110);
        miPelicula.setfecha_estreno("10/06/2025");
        miPelicula.setdisponible(false);



        miPelicula.evalua(7.8);
        miPelicula.evalua(8.5);
        miPelicula.evalua(10.4);

        System.out.println(miPelicula.getsumaEvaluaciones());
        System.out.println(miPelicula.getcalcularMedia());
        

        serie casaDragon = new serie();
        casaDragon.setnombre_pelicula("La casa del dragón");
        casaDragon.setfecha_estreno("01/01/2023");
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(45);
        casaDragon.setEpisodiosporTemporada(10);

        System.out.println("La serie de la  " + casaDragon.getnombre_pelicula() + " tiene una duración de " + casaDragon.getDuracionMinutos() + " minutos.");

        casaDragon.mostrarFichaTecnica();











        // pelicula otraPelicula = new pelicula();
        // otraPelicula.nombre_pelicula = "Matrix";
        // otraPelicula.fecha_estreno = "13/06/2025";
        // otraPelicula.duracion = 120;
        // otraPelicula.disponible= true;

        //otraPelicula.mostrarFichaTecnica();



        // System.out.println("Mi otra pelicula es: " + otraPelicula.nombre_pelicula + " y se estrenará el " + otraPelicula.fecha_estreno);
    }
}
