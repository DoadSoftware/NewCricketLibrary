package com.Ae_Third_Party_Xml;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "Speed")
public class AE_Ball_Speed {
	private String unit;
    private Double values;

    @XmlAttribute
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    @XmlValue
	public  Double getValues() {
		return values;
	}

	public void setValues( Double values) {
		this.values = values;
	}

    
    

}