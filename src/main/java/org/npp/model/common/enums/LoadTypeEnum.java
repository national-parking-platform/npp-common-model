package org.npp.model.common.enums;
  
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
 * * `abnormalLoad`: A load that exceeds normal vehicle dimensions in terms of height, length, width, gross vehicle weight or axle weight or any combination of these. Generally termed an \"abnormal load\". * `ammunition`: Ammunition. * `chemicals`: Chemicals of unspecified type. * `combustibleMaterials`: Combustible materials of unspecified type. * `corrosiveMaterials`: Corrosive materials of unspecified type. * `debris`: Debris of unspecified type. * `empty`: No load. * `explosiveMaterials`: Explosive materials of unspecified type. * `extraHighLoad`: A load of exceptional height. * `extraLongLoad`: A load of exceptional length. * `extraWideLoad`: A load of exceptional width. * `fuel`: Fuel of unspecified type. * `glass`: Glass. * `goods`: Any goods of a commercial nature. * `hazardousMaterials`: Materials classed as being of a hazardous nature. * `liquid`: Liquid of an unspecified nature. * `livestock`: Livestock. * `materials`: General materials of unspecified type. * `materialsDangerousForPeople`: Materials classed as being of a danger to people or animals. * `materialsDangerousForTheEnvironment`: Materials classed as being potentially dangerous to the environment. * `materialsDangerousForWater`: Materials classed as being dangerous when exposed to water (e.g. materials which may react exothermically with water). * `oil`: Oil. * `ordinary`: Materials that present limited environmental or health risk. Non-combustible, non-toxic, non-corrosive. * `other`: Other than as defined in this enumeration. * `perishableProducts`: Products or produce that will significantly degrade in quality or freshness over a short period of time. * `petrol`: Petrol or petroleum. * `pharmaceuticalMaterials`: Pharmaceutical materials. * `radioactiveMaterials`: Materials that emit significant quantities of electro-magnetic radiation that may present a risk to people, animals or the environment. * `refrigeratedGoods`: Refrigerated goods. * `refuse`: Refuse. * `toxicMaterials`: Materials of a toxic nature which may damage the environment or endanger public health. * `vehicles`: Vehicles of any type which are being transported.
 */


public enum LoadTypeEnum {
  
  ABNORMALLOAD("abnormalLoad"),
  
  AMMUNITION("ammunition"),
  
  CHEMICALS("chemicals"),
  
  COMBUSTIBLEMATERIALS("combustibleMaterials"),
  
  CORROSIVEMATERIALS("corrosiveMaterials"),
  
  DEBRIS("debris"),
  
  EMPTY("empty"),
  
  EXPLOSIVEMATERIALS("explosiveMaterials"),
  
  EXTRAHIGHLOAD("extraHighLoad"),
  
  EXTRALONGLOAD("extraLongLoad"),
  
  EXTRAWIDELOAD("extraWideLoad"),
  
  FUEL("fuel"),
  
  GLASS("glass"),
  
  GOODS("goods"),
  
  HAZARDOUSMATERIALS("hazardousMaterials"),
  
  LIQUID("liquid"),
  
  LIVESTOCK("livestock"),
  
  MATERIALS("materials"),
  
  MATERIALSDANGEROUSFORPEOPLE("materialsDangerousForPeople"),
  
  MATERIALSDANGEROUSFORTHEENVIRONMENT("materialsDangerousForTheEnvironment"),
  
  MATERIALSDANGEROUSFORWATER("materialsDangerousForWater"),
  
  OIL("oil"),
  
  ORDINARY("ordinary"),
  
  OTHER("other"),
  
  PERISHABLEPRODUCTS("perishableProducts"),
  
  PETROL("petrol"),
  
  PHARMACEUTICALMATERIALS("pharmaceuticalMaterials"),
  
  RADIOACTIVEMATERIALS("radioactiveMaterials"),
  
  REFRIGERATEDGOODS("refrigeratedGoods"),
  
  REFUSE("refuse"),
  
  TOXICMATERIALS("toxicMaterials"),
  
  VEHICLES("vehicles");

  private String value;

  LoadTypeEnum(String value) {
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
  public static LoadTypeEnum fromValue(String value) {
    for (LoadTypeEnum b : LoadTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

