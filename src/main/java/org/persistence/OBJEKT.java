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
import org.persistence.OBJEKT_INTSIDENDIS;
import java.util.Collection;
import javax.persistence.OneToMany;

@Entity
@RooToString
@RooEntity
@Table(name = "T_OBJEKT")
public class OBJEKT {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="OBJEKT_ID", unique=true, nullable=false)
	private Long objektId;

	@Column(nullable=false, length=32)
	private String avaja;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date avatud;

	private byte[] kommentaar;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date muudetud;

	@Column(nullable=false, length=32)
	private String muutja;

	@Column(length=100)
	private String nimetus;

    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	private Date suletud;

	@Column(length=32)
	private String sulgeja;

	@OneToMany(mappedBy = "oBJEKT_ID")
	private Collection<OBJEKT_INTSIDENDIS> oBJEKT_INTSIDENDIS;

	public OBJEKT() {
    	super();
    }
    
	public Long getObjektId() {
		return this.objektId;
	}

	public void setObjektId(Long objektId) {
		this.objektId = objektId;
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

	public byte[] getKommentaar() {
		return this.kommentaar;
	}

	public void setKommentaar(byte[] kommentaar) {
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

	public Collection<OBJEKT_INTSIDENDIS> getOBJEKT_INTSIDENDIS() {
	    return oBJEKT_INTSIDENDIS;
	}

	public void setOBJEKT_INTSIDENDIS(Collection<OBJEKT_INTSIDENDIS> param) {
	    this.oBJEKT_INTSIDENDIS = param;
	}

}