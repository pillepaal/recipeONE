package com.pilleriina.main.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recipe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int recID;

	@Column
	private String recName;

	@Column
	private String recIng;

	@Column
	private int cookTime;

	
	
	public Recipe() {
		super();
	}
	
	public Recipe(int recID, String recName, String recIng, int cookTime) {
		super();
		this.recID = recID;
		this.recName = recName;
		this.recIng = recIng;
		this.cookTime = cookTime;
	}
	
	

	public void setRecID(int recID) {
		this.recID = recID;
	}

	public String getRecName() {
		return recName;
	}

	public void setRecName(String recName) {
		this.recName = recName;
	}

	public String getRecIng() {
		return recIng;
	}

	public void setRecIng(String recIng) {
		this.recIng = recIng;
	}

	public int getCookTime() {
		return cookTime;
	}

	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}

	@Override
	public String toString() {
		return "Recipe [recID=" + recID + ", recName=" + recName + ", recIng=" + recIng + ", cookTime=" + cookTime
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recipe other = (Recipe) obj;
		return cookTime == other.cookTime && recID == other.recID && Objects.equals(recIng, other.recIng)
				&& Objects.equals(recName, other.recName);
	}


}
