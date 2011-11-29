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

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import org.persistence.SEADUS;
import javax.persistence.ManyToOne;
import org.persistence.PIIRIVALVURI_SEADUS_INTSIDENDI;
import java.util.Collection;
import javax.persistence.OneToMany;


@Entity
@RooToString
@RooEntity
@Table(name = "T_SEADUSE_PUNKT")
public class SEADUSE_PUNKT {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SEADUSE_PUNKT_ID", unique=true, nullable=false)
	private Long seadusePunktId;

	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date avatud;

	@Column(name="KEHTIV_ALATES", length=18)
	private String kehtivAlates;

	@Column(name="KEHTIV_KUNI", length=18)
	private String kehtivKuni;

	@Column(length=18)
	private String kommentaar;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date muudetud;

	@Column(nullable=false, length=32)
	private String muutja;

	@Column(length=18)
	private String pais;

	@Column(length=18)
	private String paragrahv;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date suletud;

	@Column(length=32)
	private String sulgeja;

	@Column(length=18)
	private String tekst;

	@ManyToOne
	private SEADUS sEADUS_ID;

	@OneToMany(mappedBy = "sEADUSE_PUNKT_ID")
	private Collection<PIIRIVALVURI_SEADUS_INTSIDENDI> pIIRIVALVURI_SEADUS_INTSIDENDI;

	public SEADUSE_PUNKT() {
    	super();
    }

	public Long getSeadusePunktId() {
		return this.seadusePunktId;
	}

	public void setSeadusePunktId(Long seadusePunktId) {
		this.seadusePunktId = seadusePunktId;
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

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getParagrahv() {
		return this.paragrahv;
	}

	public void setParagrahv(String paragrahv) {
		this.paragrahv = paragrahv;
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

	public String getTekst() {
		return this.tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public SEADUS getSEADUS_ID() {
	    return sEADUS_ID;
	}

	public void setSEADUS_ID(SEADUS param) {
	    this.sEADUS_ID = param;
	}

	public Collection<PIIRIVALVURI_SEADUS_INTSIDENDI> getPIIRIVALVURI_SEADUS_INTSIDENDI() {
	    return pIIRIVALVURI_SEADUS_INTSIDENDI;
	}

	public void setPIIRIVALVURI_SEADUS_INTSIDENDI(Collection<PIIRIVALVURI_SEADUS_INTSIDENDI> param) {
	    this.pIIRIVALVURI_SEADUS_INTSIDENDI = param;
	}

}