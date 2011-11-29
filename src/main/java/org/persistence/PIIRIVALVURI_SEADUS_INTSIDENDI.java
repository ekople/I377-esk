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
import org.persistence.SEADUSE_PUNKT;
import javax.persistence.ManyToOne;
import org.persistence.PIIRIVALVUR_INTSIDENDIS;


@Entity
@RooToString
@RooEntity
@Table(name = "T_PIIRIVALVURI_SEADUS_INTSIDENDI")
public class PIIRIVALVURI_SEADUS_INTSIDENDI {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PIIRIVALVURI_SEADUS_INTSIDENDI", unique=true, nullable=false)
	private Long piirivalvuriSeadusIntsidendi;

    @Temporal( TemporalType.DATE)   @DateTimeFormat(style="M-") 
	@Column(nullable=false)
	private Date alates;

	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)   @DateTimeFormat(style="M-") 
	@Column(nullable=false)
	private Date avatud;

	@Column(nullable=false)
	private String kirjeldus;

	private String kommentaar;

    @Temporal( TemporalType.DATE)   @DateTimeFormat(style="M-") 
	@Column(nullable=false)
	private Date kuni;

    @Temporal( TemporalType.DATE)   @DateTimeFormat(style="M-") 
	@Column(nullable=false)
	private Date muudetud;

	@Column(nullable=false, length=32)
	private String muutja;

    @Temporal( TemporalType.DATE)   @DateTimeFormat(style="M-") 
	@Column(nullable=false)
	private Date suletud;

	@Column(length=32)
	private String sulgeja;

	@ManyToOne
	private SEADUSE_PUNKT sEADUSE_PUNKT_ID;

	@ManyToOne
	private PIIRIVALVUR_INTSIDENDIS pIIRIVALVUR_INTSIDENDIS_ID;
	
    public PIIRIVALVURI_SEADUS_INTSIDENDI() {
    	super();
    }

	public Long getPiirivalvuriSeadusIntsidendi() {
		return this.piirivalvuriSeadusIntsidendi;
	}

	public void setPiirivalvuriSeadusIntsidendi(Long piirivalvuriSeadusIntsidendi) {
		this.piirivalvuriSeadusIntsidendi = piirivalvuriSeadusIntsidendi;
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

	public SEADUSE_PUNKT getSEADUSE_PUNKT_ID() {
	    return sEADUSE_PUNKT_ID;
	}

	public void setSEADUSE_PUNKT_ID(SEADUSE_PUNKT param) {
	    this.sEADUSE_PUNKT_ID = param;
	}

	public PIIRIVALVUR_INTSIDENDIS getPIIRIVALVUR_INTSIDENDIS_ID() {
	    return pIIRIVALVUR_INTSIDENDIS_ID;
	}

	public void setPIIRIVALVUR_INTSIDENDIS_ID(PIIRIVALVUR_INTSIDENDIS param) {
	    this.pIIRIVALVUR_INTSIDENDIS_ID = param;
	}
	
}