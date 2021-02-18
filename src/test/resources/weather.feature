Feature: Weather API

  Scenario: Weather data for city by ID
    Given city id: 524901
    When we are requesting weather data
    Then lon is: 145.77
    And lat is: -16.92

    And Weather conditions are:
    |id|802|
    |main|Clouds|
    |description|scattered clouds|
    |icon|03n|

    And Base: stations
    And Main weather parameters are:
      | temp     | 300.15 |
      | pressure | 1007   |
      | humidity | 74     |
      | temp_min | 300.15 |
      | temp_max | 300.15 |
    And Visibility is: 10000
    And Wind parameters are:
      | speed | 3.6 |
      | deg   | 160 |
    And Clouds are: 40
    And Daytime is: 1485790200
    And System info:
      | type    | 1          |
      | id      | 8166       |
      | message | 0.2064     |
      | country | AU         |
      | sunrise | 1485720272 |
      | sunset  | 1485766550 |
    And ID: 2172797
    And City name is: Cairns
    And Cod is: 200




