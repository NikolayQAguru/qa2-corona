package stepdefs;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.WeatherResponse;
import org.junit.jupiter.api.Assertions;
import requesters.WeatherRequester;

import java.math.BigInteger;
import java.util.Map;

public class WeatherStepDefs {
    private int cityId;
    private WeatherResponse response;

    @Given("city id: {int}")
    public void set_city_id(int cityId){
        this.cityId = cityId;
    }

    @When("we are requesting weather data")
    public void request_weather() throws JsonProcessingException {
        WeatherRequester requester = new WeatherRequester();
        response = requester.requestWeather(cityId);


    }
    @Then("lon is: {double}")
    public void check_lon(double lon){
        Assertions.assertEquals(lon, response.getCoord().getLon(), "Wrong lon!");

    }
    @Then("lat is: {double}")
    public void check_lat(double lat){
        Assertions.assertEquals(lat, response.getCoord().getLat(), "Wrong lat!");

    }
    @Then("Weather conditions are:")
        public void weather_conditions(Map<String, String> params){
        Assertions.assertEquals(Integer.parseInt(params.get("id")), response.getWeathers().get(0).getId());
        Assertions.assertEquals();
        }
    @Then("Base: (.*)")
    public void base(String base){

    }
    @Then("Main weather parameters are:")
    public void main_weather_parameters_are(Map<String, String> params) {

    }
    @Then("Visibility is: {int}")
    public void visibility_data(int vis){

    }
    @Then("Wind parameters are:")
    public void wind_parameters(Map<String, String> params){

    }
    @Then("Clouds are: {int}")
    public  void clouds_coverage(int all){

    }
    @Then("Daytime is: {int}")
    public void daytime_duration(int dt){

    }
    @Then("System info:")
    public void system_information(Map<String, String> params){

    }
    @Then("ID: {int}")
    public void id(int ID){

    }
    @Then("City name is: (.*)")
    public void city_name(String cityname){

    }
    @Then("Cod is: {int}")
    public void cod(int cod){

    }

}
