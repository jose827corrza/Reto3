package com.company;

public class Taxi extends Vehiculo {
    //Atributos
    private double distanciaRecorrida = 0;
    private boolean segurosActivados = false;




//Constructor


    public Taxi(String nombreConductor) {
        super(nombreConductor);setnMaximoPasajeros(1);
    }

    //Metodos
    public void reiniciarTaximetro(){
        setDistanciaRecorrida(0);
    }

    public void presionarBotonPanico(){

        //setMotorEncendido(false);
        setSegurosActivados(false);
        setnPasajeros(getnPasajeros()-1);
        setEnMarcha(false);
        //deja pasajero sin cobro
    }

    @Override
    public void dejarPasajero(){
        if(isEnMarcha() == false && isSegurosActivados() == false && getnPasajeros() ==1){
            //if(getnPasajeros() == 1 && isSegurosActivados() == false){
            setnPasajeros(getnPasajeros()-1);
            setCantidadDinero(this.calcularPasaje()+getCantidadDinero());
            reiniciarTaximetro();

        }

    }

    public void recogerPasajero(){
        if(getnPasajeros()<1) {
            setnPasajeros(getnPasajeros()+1);

        }
    }

    public void gestionarSeguros(){
        if(isEnMarcha() == false && isSegurosActivados() == true){
            setSegurosActivados(false);
        }
        else{
            setSegurosActivados(true);
        }
    }

    public double calcularPasaje(){
        double dinero =0;
        dinero = 3000 + 2300*getDistanciaRecorrida();
        return dinero;
    }

    @Override
    public void moverDerecha(double d){
        if(isEnMarcha() == true){
            setLocalizacionX(getLocalizacionX()+d);
            if(getnPasajeros() == 1){
                setDistanciaRecorrida(getDistanciaRecorrida()+d);
            }
        }
    }

    @Override
    public void moverIzquierda(double d){
        if(isEnMarcha() == true){
            setLocalizacionX(getLocalizacionX()-d);
            if(getnPasajeros() == 1){
                setDistanciaRecorrida(getDistanciaRecorrida()+d);
            }
        }
    }

    @Override
    public void moverArriba(double d){
        if(isEnMarcha() == true){
            setLocalizacionY(getLocalizacionY()+d);
            if(getnPasajeros() == 1){
                setDistanciaRecorrida(getDistanciaRecorrida()+d);
            }
        }
    }

    @Override
    public void moverAbajo(double d){
        if(isEnMarcha() == true){
            setLocalizacionY(getLocalizacionY()-d);
            if(getnPasajeros() == 1){
                setDistanciaRecorrida(getDistanciaRecorrida()+d);
            }
        }
    }

    @Override
    public void gestionarMarcha(){
        if(isEnMarcha() == false && isSegurosActivados() == true){
            setEnMarcha(true);
        }
        else{
            setEnMarcha(false);
        }
    }

    //Setters y Getters

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public boolean isSegurosActivados() {
        return segurosActivados;
    }

    public void setSegurosActivados(boolean segurosActivados) {
        this.segurosActivados = segurosActivados;
    }


}
