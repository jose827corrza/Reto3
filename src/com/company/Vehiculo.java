package com.company;

import java.lang.Math.*;
public abstract class Vehiculo {
    //Atributos
    private String nombreConductor;
    private int nPasajeros = 0;
    private int nMaximoPasajeros;
    private double cantidadDinero = 0;
    private double localizacionX = 0;
    private double localizacionY = 0;
    private boolean aireAcondicionadoActivado = false;
    private boolean motorEncendido = false;
    private boolean wifiEncendido = false;
    private boolean enMarcha = false;

    //Constructor


    public Vehiculo(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    //Metodos
    public void dejarPasajero(){
        this.nPasajeros-=1;
    }

    public double calcularDistanciaAcopio(){
        double distancia = getLocalizacionX()*getLocalizacionX() + getLocalizacionY()*getLocalizacionY();
        distancia = Math.sqrt(distancia);
        return distancia;
    }

    public void gestionarAireAcondicionado(){
        if(motorEncendido==true && aireAcondicionadoActivado==false){
            this.aireAcondicionadoActivado = true;
        }
        else{
            this.aireAcondicionadoActivado = false;
        }

    }

    public void gestionarMotor(){
        if(isMotorEncendido() == false){
            setMotorEncendido(true);
        }
        else{
            setAireAcondicionadoActivado(false);
            setWifiEncendido(false);
            setEnMarcha(false);
            setMotorEncendido(false);
            /*this.aireAcondicionadoActivado = false;
            this.wifiEncendido = false;
            this.enMarcha = false;*/
        }
    }

    public void gestionarWifi(){
        if(isMotorEncendido() == true && isWifiEncendido() == false){
            this.wifiEncendido = true;
        }
        else{
            this.wifiEncendido = false;
        }
    }

    public abstract void gestionarMarcha();

    public void moverDerecha(double d){
        if(enMarcha ==true){
            this.localizacionX+=d;
        }
    }

    public void moverIzquierda(double d){
        if(enMarcha == true){
            this.localizacionX-=d;
        }
    }

    public void moverArriba(double d){
        if(enMarcha == true){
            this.localizacionY+=d;
        }
    }

    public void moverAbajo(double d){
        if(enMarcha == true){
            this.localizacionY-=d;
        }
    }

    //Setters y Getters

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public int getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }
}
