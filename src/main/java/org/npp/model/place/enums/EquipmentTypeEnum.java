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
 * Types of equipment. * `bikeParking`: Bike parking. * `cashMachine`: Cash machine. * `copyMachineOrService`: A possibility to create copies of documents. * `defibrillator`: Medical equipment to provide first aid after heart attacks. * `dsrcReceiver`: A system to manage digital short range communication (radio beacon transceivers), e.g. for tolling roadside equipment. * `dumpingStation`: Possibility to get rid of sewerage (especially for motorhomes). * `electricChargingStation`: For charging vehicles, motorhome supply etc. The 'numberOf...' attribute specifies the number of charging stations. * `elevator`: Indication of the availability of elevators. * `faxMachineOrService`: A possibility to send and/or receive faxes. * `fireExtinguisher`: Fire extinguisher * `fireHose`: A hose for water transport in case of fire. * `fireHydrant`: Fire hydrant * `firstAidEquipment`: Equipment to support first aid on injured people. Note that 'defibrillator' is a separate literal. * `iceFreeScaffold`: A technical equipment to remove ice and snow from the roof of lorries. * `informationPoint`: An information point with employees. * `informationStele`: An unmanned information point. * `internetTerminal`: Public internet terminal. Charges may be specified using the TariffsAndPayment section. * `internetWireless`: Public wireless internet. Specifying an amount would be the number of hotspots/access points. Charges may be specified using the TariffsAndPayment section. * `luggageLocker`: Possibility to deposit luggage in a safe way. * `none`: None. * `other`: Some other equipment. Use 'otherSupplementalFacility' to specify it. * `paymentMachine`: A payment machine, for example a parking ticket machine. * `picnicFacilities`: Indication of whether any picnicking facilities, such as tables, chairs and shaded areas, are available. * `playground`: A playground for children. * `publicCardPhone`: Indicates, whether there's a public telephone available that can be used with a card. * `publicCoinPhone`: Indicates, whether there's a public telephone available that can be used with coins. * `publicPhone`: Indicates, whether there's a public telephone available. * `refuseBin`: Refuse bins for small amounts of garbage (see also 'wasteDisposal'). * `safeDeposit`: A possibility to store valuable possession in a safe way.  * `shelter`: A shelter (against wind, sun, ....). * `shower`: Indicates, whether there are shower facilities available. * `snowAndIceRemovalEquipme`: Equipment to remove snow and ice.nt * `toilet`: Indicates, whether there are toilets available. * `tollTerminal`: A terminal, where toll charges can be paid manually (this does not mean a toll gate on the road) * `tyreAirPressureEquipment`: Equipment to measure and refill tyre air pressure. * `unknown`: Unknown. * `vendingMachine`: A vending machine for snacks, coffee etc. (without manpower). * `wasteDisposal`: Possibility to get rid of waste in a legal way (e.g. for truckers or motorhomes). Normal refuse bins are not intended here. * `waterBasin`: A water basin to wash hands, clothes or dishes. * `waterSupply`: Supply of fresh water, e.g. for motorhomes. * `waterTap`: Fresh water out of a tap.
 */


public enum EquipmentTypeEnum {
  
  BIKEPARKING("bikeParking"),
  
  CASHMACHINE("cashMachine"),
  
  COPYMACHINEORSERVICE("copyMachineOrService"),
  
  DEFIBRILLATOR("defibrillator"),
  
  DSRCRECEIVER("dsrcReceiver"),
  
  DUMPINGSTATION("dumpingStation"),
  
  ELECTRICCHARGINGSTATION("electricChargingStation"),
  
  ELEVATOR("elevator"),
  
  FAXMACHINEORSERVICE("faxMachineOrService"),
  
  FIREEXTINGUISHER("fireExtinguisher"),
  
  FIREHOSE("fireHose"),
  
  FIREHYDRANT("fireHydrant"),
  
  FIRSTAIDEQUIPMENT("firstAidEquipment"),
  
  ICEFREESCAFFOLD("iceFreeScaffold"),
  
  INFORMATIONPOINT("informationPoint"),
  
  INFORMATIONSTELE("informationStele"),
  
  INTERNETTERMINAL("internetTerminal"),
  
  INTERNETWIRELESS("internetWireless"),
  
  LUGGAGELOCKER("luggageLocker"),
  
  NONE("none"),
  
  OTHER("other"),
  
  PAYMENTMACHINE("paymentMachine"),
  
  PICNICFACILITIES("picnicFacilities"),
  
  PLAYGROUND("playground"),
  
  PUBLICCARDPHONE("publicCardPhone"),
  
  PUBLICCOINPHONE("publicCoinPhone"),
  
  PUBLICPHONE("publicPhone"),
  
  REFUSEBIN("refuseBin"),
  
  SAFEDEPOSIT("safeDeposit"),
  
  SHELTER("shelter"),
  
  SHOWER("shower"),
  
  SNOWANDICEREMOVALEQUIPMENT("snowAndIceRemovalEquipment"),
  
  TOILET("toilet"),
  
  TOLLTERMINAL("tollTerminal"),
  
  TYREAIRPRESSUREEQUIPMENT("tyreAirPressureEquipment"),
  
  UNKNOWN("unknown"),
  
  VENDINGMACHINE("vendingMachine"),
  
  WASTEDISPOSAL("wasteDisposal"),
  
  WATERBASIN("waterBasin"),
  
  WATERSUPPLY("waterSupply"),
  
  WATERTAP("waterTap");

  private String value;

  EquipmentTypeEnum(String value) {
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
  public static EquipmentTypeEnum fromValue(String value) {
    for (EquipmentTypeEnum b : EquipmentTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

