package org.npp.model.place.enums;
  
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A service facility. In distinction to equipment, a service is usually manned. * `bikeGarage`: A place where bikes are repaired. * `bikeSharing`: Bike Sharing. * `cafe`: Cafe. * `carWash`: Car wash. * `docstop`: The site is part of the Docstop project, http://www.docstoponline.eu, which means medical assistance for professional drivers. * `foodShopping`: Food shopping. * `hotel`: A hotel. * `kiosk`: Kiosk. * `laundry`: A possibility for washing clothes (might also be a laundromat with coins). * `leisureActivities`: There are leisure activities offered on the site or in the very near surrounding. Use the additional description attribute to give details. * `medicalFacility`: Medical facility. * `motel`: Hotel located aside a motorway. * `motorcycleGarage`: A place where motorcycles are repaired. * `motorwayRestaurant`: Restaurant located on a motorway rest area. * `motorwayRestaurantSmall`: Smaller type of restaurant located on a motorway rest area. Might be with limited offers. * `other`: Some other service facility. Use 'otherEquipmentOrServiceFacility' to specify it. * `overnightAccommodation`: An accommodation to stay overnight. * `payDesk`: A manned possibility to pay. * `petrolStation`: Indicates whether it is possible to get petrol. * `pharmacy`: Pharmacy. * `police`: Indicates whether a police station is on site or very close. * `restaurant`: Restaurant. * `restaurantSelfService`: A restaurant where people arrange and fetch their meal themselves, this might enclose a buffet. * `shop`: A shop of unspecified kind. * `snackBar`: A snack bar. * `sparePartsShopping`: Spare parts shopping. * `touristInformation`: Tourist information with employees. * `truckRepair`: Truck repair. * `truckWash`: Truck wash. * `tyreRepair`: A tyre repair service. * `unknown`: Unknown. * `vehicleMaintenance`: Garage repair service. 
 */


public enum ServiceFacilityTypeEnum {
  
  BIKEGARAGE("bikeGarage"),
  
  BIKESHARING("bikeSharing"),
  
  CAFE("cafe"),
  
  CARWASH("carWash"),
  
  DOCSTOP("docstop"),
  
  FOODSHOPPING("foodShopping"),
  
  HOTEL("hotel"),
  
  KIOSK("kiosk"),
  
  LAUNDRY("laundry"),
  
  LEISUREACTIVITIES("leisureActivities"),
  
  MEDICALFACILITY("medicalFacility"),
  
  MOTEL("motel"),
  
  MOTORCYCLEGARAGE("motorcycleGarage"),
  
  MOTORWAYRESTAURANT("motorwayRestaurant"),
  
  MOTORWAYRESTAURANTSMALL("motorwayRestaurantSmall"),
  
  OTHER("other"),
  
  OVERNIGHTACCOMMODATION("overnightAccommodation"),
  
  PAYDESK("payDesk"),
  
  PETROLSTATION("petrolStation"),
  
  PHARMACY("pharmacy"),
  
  POLICE("police"),
  
  RESTAURANT("restaurant"),
  
  RESTAURANTSELFSERVICE("restaurantSelfService"),
  
  SHOP("shop"),
  
  SNACKBAR("snackBar"),
  
  SPAREPARTSSHOPPING("sparePartsShopping"),
  
  TOURISTINFORMATION("touristInformation"),
  
  TRUCKREPAIR("truckRepair"),
  
  TRUCKWASH("truckWash"),
  
  TYREREPAIR("tyreRepair"),
  
  UNKNOWN("unknown"),
  
  VEHICLEMAINTENANCE("vehicleMaintenance");

  private String value;

  ServiceFacilityTypeEnum(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ServiceFacilityTypeEnum fromValue(String value) {
    for (ServiceFacilityTypeEnum b : ServiceFacilityTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

