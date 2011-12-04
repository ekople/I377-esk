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
import org.persistence.VAHTKOND;
import javax.persistence.ManyToOne;
import org.persistence.PIIRIVALVUR;


@Entity
@RooToString
@RooEntity
@Table(name = "T_VAHTKONNA_LIIGE")
public class VAHTKONNA_LIIGE {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="VAHTKONNA_LIIGE_ID", unique=true, nullable=false)
	private Long vahtkonna_liige_id;
	
	@Column(nullable=false, length=32)
	private String alates;
	
	@Column(nullable=false, length=32)
	private String kuni;
	
	@Column(nullable=false, length=32)
	private String kommentaar;
	
	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)   @DateTimeFormat(style="M-") 
	@Column(nullable=false)
	private Date avatud;
    
	@Column(nullable=false, length=32)
	private String muutja;

    @Temporal( TemporalType.DATE)   @DateTimeFormat(style="M-") 
	@Column(nullable=false)
	private Date muudetud;

	@Column(length=32)
	private String sulgeja;

    @Temporal( TemporalType.DATE)   @DateTimeFormat(style="M-") 
	@Column(nullable=false)
	private Date suletud;

	@ManyToOne
	private VAHTKOND vAHTKOND;

	@ManyToOne
	private PIIRIVALVUR pIIRIVALVUR;

	public Long getVahtkonna_liige_id() {
		return vahtkonna_liige_id;
	}

	public void setVahtkonna_liige_id(Long id) {
		this.vahtkonna_liige_id = id;
	}

	public void setAlates(String param) {
		this.alates = param;
	}

	public String getAlates() {
		return alates;
	}

	public void setKuni(String param) {
		this.kuni = param;
	}

	public String getKuni() {
		return kuni;
	}

	public void setKommentaar(String param) {
		this.kommentaar = param;
	}

	public String getKommentaar() {
		return kommentaar;
	}

	public void setAvaja(String param) {
		this.avaja = param;
	}

	public String getAvaja() {
		return avaja;
	}

	public void setAvatud(Date param) {
		this.avatud = param;
	}

	public Date getAvatud() {
		return avatud;
	}

	public void setMuutja(String param) {
		this.muutja = param;
	}

	public String getMuutja() {
		return muutja;
	}

	public void setMuudetud(Date param) {
		this.muudetud = param;
	}

	public Date getMuudetud() {
		return muudetud;
	}

	public void setSulgeja(String param) {
		this.sulgeja = param;
	}

	public String getSulgeja() {
		return sulgeja;
	}

	public void setSuletud(Date param) {
		this.suletud = param;
	}

	public Date getSuletud() {
		return suletud;
	}

	public VAHTKOND getVAHTKOND() {
	    return vAHTKOND;
	}

	public void setVAHTKOND(VAHTKOND param) {
	    this.vAHTKOND = param;
	}

	public PIIRIVALVUR getPIIRIVALVUR() {
	    return pIIRIVALVUR;
	}

	public void setPIIRIVALVUR(PIIRIVALVUR param) {
	    this.pIIRIVALVUR = param;
	}

}