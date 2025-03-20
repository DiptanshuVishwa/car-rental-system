package cars;

public class Car {
    private String car_Id;
    private String brand;
    private String model;
    private double basePricePerDay;
    private boolean isAvailable;
    public Car(String car_Id,String brand,String model,double basePricePerDay){
        this.car_Id = car_Id;
        this.brand = brand;
        this.model = model;
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = true;
    }
    public String getCarId(){
        return car_Id;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public double calculatePrice(int rentalDays){
        return basePricePerDay * rentalDays;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void rent(){
        isAvailable = false;
    }
    public void returnCar(){
        isAvailable = true;
    }
}
