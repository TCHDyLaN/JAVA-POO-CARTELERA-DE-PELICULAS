package aluracursosScreenmatch;

public class serie extends titulo {

    int temporadas;
    int episodiosporTemporada;
    int minutosPorEpisodio;


    public int getTemporadas(){
        return temporadas;
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }


    public int getEpisodiosporTemporada() {
        return episodiosporTemporada;
    }


    public void setEpisodiosporTemporada(int episodiosporTemporada){
            this.episodiosporTemporada= episodiosporTemporada;
    }



    public int getDuracionMinutos(){
        return temporadas * episodiosporTemporada * minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio){
        this.minutosPorEpisodio = minutosPorEpisodio;
    }


}