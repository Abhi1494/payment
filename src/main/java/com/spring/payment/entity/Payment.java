package com.spring.payment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serial;
import java.io.Serializable;


@Entity
@Table(name="PAYMENT")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Payment implements Serializable {

    /**
     * 
     */
    @Serial
    private static final long serialVersionUID = 3296997524757262572L;
    @Id
    @GeneratedValue
    private int id;
    private String status;
    private String transactionId;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public Payment(int id, String status, String transactionId) {
	super();
	this.id = id;
	this.status = status;
	this.transactionId = transactionId;
    }
    
    public Payment() {
    
}
}
