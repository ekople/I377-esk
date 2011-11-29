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
import java.util.Collection;
import javax.persistence.OneToMany;

@Entity
@RooToString
@RooEntity
@Table(name = "T_INTSIDENDI_LIIK")
public class INTSIDENDI_LIIK {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="INTSIDENDI_LIIK_ID", unique=true, nullable=false)
	private Long intsidendiLiikId;

	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)
    @DateTimeFormat(style="M-")
	@Column(nullable=false)
	private Date avatud;

	private String kommentaar;

	@Column(length=18)
	private String kood;

    @Temporal( TemporalType.DATE)
    @DateTimeFormat(style="M-")
	@Column(nullable=false)
	private Date muudetud;

	@Column(nullable=false, length=32)
	private String muutja;

	@Column(length=60)
	private String nimetus;

    @Temporal( TemporalType.DATE)
    @DateTimeFormat(style="M-")
	@Column(nullable=false)
	private Date suletud;

	@Column(length=32)
	private String sulgeja;

	@OneToMany(mappedBy = "iNTSIDENDI_LIIK_ID")
	private Collection<INTSIDENT> iNTSIDENT;

	public INTSIDENDI_LIIK() {
    	super();
    }
	
	public Long getIntsidendiLiikId() {
		return this.intsidendiLiikId;
	}

	public void setIntsidendiLiikId(Long intsidendiLiikId) {
		this.intsidendiLiikId = intsidendiLiikId;
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

	public Collection<INTSIDENT> getINTSIDENT() {
	    return iNTSIDENT;
	}

	public void setINTSIDENT(Collection<INTSIDENT> param) {
	    this.iNTSIDENT = param;
	}
	
}
