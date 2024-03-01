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
 * ISO 3166-2 subdivison types * `administrativeAtoll`: Administrative atoll * `administrativeRegion`: Administrative region * `administrativeTerritory`: Administrative territory * `arcticRegion`: Arctic region * `autonomousCity`: Autonomous city * `autonomousCityInNorthAfrica`: Autonomous city in North Africa * `autonomousCommunity`: Autonomous community * `autonomousDistrict`: Autonomous district * `autonomousProvince`: Autonomous province * `autonomousRegion`: Autonomous region * `canton`: Canton * `capitalCity`: Capital city * `city`: City * `cityMunicipality`: City municipality * `cityOfCountyRight`: City of county right * `commune`: Commune * `councilArea`: Council area * `country`: Country * `county`: County * `department`: Department * `dependency`: Dependency * `district`: District * `districtMunicipality`: District municipality * `districtWithSpecialStatus`: District with special status * `entity`: Entity * `geographicalEntity`: Geographical entity * `governorate`: Governorate * `laender`: Länder * `localCouncil`: Local Council * `londonBorough`: London borough * `metropolitanArea`: Metropolitan area * `metropolitanDepartment`: Metropolitan department * `metropolitanDistrict`: Metropolitan district * `metropolitanRegion`: Metropolitan region * `municipality`: Municipality * `other`: Other * `overseasDepartment`: Overseas department * `overseasRegion`: Overseas region * `overseasTerritorialCollectivity`: Overseas territorial collectivity * `parish`: Parish * `province`: Province * `quarter`: Quarter * `region`: Region * `republic`: Republic * `republicanCity`: Republic city * `selfGovernedPart`: Self-governed part * `specialMunicipality`: Special Municipality * `state`: State * `territorialUnit`: Territorial unit * `territory`: Territory * `twoTierCounty`: Two tier country * `unitaryAuthority`: Unitary Authority * `ward`: Ward
 */


public enum SubdivisionTypeEnum {
  
  ADMINISTRATIVEATOLL("administrativeAtoll"),
  
  ADMINISTRATIVEREGION("administrativeRegion"),
  
  ADMINISTRATIVETERRITORY("administrativeTerritory"),
  
  ARCTICREGION("arcticRegion"),
  
  AUTONOMOUSCITY("autonomousCity"),
  
  AUTONOMOUSCITYINNORTHAFRICA("autonomousCityInNorthAfrica"),
  
  AUTONOMOUSCOMMUNITY("autonomousCommunity"),
  
  AUTONOMOUSDISTRICT("autonomousDistrict"),
  
  AUTONOMOUSPROVINCE("autonomousProvince"),
  
  AUTONOMOUSREGION("autonomousRegion"),
  
  CANTON("canton"),
  
  CAPITALCITY("capitalCity"),
  
  CITY("city"),
  
  CITYMUNICIPALITY("cityMunicipality"),
  
  CITYOFCOUNTYRIGHT("cityOfCountyRight"),
  
  COMMUNE("commune"),
  
  COUNCILAREA("councilArea"),
  
  COUNTRY("country"),
  
  COUNTY("county"),
  
  DEPARTMENT("department"),
  
  DEPENDENCY("dependency"),
  
  DISTRICT("district"),
  
  DISTRICTMUNICIPALITY("districtMunicipality"),
  
  DISTRICTWITHSPECIALSTATUS("districtWithSpecialStatus"),
  
  ENTITY("entity"),
  
  GEOGRAPHICALENTITY("geographicalEntity"),
  
  GOVERNORATE("governorate"),
  
  LAENDER("laender"),
  
  LOCALCOUNCIL("localCouncil"),
  
  LONDONBOROUGH("londonBorough"),
  
  METROPOLITANAREA("metropolitanArea"),
  
  METROPOLITANDEPARTMENT("metropolitanDepartment"),
  
  METROPOLITANDISTRICT("metropolitanDistrict"),
  
  METROPOLITANREGION("metropolitanRegion"),
  
  MUNICIPALITY("municipality"),
  
  OTHER("other"),
  
  OVERSEASDEPARTMENT("overseasDepartment"),
  
  OVERSEASREGION("overseasRegion"),
  
  OVERSEASTERRITORIALCOLLECTIVITY("overseasTerritorialCollectivity"),
  
  PARISH("parish"),
  
  PROVINCE("province"),
  
  QUARTER("quarter"),
  
  REGION("region"),
  
  REPUBLIC("republic"),
  
  REPUBLICANCITY("republicanCity"),
  
  SELFGOVERNEDPART("selfGovernedPart"),
  
  SPECIALMUNICIPALITY("specialMunicipality"),
  
  STATE("state"),
  
  TERRITORIALUNIT("territorialUnit"),
  
  TERRITORY("territory"),
  
  TWOTIERCOUNTY("twoTierCounty"),
  
  UNITARYAUTHORITY("unitaryAuthority"),
  
  WARD("ward");

  private String value;

  SubdivisionTypeEnum(String value) {
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
  public static SubdivisionTypeEnum fromValue(String value) {
    for (SubdivisionTypeEnum b : SubdivisionTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

