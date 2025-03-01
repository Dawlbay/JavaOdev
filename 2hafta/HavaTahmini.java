import java.time.LocalDateTime;

public class HavaTahmini {
    private String city;
    private double temperature;
    private int humidity;
    private double windSpeed;
    private String condition;
    private LocalDateTime forecastTime;

    public HavaTahmini(String city, double temperature, int humidity, double windSpeed, String condition, LocalDateTime forecastTime) {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.condition = condition;
        this.forecastTime = LocalDateTime.now();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public int getHumidity() {
        return humidity;
    }
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    public double getWindSpeed() {
        return windSpeed;
    }
    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }
    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    public LocalDateTime getForecastTime() {
        return forecastTime;
    }
    public void setForecastTime(LocalDateTime forecastTime) {
        this.forecastTime = forecastTime;
    }

    public String generateWeatherPrediction() {
        if(this.temperature < 4 && this.humidity > 70) {
            return "Snowy";
        }
        else if(this.temperature >= 5 && this.temperature <= 15 && this.humidity > 70) {
            return "Rainy";
        }
        else if(this.windSpeed > 20) {
            return "Windy";
        }
        else{
            return "Clear";
        }
    }
    public void updateWeatherPrediction(String city, double temperature, int humidity, double windSpeed, String condition, LocalDateTime forecastTime) {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.condition = condition;
        this.forecastTime = LocalDateTime.now();
    }
    public void displayWeather() {
        System.out.println("City: " + this.city);
        System.out.println("Temperature: " + this.temperature + "°C");
        System.out.println("Humidity: " + this.humidity + "%");
        System.out.println("Wind Speed: " + this.windSpeed + "km/h");
        System.out.println("Condition: " + this.condition);
        System.out.println("Forecast Time: " + this.forecastTime);
        System.out.println("Prediction: " + generateWeatherPrediction());
    }
    public static void main(String[] args) {
        HavaTahmini ist = new HavaTahmini("Istanbul", 25.0, 65, 19, "Clear", LocalDateTime.now());
        ist.displayWeather();
    }
}