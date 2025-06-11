package aluracursosScreenmatch;

public class titulo {

    private  String nombre_pelicula;
    private String fecha_estreno;
    private int duracion;
    private boolean disponible;
    private  double sumaEvaluaciones;
    private int TotalEvaluaciones;


    public String getnombre_pelicula(){
        return nombre_pelicula;
    }

    public void setnombre_pelicula(String nombre_pelicula){
        this.nombre_pelicula = nombre_pelicula;
    }

    public void setduracion(int duracion){
        this.duracion = duracion;
    }

    public void setdisponible(boolean disponible){
        this.disponible = disponible;
    }

    public void  setfecha_estreno(String fecha_estreno){
        this.fecha_estreno = fecha_estreno;
    }


    public int getDuracionMinutos(){
        return duracion;
    }


    public double  getsumaEvaluaciones(){
        return  sumaEvaluaciones;
    }
    public int getTotalEvaluaciones(){
        return TotalEvaluaciones;
    }

    public void mostrarFichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + nombre_pelicula + " y se estrenará el " + fecha_estreno + " y tiene una duración de " + getDuracionMinutos() + " minutos.");
        System.out.println("¿Está disponible? " + (disponible ? "Sí" : "No"));
        
    }

    public void evalua (double nota){

        sumaEvaluaciones += nota;
        TotalEvaluaciones++;
    }

    public double getcalcularMedia (){
        return sumaEvaluaciones / TotalEvaluaciones;
    }

}
