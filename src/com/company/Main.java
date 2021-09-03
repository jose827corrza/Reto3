package com.company;




public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("holandas");
        Taxi taxi = new Taxi("Pepe");
        taxi.gestionarMotor();
        taxi.gestionarMarcha();
        taxi.recogerPasajero();
        taxi.getnMaximoPasajeros();//
        taxi.gestionarMarcha();
        taxi.recogerPasajero();
        taxi.moverArriba(10);
        taxi.moverDerecha(12);
        taxi.gestionarSeguros();
        taxi.moverAbajo(10);
        taxi.moverIzquierda(13);
        taxi.gestionarAireAcondicionado();
        taxi.gestionarWifi();
        taxi.gestionarMotor();
        taxi.presionarBotonPanico();
        taxi.calcularDistanciaAcopio();


        /*
        Autobus bus = new Autobus("Pepe",30);
        bus.recogerPasajero(2);
        bus.gestionarPuerta();
        bus.gestionarMarcha();
        bus.recogerPasajero(2);
        bus.gestionarMarcha();
        bus.gestionarPuerta();
        bus.moverArriba(2);
        bus.moverDerecha(5);
        bus.gestionarWifi();
        bus.gestionarAireAcondicionado();
        bus.gestionarMotor();
        bus.moverIzquierda(2);
        imprimirB(bus);
        */


        imprimirT(taxi);
    }
    public static void imprimirB(Autobus ve){
        System.out.println(ve.getNombreConductor());
        System.out.println(ve.getnPasajeros());
        System.out.println(ve.getCantidadDinero());
        System.out.println(ve.getnMaximoPasajeros());
        System.out.println(ve.getLocalizacionX());
        System.out.println(ve.getLocalizacionY());
        System.out.println(ve.isPuertaAbierta());
        System.out.println(ve.isAireAcondicionadoActivado());
        System.out.println(ve.isMotorEncendido());
        System.out.println(ve.isWifiEncendido());
        System.out.println(ve.isEnMarcha());
    }

    public static void imprimirT(Taxi ve){
        System.out.println(ve.getNombreConductor());
        System.out.println(ve.getnPasajeros());
        System.out.println(ve.getCantidadDinero());
        System.out.println(ve.getnMaximoPasajeros());
        System.out.println(ve.getLocalizacionX());
        System.out.println(ve.getLocalizacionY());
        System.out.println(ve.isAireAcondicionadoActivado());
        System.out.println(ve.isMotorEncendido());
        System.out.println(ve.isWifiEncendido());
        System.out.println(ve.isEnMarcha());
        System.out.println(ve.getDistanciaRecorrida());
        System.out.println(ve.isSegurosActivados());

    }
}
