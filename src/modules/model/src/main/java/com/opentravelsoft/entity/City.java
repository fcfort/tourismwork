package com.opentravelsoft.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_city")
public class City implements java.io.Serializable {

  private String citycd;
  private Country country;
  private String citynm;
  private String cityen;
  private String province;
  private Character inOut;
  private Character ioCity;
  private char webKey;
  private Byte isDelete;
  private Set<Line> lines = new HashSet<Line>(0);
  private Set<Plan> plans = new HashSet<Plan>(0);
  private Set<Airport> airports = new HashSet<Airport>(0);

  public City() {
  }

  public City(String citycd, String citynm, char webKey) {
    this.citycd = citycd;
    this.citynm = citynm;
    this.webKey = webKey;
  }

  public City(String citycd, Country country, String citynm, String cityen,
      String province, Character inOut, Character ioCity, char webKey,
      Byte isDelete, Set<Line> lines, Set<Plan> plans, Set<Airport> airports) {
    this.citycd = citycd;
    this.country = country;
    this.citynm = citynm;
    this.cityen = cityen;
    this.province = province;
    this.inOut = inOut;
    this.ioCity = ioCity;
    this.webKey = webKey;
    this.isDelete = isDelete;
    this.lines = lines;
    this.plans = plans;
    this.airports = airports;
  }

  @Id
  @Column(name = "CITYCD", unique = true, nullable = false, length = 4)
  public String getCitycd() {
    return this.citycd;
  }

  public void setCitycd(String citycd) {
    this.citycd = citycd;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "COUNTRY")
  public Country getCountry() {
    return this.country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  @Column(name = "CITYNM", nullable = false, length = 20)
  public String getCitynm() {
    return this.citynm;
  }

  public void setCitynm(String citynm) {
    this.citynm = citynm;
  }

  @Column(name = "CITYEN", length = 20)
  public String getCityen() {
    return this.cityen;
  }

  public void setCityen(String cityen) {
    this.cityen = cityen;
  }

  @Column(name = "PROVINCE", length = 2)
  public String getProvince() {
    return this.province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  @Column(name = "IN_OUT", length = 1)
  public Character getInOut() {
    return this.inOut;
  }

  public void setInOut(Character inOut) {
    this.inOut = inOut;
  }

  @Column(name = "IO_CITY", length = 1)
  public Character getIoCity() {
    return this.ioCity;
  }

  public void setIoCity(Character ioCity) {
    this.ioCity = ioCity;
  }

  @Column(name = "WEB_KEY", nullable = false, length = 1)
  public char getWebKey() {
    return this.webKey;
  }

  public void setWebKey(char webKey) {
    this.webKey = webKey;
  }

  @Column(name = "IS_DELETE")
  public Byte getIsDelete() {
    return this.isDelete;
  }

  public void setIsDelete(Byte isDelete) {
    this.isDelete = isDelete;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
  public Set<Line> getLines() {
    return this.lines;
  }

  public void setLines(Set<Line> lines) {
    this.lines = lines;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
  public Set<Plan> getPlans() {
    return this.plans;
  }

  public void setPlans(Set<Plan> plans) {
    this.plans = plans;
  }

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
  public Set<Airport> getAirports() {
    return this.airports;
  }

  public void setAirports(Set<Airport> airports) {
    this.airports = airports;
  }

}
