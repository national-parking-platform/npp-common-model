package org.npp.model.enums;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * * `agriculturalVehicle`: Vehicle normally used for agricultural purposes (e.g. tractor, combined harvester). * `anyVehicle`: Vehicle of any type. * `articulatedBus`: Articulated bus * `articulatedTrolleyBus`: Articulated trolley bus * `articulatedVehicle`: Articulated vehicle. * `bicycle`: Bicycle. * `bus`: Bus. * `car`: Vehicles designed and constructed for the carriage of passengers and comprising no more than eight seats (in addition to the driver seat), and having a maximum mass (technically permissible maximum laden mass) not exceeding 3.5 tons (M1). * `caravan`: Caravan. * `carOrLightVehicle`: Car or light vehicle. * `carWithCaravan`: Car towing a caravan. * `carWithTrailer`: Car towing a trailer. * `constructionOrMaintenanceVehicle`: Vehicle normally used for construction or maintenance purposes (e.g. digger, excavator, bulldozer, lorry mounted crane) * `fourWheelDrive`: Four wheel drive vehicle. * `heavyDutyTransporter`: A transporter for heavy duty (usually with abnormal dimensions). * `heavyGoodsVehicle`: Vehicles with a total weight above 3,500 kg (vehicle and load). * `heavyGoodsVehicleWithTrailer`: Heavy goods vehicle with trailer * `heavyVehicle`: Vehicle whose weight means it should be classed as a heavy vehicle * `highSidedVehicle`: High sided vehicle. * `largeCar`: Large car * `largeGoodsVehicle`: Vehicles for the carriage of goods and having a maximum mass exceeding 3.5 tonnes (belonging to class N2 when not exceeding 12 tonnes, otherwise class N3). * `lightCommercialVehicle`: Vehicles for the carriage of goods and having a maximum mass not exceeding 3.5 tonnes (class N1). * `lightCommercialVehicleWithTrailer`: Light goods vehicle with trailer * `longHeavyLorry`: A heavy lorry that is longer than normal. * `lorry`: Lorry of any type. * `metro`: Metro * `minibus`: Vehicles designed and constructed for the carriage of passengers, comprising more than eight seats (in addition to the driver seat), and having a maximum mass not exceeding 5 tonnes (class M2). * `moped`: Moped (a two wheeled motor vehicle characterized by a small engine typically less than 50cc and by normally having pedals). * `motorcycle`: Motorcycle. * `motorcycleWithSideCar`: Three wheeled vehicle comprising a motorcycle with an attached side car. * `motorhome`: Motorhome * `motorscooter`: Motorscooter (a two wheeled motor vehicle characterized by a step-through frame and small diameter wheels). * `other`: Other than as defined in this enumeration. * `passengerCar`: Passenger car * `smallCar`: Small car * `tanker`: Vehicle with large tank for carrying bulk liquids. * `threeWheeledVehicle`: Three wheeled vehicle of unspecified type. * `trailer`: Trailer. * `tram`: Tram. * `trolleyBus`: Trolley bus * `twoWheeledVehicle`: Two wheeled vehicle of unspecified type. * `unknown`: Unknown. * `van`: Van. * `vehicleWithCaravan`: Vehicle (of unspecified type) towing a caravan. * `vehicleWithCatalyticConverter`: Vehicle with catalytic converter. * `vehicleWithoutCatalyticConverter`: Vehicle without catalytic converter. * `vehicleWithTrailer`: Vehicle (of unspecified type) towing a trailer. * `withEvenNumberedRegistrationPlates`: Vehicle with even numbered registration plate. * `withOddNumberedRegistrationPlates`: Vehicle with odd numbered registration plate.
 */


public enum VehicleTypeEnum {
  
  AGRICULTURALVEHICLE("agriculturalVehicle"),
  
  ANYVEHICLE("anyVehicle"),
  
  ARTICULATEDBUS("articulatedBus"),
  
  ARTICULATEDTROLLEYBUS("articulatedTrolleyBus"),
  
  ARTICULATEDVEHICLE("articulatedVehicle"),
  
  BICYCLE("bicycle"),
  
  BUS("bus"),
  
  CAR("car"),
  
  CARAVAN("caravan"),
  
  CARORLIGHTVEHICLE("carOrLightVehicle"),
  
  CARWITHCARAVAN("carWithCaravan"),
  
  CARWITHTRAILER("carWithTrailer"),
  
  CONSTRUCTIONORMAINTENANCEVEHICLE("constructionOrMaintenanceVehicle"),
  
  FOURWHEELDRIVE("fourWheelDrive"),
  
  HEAVYDUTYTRANSPORTER("heavyDutyTransporter"),
  
  HEAVYGOODSVEHICLE("heavyGoodsVehicle"),
  
  HEAVYGOODSVEHICLEWITHTRAILER("heavyGoodsVehicleWithTrailer"),
  
  HEAVYVEHICLE("heavyVehicle"),
  
  HIGHSIDEDVEHICLE("highSidedVehicle"),
  
  LARGECAR("largeCar"),
  
  LARGEGOODSVEHICLE("largeGoodsVehicle"),
  
  LIGHTCOMMERCIALVEHICLE("lightCommercialVehicle"),
  
  LIGHTCOMMERCIALVEHICLEWITHTRAILER("lightCommercialVehicleWithTrailer"),
  
  LONGHEAVYLORRY("longHeavyLorry"),
  
  LORRY("lorry"),
  
  METRO("metro"),
  
  MINIBUS("minibus"),
  
  MOPED("moped"),
  
  MOTORCYCLE("motorcycle"),
  
  MOTORCYCLEWITHSIDECAR("motorcycleWithSideCar"),
  
  MOTORHOME("motorhome"),
  
  MOTORSCOOTER("motorscooter"),
  
  OTHER("other"),
  
  PASSENGERCAR("passengerCar"),
  
  SMALLCAR("smallCar"),
  
  TANKER("tanker"),
  
  THREEWHEELEDVEHICLE("threeWheeledVehicle"),
  
  TRAILER("trailer"),
  
  TRAM("tram"),
  
  TROLLEYBUS("trolleyBus"),
  
  TWOWHEELEDVEHICLE("twoWheeledVehicle"),
  
  UNKNOWN("unknown"),
  
  VAN("van"),
  
  VEHICLEWITHCARAVAN("vehicleWithCaravan"),
  
  VEHICLEWITHCATALYTICCONVERTER("vehicleWithCatalyticConverter"),
  
  VEHICLEWITHOUTCATALYTICCONVERTER("vehicleWithoutCatalyticConverter"),
  
  VEHICLEWITHTRAILER("vehicleWithTrailer"),
  
  WITHEVENNUMBEREDREGISTRATIONPLATES("withEvenNumberedRegistrationPlates"),
  
  WITHODDNUMBEREDREGISTRATIONPLATES("withOddNumberedRegistrationPlates");

  private String value;

  VehicleTypeEnum(String value) {
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
  public static VehicleTypeEnum fromValue(String value) {
    for (VehicleTypeEnum b : VehicleTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

