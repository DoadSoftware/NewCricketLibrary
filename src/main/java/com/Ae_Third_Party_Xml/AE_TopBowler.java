package com.Ae_Third_Party_Xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Player")
@XmlAccessorType(XmlAccessType.FIELD)
public class AE_TopBowler {

	@XmlAttribute(name="ID")
	private Integer ID;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}
	
}
