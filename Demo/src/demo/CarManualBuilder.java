/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author sp21-bse-040
 */
public class CarManualBuilder implements Builder{
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;
    public void setType(Type type) {
        this.type = type;
    }
    
    /**
     *
     * @param type
     */
    
public void setSeats(int seats) {
        this.seats = seats;
    }
public void setEngine(Engine engine) {
        this.engine = engine;
    }
public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }
public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }
public Manual getResult() {
       return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}


