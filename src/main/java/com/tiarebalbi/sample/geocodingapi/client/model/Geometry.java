package com.tiarebalbi.sample.geocodingapi.client.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Geometry", propOrder = {
  "location",
  "locationType",
  "viewport",
  "bounds"
})
public class Geometry {

  @XmlElement(required = true)
  protected Location location;
  @JacksonXmlProperty(localName = "location_type")
  protected LocationType locationType;
  @XmlElement(required = true)
  protected Viewport viewport;
  @XmlElement(required = true)
  protected Viewport bounds;

  /**
   * Gets the value of the location property.
   *
   * @return possible object is
   * {@link Location }
   */
  public Location getLocation() {
    return location;
  }

  /**
   * Sets the value of the location property.
   *
   * @param value allowed object is
   *              {@link Location }
   */
  public void setLocation(Location value) {
    this.location = value;
  }

  /**
   * Gets the value of the locationType property.
   *
   * @return possible object is
   * {@link LocationType }
   */
  public LocationType getLocationType() {
    return locationType;
  }

  /**
   * Sets the value of the locationType property.
   *
   * @param value allowed object is
   *              {@link LocationType }
   */
  public void setLocationType(LocationType value) {
    this.locationType = value;
  }

  /**
   * Gets the value of the viewport property.
   *
   * @return possible object is
   * {@link Viewport }
   */
  public Viewport getViewport() {
    return viewport;
  }

  /**
   * Sets the value of the viewport property.
   *
   * @param value allowed object is
   *              {@link Viewport }
   */
  public void setViewport(Viewport value) {
    this.viewport = value;
  }

  /**
   * Gets the value of the bounds property.
   *
   * @return possible object is
   * {@link Viewport }
   */
  public Viewport getBounds() {
    return bounds;
  }

  /**
   * Sets the value of the bounds property.
   *
   * @param value allowed object is
   *              {@link Viewport }
   */
  public void setBounds(Viewport value) {
    this.bounds = value;
  }

  public boolean hasLocation() {
    return location != null;
  }
}
