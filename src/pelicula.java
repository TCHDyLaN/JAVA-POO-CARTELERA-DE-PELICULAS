public class pelicula {
    String nombre_pelicula;
    String fecha_estreno;
    int duracion;
    boolean disponible;
    private  double sumaEvaluaciones;
    private int TotalEvaluaciones;

    double  getsumaEvaluaciones(){
        return  sumaEvaluaciones;
    }
    int getTotalEvaluaciones(){
        return TotalEvaluaciones;
    }

    void mostrarFichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + nombre_pelicula + " y se estrenará el " + fecha_estreno);
    }

    void evalua (double nota){

        sumaEvaluaciones += nota;
        TotalEvaluaciones++;
    }

    double calcularMedia (){
        return sumaEvaluaciones / TotalEvaluaciones;
    }

}
