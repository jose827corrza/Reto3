package com.company;

public class Autobus extends Vehiculo{
    //Atributos
    private boolean puertaAbierta = false;
    //Constructor


    public Autobus(String nombreConductor,int nMaximoPasajeros) {
        super(nombreConductor);
        this.setnMaximoPasajeros(nMaximoPasajeros);
    }

    //Metodos
    public void recogerPasajero(int estrato){
        if(getnPasajeros()<getnMaximoPasajeros()){
            if(isPuertaAbierta() == true) {
                setCantidadDinero(this.calcularPasaje(estrato) + getCantidadDinero());
                setnPasajeros(getnPasajeros() + 1);
            }
        }
    }

    @Override
    public void  gestionarMarcha(){
        if(isEnMarcha() == false && isPuertaAbierta() == false){
            setEnMarcha(true);
        }
        else{
            setEnMarcha(false);
        }
    }

    public void gestionarPuerta(){
        if(isPuertaAbierta() == false && isEnMarcha() == false){
            setPuertaAbierta(true);
        }
        else{
            setPuertaAbierta(false);
        }
    }

    public static double calcularPasaje(int estrato){
        double valor = 0;/*
        if(estrato ==0 || estrato ==1 || estrato ==2){//0,1,2==1500;3,4==2600;5,6==3000
            valor = 1500;
        }
        else if (estrato ==3 || estrato ==4){
            valor = 2600;
        }//ojo aca si bota error
        else if(estrato ==5 || estrato==6){
            valor = 3000;
        }*/
        switch(estrato){
            case 1:
                valor = 1500;
            case 2:
                valor = 1500;
            case 3:
                valor = 1500;
            case 4:
                valor = 2600;
            case 5:
                valor = 3000;
            case 6:
                valor = 3000;
        }
        return valor;
    }

    //Getters y Setters

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }
}
