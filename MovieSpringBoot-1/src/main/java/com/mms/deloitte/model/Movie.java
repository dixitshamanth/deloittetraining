package com.mms.deloitte.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="hr",name="Product1")
public class Movie {
@Id
private int productId;
@Column
private String productName;

@Column
private int quantity;
@Column
private int price;

public class Movie {

}
