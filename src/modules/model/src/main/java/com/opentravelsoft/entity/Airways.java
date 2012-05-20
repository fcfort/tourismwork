package com.opentravelsoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_airways")
public class Airways implements java.io.Serializable {

  private String code;
  private String name;
  private String fullname;
  private String contact;
  private String phoneNumber;
  private Byte isActive;

  public Airways() {
    this.isActive = 1;
  }

  public Airways(String code, String name) {
    this.code = code;
    this.name = name;
  }

  public Airways(String code, String name, String fullname, String contact,
      String phoneNumber, Byte isActive) {
    this.code = code;
    this.name = name;
    this.fullname = fullname;
    this.contact = contact;
    this.phoneNumber = phoneNumber;
    this.isActive = isActive;
  }

  @Id
  @Column(name = "CODE", unique = true, nullable = false, length = 2)
  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  @Column(name = "NAME", nullable = false, length = 20)
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Column(name = "FULLNAME", length = 40)
  public String getFullname() {
    return this.fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  @Column(name = "CONTACT", length = 20)
  public String getContact() {
    return this.contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  @Column(name = "PHONE_NUMBER", length = 20)
  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Column(name = "IS_ACTIVE")
  public Byte getIsActive() {
    return this.isActive;
  }

  public void setIsActive(Byte isActive) {
    this.isActive = isActive;
  }

}
