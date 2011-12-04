package org.persistence;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;

@Entity
@RooToString
@RooEntity
@Table(name = "T_SEADUS")
public class SEADUS {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SEADUSE_ID", unique=true, nullable=false)
	private Long seaduseId;

	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)   @DateTimeFormat(style="M-") 
	@Column(nullable=false)
	private Date avatud;

	@Column(name="KEHTIV_ALATES", length=18)
	private String kehtivAlates;

	@Column(name="KEHTIV_KUNI", length=18)
	private String kehtivKuni;

	@Column(nullable=false, length=20)
	private String kommentaar;

	@Column(nullable=false, length=20)
	private String kood;

    @Temporal( TemporalType.DATE)   @DateTimeFormat(style="M-") 
	@Column(nullable=false)
	private Date muudetud;

	@Column(nullable=false, length=32)
	private String muutja;

	@Column(nullable=false, length=20)
	private String nimetus;

    @Temporal( TemporalType.DATE)   @DateTimeFormat(style="M-") 
	@Column(nullable=false)
	private Date suletud;

	@Column(length=32)
	private String sulgeja;

	@OneToMany(mappedBy = "sEADUS_ID")
	private Collection<SEADUSE_PUNKT> sEADUSE_PUNKT;

	public SEADUS() {
    	super();
    }

	public Long getSeaduseId() {
		return this.seaduseId;
	}

	public void setSeaduseId(Long seaduseId) {
		this.seaduseId = seaduseId;
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

	public String getKehtivAlates() {
		return this.kehtivAlates;
	}

	public void setKehtivAlates(String kehtivAlates) {
		this.kehtivAlates = kehtivAlates;
	}

	public String getKehtivKuni() {
		return this.kehtivKuni;
	}

	public void setKehtivKuni(String kehtivKuni) {
		this.kehtivKuni = kehtivKuni;
	}

	public String getKommentaar() {
		return this.kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
	}

	public String getKood() {
		return this.kood;
	}

	public void setKood(String kood) {
		this.kood = kood;
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

	public String getNimetus() {
		return this.nimetus;
	}

	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
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

	public Collection<SEADUSE_PUNKT> getSEADUSE_PUNKT() {
	    return sEADUSE_PUNKT;
	}

	public void setSEADUSE_PUNKT(Collection<SEADUSE_PUNKT> param) {
	    this.sEADUSE_PUNKT = param;
	}

}