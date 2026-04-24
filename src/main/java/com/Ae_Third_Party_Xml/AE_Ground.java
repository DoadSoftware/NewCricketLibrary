package com.Ae_Third_Party_Xml;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Ground")
public class AE_Ground {
	private String groundID;
    private String name;
    @XmlAttribute(name = "GroundID")
	public String getGroundID() {
		return groundID;
	}
	public void setGroundID(String groundID) {
		this.groundID = groundID;
	}
	@XmlAttribute(name = "Name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    
}