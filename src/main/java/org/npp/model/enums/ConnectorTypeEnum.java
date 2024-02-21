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
 * A table of commonly used connectors / charging interfaces * `cee3`: CEE3, 230 V, 16 A * `cee5`: CEE5, 400 V, 16-63 A * `chademo`: CHAdeMO, 600 V DC. Used mostly in Japan. * `domestic`: A domestic socket of unspecified type. Applicable countries should be specified in seperate attribute. * `domesticA`: Domestic socket type A (mainly used in the USA, Canada, Mexico & Japan) * `domesticB`: Domestic socket type B (mainly used in the USA, Canada & Mexico) * `domesticC`: Domestic socket type C (commonly used in Europe, South America & Asia) * `domesticD`: Domestic socket type D (mainly used in India) * `domesticE`: Domestic socket type E (primarily used in France, Belgium, Poland, Slovakia & Czechia) * `domesticF`: Domestic socket type F (used almost everywhere in Europe & Russia, except for the UK & Ireland) * `domesticG`: Domestic socket type G (mainly used in the United Kingdom, Ireland, Malta, Malaysia, Singapore & the Arabian Peninsula) * `domesticH`: Domestic socket type H (used exclusively in Israel, the West Bank & the Gaza Strip) * `domesticI`: Domestic socket type I (mainly used in Australia, New Zealand, China & Argentina) * `domesticJ`: Domestic socket type J (used almost exclusively in Switzerland & Liechtenstein) * `domesticK`: Domestic socket type K (used almost exclusively in Denmark & Greenland) * `domesticL`: Domestic socket type L (used almost exclusively in Italy & Chile) * `domesticM`: Domestic socket type M (mainly used in South Africa) * `domesticN`: Domestic socket type N (used in Brazil and South Africa) * `domesticO`: Domestic socket type O (used exclusively in Thailand) * `iec60309x2single16`:  IEC 60309-2 Industrial Connector single phase 16 amperes (usually blue) * `iec60309x2three16`: IEC 60309-2 Industrial Connector three phase 16 amperes (usually red) * `iec60309x2three32`: IEC 60309-2 Industrial Connector three phase 32 amperes (usually red) * `iec60309x2three64`: IEC 60309-2 Industrial Connector three phase 64 amperes (usually red) * `iec62196T1`: IEC 62196 Type 1 \"SAE J1772\".  Mostly used in USA and Asia. * `iec62196T1COMBO`: Combo Type 1 based, DC * `iec62196T2`: IEC 62196 Type 2 \"Mennekes\" - 400 V, 16-63 A. Mandatory in Europe * `iec62196T2COMBO`: Combo Type 2 based, DC, Type 2 connector with extension for simultaneous DC-charging * `iec62196T3A`: IEC 62196 Type 3A * `iec62196T3C`: \" IEC 62196 Type 3C \"\"Scame\"\"  \" * `other`: Other charging interface. * `pantographBottomUp`: On-board Bottom-up-Pantograph typically for bus charging * `pantographTopDown`: Off-board Top-down-Pantograph typically for bus charging * `teslaConnectorAmerica`: Tesla connector used in America (Tesla specific) * `teslaConnectorEurope`: Tesla Connector EU (modification of the Type 2 connector) * `teslaR`: Tesla Connector \"Roadster\"-type (round, 4 pin) * `teslaS`: Tesla Connector \"Model-S\"-type (oval, 5 pin) * `yazaki`: Yazaki, 400 VDC, 125 A, Asian standard.
 */


public enum ConnectorTypeEnum {
  
  CEE3("cee3"),
  
  CEE5("cee5"),
  
  CHADEMO("chademo"),
  
  DOMESTIC("domestic"),
  
  DOMESTICA("domesticA"),
  
  DOMESTICB("domesticB"),
  
  DOMESTICC("domesticC"),
  
  DOMESTICD("domesticD"),
  
  DOMESTICE("domesticE"),
  
  DOMESTICF("domesticF"),
  
  DOMESTICG("domesticG"),
  
  DOMESTICH("domesticH"),
  
  DOMESTICI("domesticI"),
  
  DOMESTICJ("domesticJ"),
  
  DOMESTICK("domesticK"),
  
  DOMESTICL("domesticL"),
  
  DOMESTICM("domesticM"),
  
  DOMESTICN("domesticN"),
  
  DOMESTICO("domesticO"),
  
  IEC60309X2SINGLE16("iec60309x2single16"),
  
  IEC60309X2THREE16("iec60309x2three16"),
  
  IEC60309X2THREE32("iec60309x2three32"),
  
  IEC60309X2THREE64("iec60309x2three64"),
  
  IEC62196T1("iec62196T1"),
  
  IEC62196T1COMBO("iec62196T1COMBO"),
  
  IEC62196T2("iec62196T2"),
  
  IEC62196T2COMBO("iec62196T2COMBO"),
  
  IEC62196T3A("iec62196T3A"),
  
  IEC62196T3C("iec62196T3C"),
  
  OTHER("other"),
  
  PANTOGRAPHBOTTOMUP("pantographBottomUp"),
  
  PANTOGRAPHTOPDOWN("pantographTopDown"),
  
  TESLACONNECTORAMERICA("teslaConnectorAmerica"),
  
  TESLACONNECTOREUROPE("teslaConnectorEurope"),
  
  TESLAR("teslaR"),
  
  TESLAS("teslaS"),
  
  YAZAKI("yazaki");

  private String value;

  ConnectorTypeEnum(String value) {
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
  public static ConnectorTypeEnum fromValue(String value) {
    for (ConnectorTypeEnum b : ConnectorTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

