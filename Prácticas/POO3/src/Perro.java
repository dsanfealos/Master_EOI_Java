public class Perro extends Animal{
    //Perro

    float altura;
    String colorPelo;
    String raza;
    String tipoPelo;



    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

    public void ladrar(){
        System.out.println("Guau, guau");
    }
    public void alimentarse(){
        System.out.println("Ñom, Ñom");
    }
    public void levantarParaOrinar(){
        System.out.println("Levanto y ya.");
    }
    public void sonido(){  //La O y la flechita indican un Override
        System.out.println("Guau, guau!");
    }
}
