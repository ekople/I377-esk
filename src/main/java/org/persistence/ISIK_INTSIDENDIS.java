package org.persistence;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import org.persistence.INTSIDENT;
import javax.persistence.ManyToOne;
import org.persistence.PIIRIRIKKUJA;

@Entity
@RooToString
@RooEntity
@Table(name = "T_ISIK_INTSIDENDIS")
public class ISIK_INTSIDENDIS {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ISIK_INTSIDENDIS_ID", unique=true, nullable=false)
	private Long isikIntsidendisId;

    @Temporal( TemporalType.DATE)  
    @DateTimeFormat(style="M-") 
	@Column(nullable=false)
	private Date alates;

	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)  
    @DateTimeFormat(style="M-") 
	@Column(nullable=false)
	private Date avatud;

	@Column(nullable=false)
	private String kirjeldus;

	private String kommentaar;

    @Temporal( TemporalType.DATE)  
    @DateTimeFormat(style="M-") 
	@Column(nullable=false)
	private Date kuni;

    @Temporal( TemporalType.DATE)   
    @DateTimeFormat(style="M-") 
	@Column(nullable=false)
	private Date muudetud;

	@Column(nullable=false, length=32)
	private String muutja;

    @Temporal( TemporalType.DATE)  
    @DateTimeFormat(style="M-") 
	@Column(nullable=false)
	private Date suletud;

	@Column(length=32)
	private String sulgeja;

	@ManyToOne
	private INTSIDENT iNTSIDENT_ID;

	@ManyToOne
	private PIIRIRIKKUJA pIIRIRIKKUJA_ID;

    public ISIK_INTSIDENDIS() {
    	super();
    }
    
	public Long getIsikIntsidendisId() {
		return this.isikIntsidendisId;
	}

	public void setIsikIntsidendisId(Long isikIntsidendisId) {
		this.isikIntsidendisId = isikIntsidendisId;
	}

	public Date getAlates() {
		return this.alates;
	}

	public void setAlates(Date alates) {
		this.alates = alates;
	}

	public String getAvaja() {
		return this.avaja;
	}

	public void setAvaja(String avaja) {
		this.avaja = avaja;
	}

	public Date getAvatud() {
		return this.avatud;
	}

	public void setAvatud(Date avatud) {
		this.avatud = avatud;
	}

	public String getKirjeldus() {
		return this.kirjeldus;
	}

	public void setKirjeldus(String kirjeldus) {
		this.kirjeldus = kirjeldus;
	}

	public String getKommentaar() {
		return this.kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
	}

	public Date getKuni() {
		return this.kuni;
	}

	public void setKuni(Date kuni) {
		this.kuni = kuni;
	}

	public Date getMuudetud() {
		return this.muudetud;
	}

	public void setMuudetud(Date muudetud) {
		this.muudetud = muudetud;
	}

	public String getMuutja() {
		return this.muutja;
	}

	public void setMuutja(String muutja) {
		this.muutja = muutja;
	}

	public Date getSuletud() {
		return this.suletud;
	}

	public void setSuletud(Date suletud) {
		this.suletud = suletud;
	}

	public String getSulgeja() {
		return this.sulgeja;
	}

	public void setSulgeja(String sulgeja) {
		this.sulgeja = sulgeja;
	}

	public INTSIDENT getINTSIDENT_ID() {
	    return iNTSIDENT_ID;
	}

	public void setINTSIDENT_ID(INTSIDENT param) {
	    this.iNTSIDENT_ID = param;
	}

	public PIIRIRIKKUJA getPIIRIRIKKUJA_ID() {
	    return pIIRIRIKKUJA_ID;
	}

	public void setPIIRIRIKKUJA_ID(PIIRIRIKKUJA param) {
	    this.pIIRIRIKKUJA_ID = param;
	}

}