package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.transaction.Transactional;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Transactional
public class OrderUser {

	@Id
	int orderid;
	String username;
	String useraddress;
	String useremail;
	
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "orderdatetime", nullable = false, updatable = false)
    @CreationTimestamp
    private Date orderdatetime;
	
	boolean order_received;
	boolean order_accepted;
	boolean order_outfordelivery;
	boolean order_delivered;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "orderdelivereddatetime", nullable = true)
    private Date orderdelivereddatetime;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "orderreceiveddatetime", nullable = true)
    private Date orderreceiveddatetime;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "orderaccepteddatetime", nullable = true)
    private Date orderaccepteddatetime;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "orderoutfordeliverydatetime", nullable = true)
    private Date orderoutfordeliverydatetime;

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public Date getOrderdatetime() {
		return orderdatetime;
	}

	public void setOrderdatetime(Date orderdatetime) {
		this.orderdatetime = orderdatetime;
	}

	public boolean isOrder_received() {
		return order_received;
	}

	public void setOrder_received(boolean order_received) {
		this.order_received = order_received;
	}

	public boolean isOrder_accepted() {
		return order_accepted;
	}

	public void setOrder_accepted(boolean order_accepted) {
		this.order_accepted = order_accepted;
	}

	public boolean isOrder_outfordelivery() {
		return order_outfordelivery;
	}

	public void setOrder_outfordelivery(boolean order_outfordelivery) {
		this.order_outfordelivery = order_outfordelivery;
	}

	public boolean isOrder_delivered() {
		return order_delivered;
	}

	public void setOrder_delivered(boolean order_delivered) {
		this.order_delivered = order_delivered;
	}

	public Date getOrderdelivereddatetime() {
		return orderdelivereddatetime;
	}

	public void setOrderdelivereddatetime(Date orderdelivereddatetime) {
		this.orderdelivereddatetime = orderdelivereddatetime;
	}
	
	public Date getOrderreceiveddatetime() {
		return orderreceiveddatetime;
	}

	public void setOrderreceiveddatetime(Date orderreceiveddatetime) {
		this.orderreceiveddatetime = orderreceiveddatetime;
	}

	public Date getOrderaccepteddatetime() {
		return orderaccepteddatetime;
	}

	public void setOrderaccepteddatetime(Date orderaccepteddatetime) {
		this.orderaccepteddatetime = orderaccepteddatetime;
	}

	public Date getOrderoutfordeliverydatetime() {
		return orderoutfordeliverydatetime;
	}

	public void setOrderoutfordeliverydatetime(Date orderoutfordeliverydatetime) {
		this.orderoutfordeliverydatetime = orderoutfordeliverydatetime;
	}

	@Override
	public String toString() {
		return "OrderUser [orderid=" + orderid + ", username=" + username + ", useraddress=" + useraddress
				+ ", useremail=" + useremail + ", orderdatetime=" + orderdatetime + ", order_received=" + order_received
				+ ", order_accepted=" + order_accepted + ", order_outfordelivery=" + order_outfordelivery
				+ ", order_delivered=" + order_delivered + ", orderdelivereddatetime=" + orderdelivereddatetime + "]";
	}
	
	
}
