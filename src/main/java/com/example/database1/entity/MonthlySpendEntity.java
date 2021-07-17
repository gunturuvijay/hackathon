package com.example.database1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="monthlyspend")
public class MonthlySpendEntity {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    int id;
	    String month;
	    String totaloutgoing;
	    String totalincoming;
	    String closingbalance;
	    String customernumer; 
	    
	    
	    public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getMonth() {
	        return month;
	    }
	    public void setMonth(String month) {
	        this.month = month;
	    }
	    public String getCustomernumber() {
	        return totaloutgoing;
	    }
	    public void setCustomernumber(String customernumber) {
	        this.totaloutgoing = customernumber;
	    }
	    public String getTotalincoming() {
	        return totalincoming;
	    }
	    public void setTotalincoming(String totalincoming) {
	        this.totalincoming = totalincoming;
	    }
	    public String getClosingbalance() {
	        return closingbalance;
	    }
	    public void setClosingbalance(String closingbalance) {
	        this.closingbalance = closingbalance;
	    }
		public String getTotaloutgoing() {
			return totaloutgoing;
		}
		public void setTotaloutgoing(String totaloutgoing) {
			this.totaloutgoing = totaloutgoing;
		}
		public String getCustomernumer() {
			return customernumer;
		}
		public void setCustomernumer(String customernumer) {
			this.customernumer = customernumer;
		}
	    
	    
	    

}
